package com.cqb.thread;

public class ThreadDemo extends Thread {
	private static int count = 10;

	// private static int num =19;
	public void run() {
		while (true) {
			System.out.print(count + " ");
			if (--count == 0) {
				return;
			}
		}
	}

	public static void main(String[] args) {
	new ThreadDemo().start();
		System.out.println(Thread.MAX_PRIORITY + "-------" + Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);

		Thread thread = Thread.currentThread();
		System.out.println(thread.toString());

		System.out.println(activeCount());
		System.out.println(thread.getName());
		System.out.println(thread.getId());
		System.out.println(thread.getPriority());
		//System.out.println(thread.);
		System.out.println();
		
	}
}
