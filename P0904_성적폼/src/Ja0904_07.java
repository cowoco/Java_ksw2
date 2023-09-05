import java.util.Scanner;

public class Ja0904_07 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 1부터 10까지의 랜덤숫자을 1개 생성 후 출력
		int random = (int) (Math.random() * 10) + 1;

		// 3개의 숫자를 입력 받아,정답을 맞추는 프로그램을 구현하시오.
		// 1개 입력 받아 맞는 확인 정답, 오답
		// 3개의 입력값을 출력. 입력번호: 1,9,7
		// 정답번호 : 5
		int num1 = 0, num2 = 0, num3 = 0;

		// 입력부
		// 1
		System.out.println("첫번째 숫자를 입력 :");
		num1 = scan.nextInt();
		if (random == num1) {
			System.out.printf("정답입니다.");

		} else {
			System.out.println("오답입니다");
		}

		// 2
		System.out.println("두번째 숫자를 입력 :");
		num2 = scan.nextInt();
		if (random == num2) {
			System.out.printf("정답입니다.");

		} else {
			System.out.println("오답입니다");
		}

		// 3
		System.out.println("세번째 숫자를 입력 :");
		num3 = scan.nextInt();
		if (random == num3) {
			System.out.printf("정답입니다.");

		} else {
			System.out.println("오답입니다");
		}
		// 입력한 숫자 출력
		System.out.printf(" 입력번호 : %d, %d, %d \n", num1, num2, num3);
		// 정답 번호 : 5
		System.out.println("1부터 10까지의 랜덤숫자 : " + random);
		
		

		// 랜덤 숫자 1-100까지 5개의 랜덤숫자를 생성해서 변수 저장 후 출력하시오. 숫자 중복 가능
//		int num =(int)(Math.random()*100)+1;
//		int num2 =(int)(Math.random()*100)+1;
//		int num3 =(int)(Math.random()*100)+1;
//		int num4 =(int)(Math.random()*100)+1;
//		int num5 =(int)(Math.random()*100)+1;
//		
//		
//		System.out.println("첫번 쨰 랜덤 숫자 : "+num);
//		System.out.println("두번 쨰 랜덤 숫자 : "+num2);
//		System.out.println("세번 쨰 랜덤 숫자 : "+num3);
//		System.out.println("네번 쨰 랜덤 숫자 : "+num4);
//		System.out.println("다섯 쨰 랜덤 숫자 : "+num5);

	}

}
