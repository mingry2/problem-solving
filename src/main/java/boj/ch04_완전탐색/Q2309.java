package boj.ch04_완전탐색;

import java.util.Scanner;

// [2309] 일곱 난쟁이
public class Q2309 {

	// 오름차순으로 정렬하는 메서드
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[i]) {
					int cur = arr[i];
					for (int k = i; k > j; k--) {
						arr[k] = arr[k - 1];
					}
					arr[j] = cur;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] ans = new int[7]; // 합쳐서 100이되는 7난쟁이

		// 9명의 난쟁이 배열 생성
		int[] nineDwarf = new int[9];
		// 9명의 난쟁이를 nineDwarf 배열에 담는다.
		for (int i = 0; i < nineDwarf.length; i++) {
			nineDwarf[i] = sc.nextInt();
		}

		sort(nineDwarf);

		// 9명의 난쟁이 합
		int sum = 0;
		for (int i = 0; i < nineDwarf.length; i++) {
			sum += nineDwarf[i];
		}

		// 9명의 난쟁이 합 - 2명의 난쟁이 == 100 나머지 난쟁이들이 정답
		boolean find = false; // 100이 되는지 true, false
		for (int i = 0; i < 9; i++) {
			for (int j = i; j < 9; j++) {
				if (sum - nineDwarf[i] - nineDwarf[j] == 100) {
					nineDwarf[i] = nineDwarf[j] = -1;
					find = true;
					break;
				}
			}
			if (find) {
				break;
			}
		}

		for (int i = 0; i < 9; i++) {
			if (nineDwarf[i] > 0) { // 7난쟁이 아닌 2난쟁이는 -1임
				System.out.println(nineDwarf[i]);
			}

		}

	}
}