package baekjoon.d20230302.baek2501;

import java.util.Scanner;

public class Main {
	// 약수 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				k--;
			}
			if (k == 0) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}
