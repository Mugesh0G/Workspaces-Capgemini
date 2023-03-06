import java.util.Scanner;

public class arrayMaxnumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		int i=sc.nextInt();
		System.out.println("enter no of rows");
		int j = sc.nextInt();
		System.out.println("enter k");
		int k = sc.nextInt();
		
		int finalnum = 0;
		int finalnum2 = 0;
		int arr1[][] = new int[i][j];
		int arr2[][] = new int[i][j];
		
		for(int loopfori=0;loopfori<i;loopfori++) {
			for(int loopforj=0;loopforj<j;loopforj++) {
				System.out.println("enter arr1 num");
				arr1[loopfori][loopforj] = sc.nextInt();
				
			}
		}
		for(int loopfori=0;loopfori<i;loopfori++) {
			for(int loopforj=0;loopforj<j;loopforj++) {
				System.out.println("enter 2arr2 num");
				arr2[loopfori][loopforj] = sc.nextInt();
				
			}
		}

		if(k!=0) {
			
				arr2[i-1][k-1] = arr2[i-1][k-1]+k; 
			}
		
		
		for(int ii=0;ii<i;ii++) {
			for(int jj=0;jj<j;jj++) {
				System.out.println("-----------"+arr1[ii][jj]);
				System.out.println("-----------"+arr2[ii][jj]);
				finalnum = arr1[ii][jj]*arr2[ii][jj];
				System.out.println(finalnum);
				finalnum2 = finalnum+finalnum2;
				System.out.println(finalnum2);
				
				
			}
		}
		System.out.println(finalnum2);
		
	}

}
