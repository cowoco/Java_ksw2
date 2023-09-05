package p0830;

public class Ja0830_03 {

	public static void main(String[] args) {

		final int NUM3 = 100; // final 상수는 대문자로 적어야 한다. -> 상수선언
		int num1 = 1000;      // 변수선언
		int num2 = 500;       // 변수는 선언한 후 값이 들어가야 함 , 값이 들어가기 전 사용 시 에러 
		int temp;
		int company_intro;
		int companyIntro;

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);

		System.out.printf("수동구간");
		System.out.println(550 + 150);
		System.out.println(550 - 150);
		System.out.println(550 * 150);
		System.out.println(550 / 150);
		System.out.println(550 % 150);

		num1 = 10;
		num2 = 300;
		// NUM3 = 1; // final modifier of num3 // 상수를 대문자로

	}

}
