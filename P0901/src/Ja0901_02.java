import java.util.Scanner;

public class Ja0901_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("학번을 입력하세요.");
		int number = scan.nextInt(); // enter값은 입력을 받지 않음.
		scan.nextLine();
		System.out.println("이름 입력 :");
		String name = scan.nextLine(); // enter키 입력까지 입력받음.
		// String name = scan.next(); // 문장만 입력가능

		System.out.println("국어점수를 입력하세요");
		String k = scan.nextLine(); // nextLine -> 문자열을 입력받는 명령어
		int kor = Integer.parseInt(k); // String을 int 타입으로 변경 -> int 8가지 기본형 타입이면 형변환
		System.out.println("영어 점수를 입력하세요");
		String e = scan.nextLine();
		int eng = Integer.parseInt(e);
		System.out.println("합계 :" + (kor + eng));

		// 출력부
		System.out.println("이름: " + name);

	}

}
