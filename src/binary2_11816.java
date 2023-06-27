import java.util.Scanner;

public class binary2_11816 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.nextLine();
		
		if(X.charAt(0) != '0') {
			System.out.print(X);
		}
		else if(X.charAt(1) != 'x') {// X는 대문자야! x가 소문자라고 x가 소문자라고 x가 소문자라고 x가 소문자라고 소문자라고 소문자라고 소문자라고
			System.out.print(Integer.parseInt(X.substring(1), 8));  //인덱스1부터 8진수 변환
		}
		else {
			System.out.print(Integer.decode(X)); //0x로 시작하는 16진수문자열을 10진수로 변환
		}
		sc.close();
	}

}
