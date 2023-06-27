import java.util.Scanner;

public class binary_11816 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.nextLine();
		
		if(X.length() < 2) {     //10진수
			System.out.println(X);
		}
		
		else if(X.charAt(0) == '0' && X.charAt(1) != 'x') {      // 첫자리가 0일때
			int a = Integer.parseInt(X.substring(1), 8);
			System.out.println(a);
		}	
		else if(X.charAt(1) == 'x') {     // 둘째자리가 x일때
			int b = Integer.decode(X); //0x로 시작하는 16진수문자열을 10진수로 변환
			System.out.println(b);
		}
		else {
			System.out.println(X);
		}
		sc.close();
	}

}

//if 조건문 바꾸기
//8진수부분 수정