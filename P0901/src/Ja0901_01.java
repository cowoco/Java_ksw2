import java.util.Scanner;

public class Ja0901_01 {
	public static void main(String[] args) {

		int number = 0; // 정수형타입을 생성해서 0의 값을 입력
		String name = ""; // 문자열타입을 생성해서 빈공백 입력
		int kor = 0; // 국어점수를 입력할 수 있는 변수 선언
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0; // 싷수형 타입
  
		
		// 키보드를 통한 값 입력

		Scanner scan = new Scanner(System.in);
		System.out.printf("학번을 입력 : ");
		number = scan.nextInt();
		System.out.printf("이름을 입력 : ");
		name = scan.next();
		System.out.printf("국어 점수입력 : ");
		kor = scan.nextInt();
		System.out.printf("영어 잠수입력 : ");
		eng = scan.nextInt();
		System.out.printf("수학 점수 입력 : ");
		math = scan.nextInt();

		total = kor + eng + math;
		avg = total / 3.0;

//		number = 1;
//		name = "홀길동";
//		kor = 100;
//		eng = 100;
//		math = 100;
//		total = kor + eng + math;
//		avg = total / (double) 3;

		System.out.println(" [학생성적프로그램] ");
		System.out.println("-------------------");
		System.out.printf("번호 : %d \t", number);
		System.out.printf("이름 :%s \t", name);
		System.out.printf("국어 : %d \t ", kor);
		System.out.printf("영어 :%d \t ", eng);
		System.out.printf("수학 : %d \t", math);
		System.out.printf("합계 : %d \t" , total);
		System.out.printf("평균 : %.2f  \n", avg);
	}

}
