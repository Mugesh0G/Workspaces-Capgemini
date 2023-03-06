package infosys;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

class MultiThreading1 extends Thread
{
	public void run()
	{
		
		for(int count=0;count<5;count++)
		{
			System.out.println("Thread-1 is running");
			System.out.println(count);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally
			{
				System.out.println("finallllllllllly");
			}
			
			
		}
	
		
	}
}
class MultiThreading2 extends Thread{
	
	public   void run()
	{
		
		
		for(int count=0;count<5;count++)
		{
			System.out.println("Thread-2 is running");
			System.out.println(count);
			
		}
	
	}
}
public class MultiThreading{
	public static void main(String[] args) throws InterruptedException {
		
		MultiThreading1 thread1 = new MultiThreading1();
		MultiThreading2 thread2 = new MultiThreading2();
		
		thread1.start();
		thread2.start();
	
		
		
	}
	   
	
	

}
