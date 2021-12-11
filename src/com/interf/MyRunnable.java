package com.interf;

public class MyRunnable {

	public static void main(String[] args){
		
		//annonymous inner class that implements an interface
		
		Runnable r = new Runnable()
				{
					public void run()
					{
						for(int i=0; i<5; i++) {
							try {
							System.out.println("inside runnable implementation");
							Thread.sleep(2000);
							}catch(Exception e) {}
						}
					}
				};
				Thread t = new Thread(r);
				t.start();
		

	}

}
