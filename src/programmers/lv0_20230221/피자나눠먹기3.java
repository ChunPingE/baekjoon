package programmers.lv0_20230221;

public class 피자나눠먹기3 {
	public int solution(int slice, int n) {
		int answer = 0;
		if (n % slice == 0) {
			answer = n / slice;
		} else {
			answer = n / slice + 1;
		}
		return answer;
	}
}
