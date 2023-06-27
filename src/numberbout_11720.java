import java.util.Scanner;

public class numberbout_11720 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		scanner.nextLine(); //개행문자 \n 제거
		String str = scanner.nextLine();  //문자열을 입력으로 받는 방법 'nextLine()'메소드
		int num = 0;
		
		for(int i=0; i<=N-1; i++) {
			num += str.charAt(i)-'0';
		}
		scanner.close();
		System.out.println(num);
	}
}
