package main.java.com.capg;

class MyThread extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("in child thread");
		}
	}
}

 
 public class MapIt {
 public static void main(String[] args) throws InterruptedException {
	 
	 System.out.println("start:main thread");
	 MyThread mt=new MyThread();
	 mt.start();
	 Thread.currentThread().join();
	 System.out.println("End Main");
	 
	System.out.println("dfgfdg");
	 
	 
 }
 }


