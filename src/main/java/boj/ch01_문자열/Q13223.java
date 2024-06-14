package boj.ch01_문자열;

import java.util.Scanner;

// [13223] 소금 폭탄
public class Q13223 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String current = sc.next();
		String drop = sc.next();

//		// 1번
//		int hour = (current.charAt(0) - '0') * 10 + current.charAt(1) - '0'; // 시
//		int minute = (current.charAt(3) - '0') * 10 + current.charAt(4) - '0'; // 분
//		int second = (current.charAt(6) - '0') * 10 + current.charAt(7) - '0'; // 초
//
//		// 2번
//		int hour1 = Integer.parseInt(current.substring(0,2));
//		int minute1 = Integer.parseInt(current.substring(3,5));
//		int second1 = Integer.parseInt(current.substring(6,8));

		// 3번
		String[] currentUnit = current.split(":"); // [hh,mm,ss] string 배열의 형태로 반환
		String[] dropUnit = drop.split(":");

		int currentHour = Integer.parseInt(currentUnit[0]);
		int currentMinute = Integer.parseInt(currentUnit[1]);
		int currentSecond = Integer.parseInt(currentUnit[2]);

		int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;

		int dropHour = Integer.parseInt(dropUnit[0]);
		int dropMinute = Integer.parseInt(dropUnit[1]);
		int dropSecond = Integer.parseInt(dropUnit[2]);

		int dropSecondAmount = dropHour * 3600 + dropMinute * 60 + dropSecond;

		int needSecondAmount = dropSecondAmount - currentSecondAmount;
		if (needSecondAmount <= 0) {
			needSecondAmount += 24 * 3600;
		}

		int needHour = needSecondAmount / 3600;
		int needMinute = (needSecondAmount % 3600) / 60;
		int needSecond = needSecondAmount % 60;

		System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);


	}

}
