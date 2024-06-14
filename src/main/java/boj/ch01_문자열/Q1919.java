package boj.ch01_문자열;

import java.util.Scanner;

// [1919] 애너그램 만들기
public class Q1919 {

	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i) - 'a']++;
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		int[] countA = getAlphabetCount(a);
		int[] countB = getAlphabetCount(b);

		// 메소드 생성 getAlphabetCount();
//		int[] countA = new int[26];
//		int[] countB = new int[26];
//
//		for (int i = 0; i < a.length(); i++) {
//			countA[a.charAt(i) - 'a']++; // 만약, a.charAt(i)가 'b'라면 91 - 90 으로 '1'이 countA 배열에 들어가게됨 0부터 'a'이기 때문에 1은 'b'라는걸 생각할 수 있음
////			System.out.println(Arrays.toString(countA));
//		}
//
//		for (int i = 0; i < b.length(); i++) {
//			countB[b.charAt(i) - 'a']++;
////			System.out.println(Arrays.toString(countB));
//		}

		int ans = 0;
		for (int i = 0; i < 26; i++) {
			ans += Math.abs(countA[i] - countB[i]); // Math.abs() 함수를 사용하여 절대값 구함 -> 음수나오는것 방지
//			if (countA[i] > countB[i]) {
//				ans += countA[i] - countB[i];
//			} else {
//				ans += countB[i] - countA[i];
//			}
		}

		System.out.println(ans);
	}

}
