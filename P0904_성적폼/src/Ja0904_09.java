import java.util.Scanner;

public class Ja0904_09 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		int num1 = 0, num2 = 0;
		char choice = 0;
		int result = 0;
		
		// 1.두수를 입력 받고,
		System.out.println("첫번째 숫자 입력");
		num1 = scan.nextInt();
		System.out.println("2번째 숫자 입력");
		num2 = scan.nextInt();

		// 2.+-*/를 선택해서
		System.out.println("+, -, *, / 중 하나를 선택하세요");
		choice = scan.next().charAt(0);
		
		switch (choice) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		}//switch 
		 
		
		// 3.그 값을 출력 하시오.
		System.out.println("결과값 : "+result);

	}// main

}// class
