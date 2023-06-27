import java.io.BufferedReader; //데이터 전송 시 일시적으로 데이터를 보관한다 == 큐(Queue) 전송시간 적다
import java.util.Stack;
import java.io.InputStreamReader;
import java.io.IOException;

public class StringExplosion_9935 {
	public static void main(String[] args) throws IOException { // IOException 예외처리

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num = br.readLine(); // 문자열 입력,BufferedReader의 메서드인 readLine()이용
		String C4 = br.readLine(); // 폭탄 문자열 입력
		int C4Size = C4.length(); // 폭탄 문자열 길이

		Stack<Character> st = new Stack<>(); // 문자형 스택 생성

		for (int i = 0; i < num.length(); i++) { // st스택에 입력받은 문자열의 0인덱스부터 하나씩 스택에 넣는다
			st.push(num.charAt(i));

			if (st.size() >= C4.length()) { // C4길이보다 스택 사이즈가 크거나 같을 때 폭탄이 나올 수 있다

				if (C4.charAt(C4.length() - 1) == st.peek()) { // 스택 마지막자리가 폭탄 마지막자리랑 같을 때
					boolean stSameC4 = true; // true나 false값만을 갖는 boolean 선언
					// C4마지막 문자와 스택 맨위 값이 같으면 true

					for (int b = 0; b < C4.length(); b++) {
						if (st.get(st.size() - C4.length() + b) != C4.charAt(b))	
						{
							// 스택 개수와 크거나 같을 때니까 C4라고 치면 st길이2일때 0인덱스부터, 3일때 1인덱스부터 비교시작
							// 언제까지 비교?
							stSameC4 = false; // C4마지막 문자와 스택 맨 위 값이 달라질때 까지
							break;
						}
					}
					if (stSameC4) { // for문에서 한번 걸러진 다음 true니까 스택비교시작지점부터 스택 맨 위까지는 연속된 C4이다
						for (int c = 0; c < C4.length(); c++) {
							st.pop(); // C4길이만큼 스택에서 값 제거
						}
					}
				}
				
			}
		}
	}
}  //ctrl+shift+f 정렬