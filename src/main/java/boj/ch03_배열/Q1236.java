package boj.ch03_배열;

import java.util.Scanner;

// [1236] 성 지키기
public class Q1236 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] map = new char[N][M];
		for (int i = 0; i < N; i++) {
			map[i] = sc.next().toCharArray();
		}

		// 1. 각 행/열에 대해 경비원이 있는지 확인
		int existRowCount = 0;
		for (int r = 0; r < N; r++) {
			boolean exist = false;
			for (int c = 0; c < M; c++) {
				if (map[r][c] == 'X') {
					exist = true;
					break;
				}
			}
			if (exist) existRowCount++;
		}

		int existColCount = 0;
		for (int c = 0; c < M; c++) {
			boolean exist = false;
			for (int r = 0; r < N; r++) {
				if (map[r][c] == 'X') {
					exist = true;
					break;
				}
			}
			if (exist) existColCount++;
		}

		// 2. 보호받지 못하는 행/열의 개수를 구함
		int needRowCount = N - existRowCount;
		int needColCount = M - existColCount;

		// 3. 둘 중 큰 값을 출력
		System.out.println(Math.max(needRowCount, needColCount));


	}

}
