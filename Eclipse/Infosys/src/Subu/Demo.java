package Subu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.tools.JavaFileManager.Location;

class hello
{
	static void test()
	{
		System.out.println("test method on another class");
	}
}

public class Demo {
	static int x = 5;
	static void testMethod()
	{
		System.out.println(x);
	}

	public static void main(String[] args) {	        
		 File file1 = new File("C:\\Users\\muggovin\\Downloads\\Myself\\Photos\\Passport Size Photo.jpeg");
	       try {
			System.out.println(file1.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
//	     FileOutputStream output = new FileOutputStream(folder-1);
	}

}
