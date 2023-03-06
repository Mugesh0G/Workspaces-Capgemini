import package1.demo;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner scan = new Scanner(System.in);
//	        String s = scan.nextLine();
//	        // Write your code here.
//	        String array[] = {};
//	        
//	        array = s.trim().split("[, !?_.@']+");
//	        
//	        
//	        System.out.println(array.length);
//	        for(String split : array)
//	        {
//	            System.out.println(split);
//	        }
//	        scan.close();
		int ener[] = new int[] {5,3,3};
		int answer = 0;
		
		for(int i=0;i<ener.length;i++)
		{
			if(i==0) {
			answer = ener[i];
			}
			else {
				answer = answer*ener[i];
			}
			System.out.print(answer+" ");
		}
		
		

	}

}
