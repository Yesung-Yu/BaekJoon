import java.util.Scanner;

public class BlackJack_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // N장의 카드를 깐다
		int M = sc.nextInt(); // 3장의 합
		int sum = 0; // 3개 합
		int num = 0; // 출력값

		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt(); // 입력값을 배열에 순서대로 저장하는 함수
		}

		for (int a = 0; a<N-2; a++) { // 3개 고르니까 N-2까지만 반복

			for (int b = a+1; b<N-1; b++) { // 1번째 다음부터 N-1까지만 반복

				for (int c = b+1; c<N; c++) { // 두번째 다음부터 N까지 반복

					sum = arr[a] + arr[b] + arr[c]; // 3개 합

					if (num < sum && sum <= M) // 근사치를 구하는 거니까 근사값에 가까워지면 num값을 초기화
						num = sum;
				}
			}
		}
		sc.close();
		System.out.println(num);
	}
}     