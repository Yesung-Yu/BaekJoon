import java.util.Scanner;

public class All_Permutation {

	private static int N;
	private static int arr[];
	private static boolean visit[];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = Integer.parseInt(sc.nextLine());
		arr = new int[N];         //입력받은 수의 길이를 갖는 배열arr 생성
		visit = new boolean[N];   //N길이의 false값을 갖는 불 배열visited 생성, 각 노드의 방문여부 저장

		dfs(0);  //Depth-First-Search 깊이우선탐색
		sc.close();
	}

	private static void dfs(int cnt) {   //기본인자 int형, cnt값이 0일때부터 탐색시작[시작노드=0]
		if (cnt == N) { //depth의 값이 N배열의 길이가 되면 결과값 출력
			for (int i = 0; i < N; i++)
				System.out.print(arr[i] + " ");  //노드에 있는 값 출력하는 for문
			System.out.println();
			return;
		}

		for (int i = 0; i < N; i++) {
			if (visit[i] != true) {
					arr[cnt] = i + 1;   //방문한,방문하지않은,요소의 위치마다 i+1값을 넣는다
					visit[i] = true;    //현재 노드를 방문한 것으로 체크한다[visited의 i번째 요소를 true로]
					dfs(cnt + 1);       //재귀함수, 탐색노드+1 == 다음노드
					visit[i] = false;   //한 노드 탐색이 끝나면 방문여부를 false로 되돌림
			}
		}
	}
}