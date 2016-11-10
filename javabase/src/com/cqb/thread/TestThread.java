package com.cqb.thread;

class TestThread extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {

			System.out.println(
					Thread.currentThread().getName() + Thread.currentThread().getPriority() + " : " + "正在执行 " + i);
			/*
			 * if(i%2==0){ Thread.currentThread().yield(); }
			 */
			/*
			 * try { Thread.currentThread().sleep(1000); } catch
			 * (InterruptedException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 */

		}
	}

	public static void main(String[] args) {
		TestThread testThread = new TestThread();
		testThread.setName("子线程： ");
		testThread.setPriority(testThread.MAX_PRIORITY);
		testThread.start();
		Thread.currentThread().setName("主线程： ");
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + Thread.currentThread().getPriority() + " : " + "正在执行 "
					+ i); /*
							 * if(i%2!=0){ Thread.currentThread().yield(); }
							 */
			/*
			 * if (i == 5) { try { testThread.join();
			 * //Thread.currentThread().join(); } catch (InterruptedException e)
			 * { // TODO Auto-generated catch block e.printStackTrace(); } }
			 */
			// Thread.currentThread().sleep(1000);
		}
		// testThread.stop();
		System.out.println(testThread.isAlive());
	}
}
