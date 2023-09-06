import java.util.Scanner;

public class J0905_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[100];
		
		int random = (int)(Math.random()*100)+1;
		int input = 0 ;
		System.out.println("[숫자 랜덤 게임]");
		
		while(true) {
			System.out.println("1-100까지 숫자를 입력하세요");
			input = scan.nextInt();
			if(random==input) {
				System.out.println("정답입니다");
				break;
			}else if(random>input) {
				System.out.println("입력하신 수보다 더 큰 수입니다.");

			}else {
				System.out.println("입력하신 수보다 더 작은 수 입니다. ");
			}
			
		}
		

	}//main

}//class
