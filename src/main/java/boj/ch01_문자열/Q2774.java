package boj.ch01_문자열;

import java.util.Scanner;

// [2774] 대소문자 바꾸기
public class Q2774 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ('A' <= ch && ch <= 'Z') { // 대문자라면?
//				System.out.print((char) ('a' + ch - 'A')); // 아스키 코드를 사용하여 소문자로 변환
				ans += (char) ('a' + ch - 'A');
			} else {
//				System.out.print((char) ('A' + ch - 'a')); // 대문자로 변환
				ans += (char) ('A' + ch - 'a');
			}
		}
		System.out.print(ans);
	}

}