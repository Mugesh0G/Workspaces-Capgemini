package Subu;


public class Interface {
	static void call(int num) {
		int count =15;
		while(count>0) {
			if(num%3==0) {
				count = count-3;
			}
			else if(num%3==1)
			{
				count = count-2;
			}
			else {
				count = count -1;
			}
			System.out.println("----------"+count);
			System.out.println("-----------"+num);
			num++;
		}
		System.out.println(num);
	}
	public static void main(String[]args) {
		// \u000d System.out.println("hello");
//		int arr[] = new int[] {9,18,10,9,11};
//		int cat[] = new int[] {2,-1,4,2,-1};
//		int n=5;
//		
//		for(int i=0;i<n;i=i+1) {
//			for(int j=0;j<n;j=j+1) {
//				if(arr[i]%cat[j]==0)
//				{
//					System.out.println("---------"+arr[j]);
//					int temp = arr[j];
//					arr[j] = cat[i];
//					cat[i] = temp;
//					System.out.println("----------"+cat[i]);
//				}
//			}
//		}
//		
//		for(int i=0;i<n;i=i+1) {
//		System.out.printf("%d",cat[i]+arr[i]);
//		}
			int x=23;
			call(x);
			
	}

}
