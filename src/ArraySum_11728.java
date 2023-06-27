import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArraySum_11728 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();   //배열 a의 길이
		int b = sc.nextInt();	//배열 b의 길이
		sc.nextLine();
		String A1 = sc.nextLine();    //문자열로 A 원소 입력
		String B1 = sc.nextLine();    //문자열로 B 원소 입력
		StringTokenizer stA = new StringTokenizer(A1);	//집합A를 띄어쓰기를 기준으로 토큰화
		StringTokenizer stB = new StringTokenizer(B1);  //집합B를 띄어쓰기를 기준으로 토큰화
		
		List<Integer> listA = new ArrayList<Integer>();	//리스트 listA 생성
			while(stA.hasMoreTokens())
				listA.add(Integer.parseInt(stA.nextToken()));
			
		List<Integer> listB = new ArrayList<Integer>();	//리스트 listB 생성
			while(stB.hasMoreTokens())
				listB.add(Integer.parseInt(stB.nextToken()));
	
		List<Integer> listC = new ArrayList<Integer>();	//리스트 listC생성 후 리스트를 더한다
			listC.addAll(listA);
			listC.addAll(listB);
		
		Collections.sort(listC);
		for(int i=0; i<listC.size(); i++)
			System.out.print(listC.get(i)+ " ");
		sc.close();
	}
}