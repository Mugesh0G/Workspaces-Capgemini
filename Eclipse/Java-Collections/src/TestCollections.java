import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestCollections {

	public static long maxAns(int n, int m, int k, List<List<Integer>> a, List<List<Integer>> b) {
		long ans = 0;

//		a.forEach((List<Integer>as)->
//		{
//			System.out.println(as);
//		});
		
		a
		.stream()
		.skip(1)
		.sorted()
		.forEach(System.out::println);
		
		if (k != 0) {
			b.get(n - 1).set(k - 1, b.get(n - 1).get(k - 1) + k);

		}

		for (int x = 0; x < n; x++) {
			for (int i = 0; i < m; i++) {
				int xx = (int) a.get(x).get(i) * (int) b.get(x).get(i);
				ans += xx;
			}

		}

		return ans;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n = Integer.parseInt(scan.nextLine().trim());
		System.out.println("enter m");
		int m = Integer.parseInt(scan.nextLine().trim());
		System.out.println("enter k");
		int k = Integer.parseInt(scan.nextLine().trim());

		List<List<Integer>> a = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			System.out.println("enter list of a");
			a.add(Arrays.asList(scan.nextLine().trim().split(" ")).stream().map(s -> Integer.parseInt(s))
					.collect(Collectors.toList()));
		}

		List<List<Integer>> b = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			System.out.println("enter list b");
			b.add(Arrays.asList(scan.nextLine().trim().split(" ")).stream().map(s -> Integer.parseInt(s))
					.collect(Collectors.toList()));
		}
		scan.close();
		long result = maxAns(n, m, k, a, b);
		System.out.println(result);
	}
}
