import java.util.Scanner;
import java.util.Arrays;

class NumberCard_10815 {
	private static int N;
	private static int[] Arr;
	private static int M;
	private static StringBuilder sb = new StringBuilder();  //문자열 합쳐주는 함수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();                //N정수 입력
		Arr = new int[N];                //N의 길이를 갖는 배열 arr생성
		for (int i = 0; i < N; i++) {
			Arr[i] = sc.nextInt();       //N카드에 적힌 수를 배열 arr에 저장
		}
		Arrays.sort(Arr);    //이분탐색할거니까 정렬시켜주기
		M = sc.nextInt();    //M정수 입력

		for (int i = 0; i < M; i++) {
			int m = sc.nextInt();    //상근이 카드랑 비교할 M개의 정수 입력
			int left = 0;
			int right = N - 1;       //right == 배열 길이 N -1

			while (left <= right) {   //배열 크기가 1이 될때까지 반복한다
				int mid = (left + right) / 2;   //중앙값을 구한다(인덱스)
				int n = Arr[mid];               //중앙값n(배열)
				if (n == m) {                   //찾는값이 중앙값일때 
					sb.append(1 + " ");
					break;
				}
				if (n > m) {           //중앙값이 찾는값보다 클때, 
					right = mid - 1;   //중앙값 왼쪽을 탐색해야하니까 r=m-1
				} else {               //중앙값이 찾는값보다 작을때
					left = mid + 1;    //중앙값 오른쪽을 탐색해야하니까 l=m+1 
				}
				if (left > right) {    //찾는값이 없을 때
					sb.append(0 + " ");
					break;
				}
			}
		}
		System.out.println(sb.toString());   //stbuilder함수로 구한 1과0을 합쳐서 출력
		sc.close();
	}
//이진 탐색 = 이분 탐색 = BinarySearch
}