package boj.ch01_문자열;

import java.util.Scanner;

// [1543] 문서검색 - replace() 메서드 사용
public class Q1543_2 {

	public static void main (String[] agr) {
		Scanner sc = new Scanner(System.in);
		String doc = sc.next();
		String word = sc.next();

		String replaced = doc.replace(word, "");
		int length = doc.length() - replaced.length();
		int count = length / word.length();

		System.out.println(count);
	}

}
