package monitor_lock;

public class MonitorThread1 implements Runnable{

	MonitorLockExample monitorLockExample;
	
	public MonitorThread1(MonitorLockExample monitorLockExample) {
		this.monitorLockExample = monitorLockExample;
	}
	
	@Override
	public void run() {
		monitorLockExample.task1();
	}

}
