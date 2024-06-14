package boj.ch03_배열;

import java.util.Scanner;

// [10431] 줄 세우기
public class Q10431 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		while (P-- > 0) { // P가 1씩 마이너스 되면서 0이 될 때까지
			int T = sc.nextInt();
			int[] h = new int[20];
			for (int i = 0; i < 20; i++) {
				h[i] = sc.nextInt();
			}
			int cnt = 0; // 물러난 횟수
			int[] sorted = new int[20];
			for (int i = 0; i < 20; i++) {
				// 1. 줄 서있는 학색 중 자신보다 큰 학생을 찾는다.
				// 1-1. 만약, 찾지 못 했다면 줄의 가장 뒤에 선다.
				boolean find = false;
				for (int j = 0; j < i; j++) {
					if (sorted[j] > h[i]) {
						// 2. 찾았다면 그 학생의 앞에 선다.
						// 3. 그 학생과 그 뒤의 학생이 모두 한 칸씩 물러난다.
						find = true;
						for (int k = i - 1; k >= j; k--) {
							sorted[k + 1] = sorted[k];
							cnt++;
						}
						sorted[j] = h[i];
						break;
					}
				}
				if (!find) sorted[i] = h[i];
			}
			System.out.println(T + " " + cnt);
		}

	}

}
