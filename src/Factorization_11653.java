import java.util.Scanner;

public class Factorization_11653 {
	public static void main(String[] args) {
		
		
		try(Scanner scanner= new Scanner(System.in))
		{int N = scanner.nextInt();  //int 입력받을때는 nextInt 메서드 이용
		 int num;
		
		for(num=2; num<=N; num++) {
			
			 while(N%num == 0) {
				System.out.println(num);
				N = N/num;
			 }
			 
			}
		}
	}	
}
