import java.util.Scanner;

public class Ja0904_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 10, 5 두수를 입력받아, 큰수를 출력 하시오 / 큰수:10 작은:5
		// 1. 두수를 입력받아 출력하시오.
		// 2. 두수를 비교해서 큰 수 출력

		
		// 두수를 입력
		System.out.println("숫자를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("숫자를 한번 더 입력 하세요");
		int num2 = scan.nextInt();

		// 두수를 비교
		if (num1 > num2) {
			System.out.printf("큰수는 " + num1);
			System.out.println("작은수 : " + num2);
		} else if (num1 < num2) {
			System.out.println("큰수는 : " + num2);
			System.out.println("작은수 : " + num1);
		} else {
			System.out.println("두수가 같습니다.");
		}

		// 두수를 출력
		System.out.printf("1: %d, 2: %d \n", num1, num2);

	}//main

}//class
