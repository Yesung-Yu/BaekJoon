import java.util.Scanner;

public class StringExplosion_fail_9935 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine(); //문자열 입력,BufferedReader의 메서드인 readLine()이용
		String C4 = sc.nextLine(); //폭탄 문자열 입력
		int m = st.length();
		int n = C4.length();
		int x = m-n;
		
  		while(st.length()>n) {   //문자열이 폭탄길이보다 크면 루프
  			if(st.indexOf("C4") == -1) {  //C4가 없을때
	  			break;
  			}
  			else if(st.indexOf("C4") == 0) {  //C4가 맨왼쪽에 위치한 경우
  				st = st.substring(C4.length());           //C4를 제거하고 오른쪽 문자열로 초기화	
  			}
  			else if(st.indexOf("C4") == x-1) {	//C4가 맨오른쪽에 위치한 경우
  				st = st.substring(0,st.length()-n-1);
  			}
  			else {
  				st = st.substring(0,st.indexOf("C4")-1).concat(st.substring(st.indexOf("C4")+n));   			
  			} //C4기준 왼쪽과 오른쪽의 문자열을 합치기
  		}
  		
  		if(st.length() == C4.length() && st.indexOf("C4") == 0) {  //문자열이 폭탄길이와 같거나 작을 수 밖에 없다
  			System.out.println("FRULA");                   //문자열의 길이가 폭탄 길이이고 폭탄일때
  		}
  		else {
  			System.out.println(st);
  		} 	
  		sc.close();
	}
}
