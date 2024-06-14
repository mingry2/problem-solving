package boj.ch03_배열;

import java.util.Scanner;

// [3273] 두 수의 합
public class Q3273 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int X = sc.nextInt();

		boolean[] exist = new boolean[10000001];
		for (int i = 0; i < N; i++) {
			exist[a[i]] = true;
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			int pairValue = X - a[i];
			if (0 <= pairValue && pairValue <= 10000000) {
				ans += exist[pairValue] ? 1 : 0;
			}
		}
		System.out.println(ans / 2);

	}

}
