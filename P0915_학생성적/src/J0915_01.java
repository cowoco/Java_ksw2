import java.util.ArrayList;
import java.util.Scanner;

public class J0915_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 하이마켓 쇼핑몰 로그인 ]");
		String id ="aaa";
		String pw ="1111";
		String name ="홍길동";
		
		
		Buyer b1 = new Buyer(id,name);
		int choice = 0;
		while(true) {
			System.out.println("[ 하이마켓 가전 쇼핑몰 ]");
			System.out.println("1. Tv");
			System.out.println("2. Computer ");
			System.out.println("3. Audio ");
			System.out.println("4. Washing ");
			System.out.println("5. 현재 잔액 조회");
			System.out.println("8. 총 구매목록");
			System.out.println("9. 금액충전");
			System.out.println("0. 프로그램 종료");
			System.out.println("------------------------");
			System.out.println("구매를 원하는 번호를 입력하세요");
			choice = scan.nextInt();
			
			
				
			
			
			
			

		
		}//while
		

	}

}
