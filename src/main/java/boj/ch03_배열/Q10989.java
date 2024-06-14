package boj.ch03_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// [10989] 수 정렬하기 3
public class Q10989 {

	public static void main (String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();

		// Scanner, System.out.print -> 시간 초과
		// 10000 단위 이상이 들어가게되면 BufferedReader과 BufferedWdWriter를 사용하는게 좋다.
//		int[] cnt = new int[10001];
//		for (int i = 0; i < N; i++) {
//			cnt[sc.nextInt()]++;
//		}
//		for (int i = 0; i <= 10000; i++) {
//			while(cnt[i]-- > 0) {
//				System.out.println(i);
//			}
//		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] cnt = new int[10001];
		for (int i = 0; i < N; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		for (int i = 1; i <= 10000; i++) {
			while(cnt[i]-- > 0) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
	}
}
