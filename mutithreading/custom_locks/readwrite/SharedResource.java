package custom_locks.readwrite;

import java.util.concurrent.locks.ReadWriteLock;

//ReadLock: More than 1 thread can acquire the read lock
//WriteLock: Only 1 thread can acquire the write lock.
//SharedLock : only read (any thread has Shared Lock, at that time another thread take lock and shared the value)
//ExclusiveLock : Read & Write(apply only when there is no Shared or Exclusive Lock) 

public class SharedResource {
	boolean isAvailable = false;

	public void producer(ReadWriteLock lock) {
		try {
			lock.readLock().lock();
			System.out.println("Read Lock acquired by: " + Thread.currentThread().getName());
			isAvailable = true;
			Thread.sleep(8000);
		} catch (Exception e) {
		} finally {
			lock.readLock().unlock();
			System.out.println("Read Lock release by: " + Thread.currentThread().getName());
		}
	}

	public void consune(ReadWriteLock lock) {
		try {
			lock.writeLock().lock();
			System.out.println("Write Lock acquired by: " + Thread.currentThread().getName());
			isAvailable = false;
		} catch (Exception e) {

		} finally {
			lock.writeLock().unlock();
			System.out.println("Write Lock release by: " + Thread.currentThread().getName());
		}
	}
}
