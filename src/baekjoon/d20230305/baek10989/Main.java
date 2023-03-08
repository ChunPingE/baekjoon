package baekjoon.d20230305.baek10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		// readLine nextLine비슷 문자열 읽어오니 integer로 파싱필요.
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			sb.append(arr[i]).append('\n');
		}

		System.out.println(sb);
	}
}