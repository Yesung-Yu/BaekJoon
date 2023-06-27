import java.util.Scanner;
import java.util.StringTokenizer;//라이브러리(클래스) 호출(문자열을 토큰화,문자열을 여러 개의 토큰으로 분리)

public class HiddenNumber2_8595 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		        
		
		sc.nextLine();                //한 줄 띄우기
		String Word = sc.nextLine();  //단어를 문자열로 입력
		long n = 0;
		
		String intWord = Word.replaceAll("[a-zA-Z]"," "); //정규표현식으로 알파벳만 공백으로 변환
		StringTokenizer st = new StringTokenizer(intWord," "); //("공백")을 기준으로 분리
		
		while(st.hasMoreTokens())                    //남아있는토큰이있으면 true를 리턴 없으면 false리턴
			n += Integer.parseInt(st.nextToken());   //객체에서 다음 토큰을 반환
		System.out.println(n);
		sc.close(); //스캐너 썼으면 닫아줍시다
	}
}

//true값이 나온다면 토큰값이 있다는 의미 => 더하기 실행 => false값이 나올 때까지 토큰이 없을 때까지
//while(true) 무한루프

//[민수]stack으로 사용하면 나중에 저장된 숫자부터 빠져나오니까 일의자리 10의자리 x1해서 계산
