import java.util.Scanner;

public class Ja0904_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//문자 '0'에서 '9'사이의 문자이면 문자 숫자 입니다. 문자 숫자가 아닙니다. 출력 하시오.
		System.out.println("2자리 문자를 입력하세요 : "); //숫자만 입력하세요. 4748A848
		String result =scan.next();
		
		
		
		char result1 = result.charAt(0);
		if(result1 >='0' && result1 <='9') {
			System.out.println("숫자가 입력되었습니다..");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
		
		result1 = result.charAt(1);
		if(result1 >='0' && result1 <='9') {
			System.out.println("숫자가 입력되었습니다..");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
		
		
		
		
//		//알파벳 x,X를 입력하면 프로그램을 종료합니다. 라고 출력 하시오
//		System.out.println("프로그램을 종료하려면 x,X룰 입력하세요.");
//		char result =scan.next().charAt(0); //문자열 -> 문자로 변경 명령어
//		
//		if(result =='x' || result == 'X') {
//			System.out.println("프로그램을 종료 합니다. ");
//		}//if
		

	}//main

}//class
