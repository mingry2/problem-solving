package boj.ch01_문자열;

import java.util.Scanner;

// [1543] 문서검색 - indexOf() 메서드 사용
public class Q1543_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String doc = sc.next();
		String word = sc.next();

		int startIndex = 0;
		int count = 0;
		while (true) {
			int findIndex = doc.indexOf(word, startIndex); // startIndex 부터 word 단어가 있는지 찾는다. > 못찾으면 -1 반환
			if (findIndex < 0) { // 못 찾았을 경우
				break;
			}
			startIndex = findIndex + word.length(); // word 문자열을 찾은거기 때문에 word 첫번째 인덱스 부터 word의 길이까지 담고 그 뒤부터 중복되지 않게 찾는다.
			count++;
		}
	}

}
