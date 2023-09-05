import java.util.Scanner;

public class Ja0831_09 {

	public static void main(String[] args) {
		// 출력 - println, print, prinf
		// 입력 - Scanner //선언을 해야만 사용가능
		String str = new String("abc");
		System.out.println(str);
		

		Scanner scan = new Scanner(System.in); // 입력: 현재 시스템 화면에서 입력 받음
		System.out.printf("당신의 원하는 숫자를 입력하세요 : ");
		int number = scan.nextInt();
		System.out.printf("입력한 숫자 : "+number);

	}

}

