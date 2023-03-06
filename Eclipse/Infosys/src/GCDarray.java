import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GCDarray {

	public static void main(String[] args) {
//		System.out.println("enter n");
//		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		int arr[] = new int[i];
//		for(int ii=0;ii<i;ii++) {
//			arr[ii]= sc.nextInt();
//		}
//		System.out.println("enter k");
//		int k= sc.nextInt();
//		for(int kk=1;kk<=k;kk++) {
//			arr[kk-1] = kk;
//		}
//		
//		for(int ii=0;ii<i;ii++) {
//			for(int kk=0;kk<k;kk++) {
//				
//			}
//		}
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.nextLine().trim());
		int m = Integer.parseInt(scan.nextLine().trim());
		int k = Integer.parseInt(scan.nextLine().trim());
		List<List<Integer>>a = new ArrayList<>(n);
		for(int i=0;i<n;i++) {
			 a.add(Arrays.asList(scan.nextLine().trim().split(" ")).stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList()));
		}
		List<List<Integer>>b = new ArrayList<>(n);
		for(int i=0;i<n;i++) {
			 b.add(Arrays.asList(scan.nextLine().trim().split(" ")).stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList()));
		}
		System.out.println(b.get(0));
//		
//	if(k!=0) {
//		String temp = b.get(k).toString();
//		int temp1 = Integer.parseInt(temp)+k;
//		b.get(k-1).add(temp1);
//		
//	}
	int final1=0;
	int final2=0;
	
		
		for(int loopfori=0;loopfori<n;loopfori++) {
			 String final11 = a.get(loopfori).toString();
			 String final22 = b.get(loopfori).toString();
			 final1 = Integer.parseInt(final11)*Integer.parseInt(final22);
			 final2 = final2+final1;
		}
		System.out.println(final2);
		
	}

}
