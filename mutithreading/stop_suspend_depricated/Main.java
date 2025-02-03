package stop_suspend_depricated;

//public class Main {
//
//	public static void main(String[] args) throws InterruptedException{
//		SharedResource resource = new SharedResource();
//		
//		System.out.println("Main thread started");
//
//		Thread th1 = new Thread(() -> {
//			System.out.println("Thread1 calling produce method");
//			resource.produce();
//		});
//
//		Thread th2 = new Thread(() -> {
//			try{
//				Thread.sleep(1000);
//			}catch (Exception e) {
//				
//			}
//		System.out.println("Thread2 calling produce method");
//		resource.produce();
//		
//		});
//		
//		th1.start();
//		th2.start();
//		
//		try{
//			Thread.sleep(3000);
//		}catch (Exception e) {
//			System.out.println(e);
//		}
//		
//		System.out.println("Thread1 is suspended");
//		th1.suspend();
//		System.out.println("MainThread is finishing its work!");
//	}
//	
//}
//
////Output
////Main thread started
////Thread1 calling produce method
////Lock acquired
////Thread2 calling produce method
////Thread1 is suspended
////MainThread is finishing its work!



public class Main {

	public static void main(String[] args) throws InterruptedException{
		SharedResource resource = new SharedResource();
		
		System.out.println("Main thread started");

		Thread th1 = new Thread(() -> {
			System.out.println("Thread1 calling produce method");
			resource.produce();
		});

		Thread th2 = new Thread(() -> {
			try{
				Thread.sleep(1000);
			}catch (Exception e) {
				
			}
		System.out.println("Thread2 calling produce method");
		resource.produce();
		
		});
		
		th1.start();
		th2.start();
		
		try{
			Thread.sleep(3000);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Thread1 is suspended");
		th1.suspend();
		
		try{
			Thread.sleep(3000);
		}catch (Exception e) {
			System.out.println(e);
		}
		th1.resume();
		System.out.println("MainThread is finishing its work!");
	}
	
}

//Output
//Main thread started
//Thread1 calling produce method
//Lock acquired
//Thread2 calling produce method
//Thread1 is suspended
//MainThread is finishing its work!
//Lock release
//Lock acquired
//Lock release
