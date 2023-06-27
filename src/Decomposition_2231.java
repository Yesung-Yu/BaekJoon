import java.util.Scanner;

public class Decomposition_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 입력값

		for (int i = 1; i <= N; i++) { // num값은 1부터 1씩 증가(최솟값 구하는 거니까 작은 수부터~)
			int num = i; //
			int sum = 0; // 각 자릿수의 합
			String str = Integer.toString(num); // num의 각자리수의 합을 구하기 위해 문자열화

			for (int j = 0; j < str.length(); j++) { // num값의 각 자리수의 합
				sum += str.charAt(j) - '0'; // 0아스키 코드값을 빼서 원하는 정수값 가져오기
			}
			if (i + sum == N) {
				System.out.println(i);
				break;
			} 
			else if (i == N) {        //else if문 for문 밖으로 빼서 if문으로 쓰는게 더 효율적
				System.out.println(0);
			}
		}
		sc.close();
	}
}
