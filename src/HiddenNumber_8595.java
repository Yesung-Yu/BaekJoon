import java.util.Scanner;

public class HiddenNumber_8595 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 단어의 길이
		sc.nextLine();                //개행문자 \n 제거
		String Word = sc.nextLine();  //단어를 문자열로 입력
	
		String intWord = Word.replaceAll("[^0-9]",""); //정규표현식으로 숫자만 추출
		
		int num = 0;                                   //숫자가 아닌 문자들을 공백으로 변경하라는 의미
		for(int i=0; i<intWord.length(); i++) {        // "[^0-9]" == 0~9의 숫자가 아닌 문자열, "" == 공백
			num += intWord.charAt(i)-'0';
		}
		sc.close();
		System.out.println(num);
			
		}
	}

// 연속된 숫자를 하나의 숫자로 인식하지 못해서 틀렸습니다!
// replaceAll("A","B")함수는 좌변의 문자A를 B로 교체해주는 함수