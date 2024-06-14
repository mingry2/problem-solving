package boj.ch01_문자열;

import java.util.Scanner;

// [1543] 문서검색
public class Q1543 {

	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i) - 'a']++;
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String doc = sc.next();
		String word = sc.next();

		int count = 0;

		for (int i = 0; i < doc.length(); i++) {
			boolean isMatch = true;
			for (int j = 0; j < word.length(); j++) {
				if (i+j >= doc.length() || doc.charAt(i+j) != word.charAt(j)) {
					isMatch = false;
					break;
				}
			}
			if (isMatch) {
				count++;
				i += word.length() - 1;
			}
		}
	}

}
