import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SymmetricDifference_1269 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();         //집합A의 길이
		int m = sc.nextInt();         //집합B의 길이
		sc.nextLine();                //개행문자\n제거로 에러발생 차단
		String A1 = sc.nextLine();    //집합A 원소 입력
		String B1 = sc.nextLine();    //집합B 원소 입력
		StringTokenizer stA = new StringTokenizer(A1);	//집합A를 띄어쓰기를 기준으로 토큰화
		StringTokenizer stB = new StringTokenizer(B1);  //집합B를 띄어쓰기를 기준으로 토큰화
		
		HashSet<Integer> a = new HashSet<>();	//a집합 생성
		HashSet<Integer> b = new HashSet<>();   //b집합 생성
		
		while(stA.hasMoreTokens())                     
			a.add(Integer.parseInt(stA.nextToken()));	//토큰이 존재하면 집합a에 토큰화한 A1의 토큰을 추가하는 무한루프문
		
		while(stB.hasMoreTokens())	//토큰이 존재하면 true, 토큰이 없으면 False값을 리턴
			b.add(Integer.parseInt(stB.nextToken()));   
		
		a.retainAll(b);    //a집합에서 a와b의 교집합만 추출
		int x = a.size();  //배열등에서의 길이체크는 size()메서드 사용
		
		System.out.println(n+m-x*2);
		sc.close();
	}	
}

