package boj.ch01_문자열;

import java.util.Scanner;

// [1157] 단어 공부
public class Q1157 {

	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i) - 'A']++;
			// 처음부터 대문자를 받으면 대소문자 구분할 필요 없음
//			char ch = str.charAt(i);
//
//			if ('A' <= ch && ch <= 'Z') {
//				count[ch - 'A']++;
//			} else {
//				count[ch - 'a']++;
//			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
		String str = sc.next().toUpperCase(); // 대문자로 받기

		int[] count = getAlphabetCount(str);
		int maxCount = -1;
		char maxAlphabet = '?';

		for (int i = 0; i < 26; i++) {
			if (count[i] > maxCount) {
				maxCount = count[i];
				maxAlphabet = (char) ('A' + i);
			} else if (maxCount == count[i]) {
				maxAlphabet = '?';
			}
		}

		System.out.println(maxAlphabet);
	}

}
