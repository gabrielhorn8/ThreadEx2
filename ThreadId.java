package controller;

public class ThreadId extends Thread{
	
	public ThreadId() {
	
	}

	@Override
	public void run() {
		System.out.println("TID #"+getId());
	}
	
}
