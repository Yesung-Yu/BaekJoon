import java.util.Scanner;

public class Lotto_6603 {
	private static int N;
	private static int[] arr;
	private static boolean[] visited;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) { // 무한루프 시키기-> 입력값이0일때 종료되도록
			N = sc.nextInt();

			if (N == 0) {
				break;
			}
			arr = new int[N];
			visited = new boolean[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}

			dfs(0, 0);
			System.out.println();

		}
	}

	private static void dfs(int cnt, int depth) { // 기본인자 int형, cnt값이 0일때부터 탐색시작[시작노드=0]
		if (depth == 6) { // depth의 값이 6이 되면[최대깊이가되면] 결과값 출력
			for (int i = 0; i < N; i++) {
				if (visited[i]) {
					System.out.print(arr[i] + " "); // 노드에 있는 값 출력하는 for문
				}
			}
			System.out.println(); // 6자리 문자열을 다 찾으면 visited가 true인 것들만 출력
		}

		for (int i = cnt; i < N; i++) {
			visited[i] = true;
			dfs(i + 1, depth + 1); // 다음값 재귀시키기
			visited[i] = false;

		}
	}
}
