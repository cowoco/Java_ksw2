import java.util.Scanner;

public class Ja0831_11_성적입출력 {

	public static void main(String[] args) {

		// 이름, 국,영,수 ,합계, 평균

		double total = 0;
		double avg = 0;
		int kor = 0;
	 // String name = "";
		
		
		
		//입력부분
		Scanner scan = new Scanner(System.in); // 입력 선언
		System.out.printf("이름을 입력하세요 : ");
		String name = scan.next();

		System.out.printf("국어점수 입력 : ");
		kor = scan.nextInt();

		System.out.printf("영어점수 입력 : ");
		int eng = scan.nextInt();

		System.out.printf("수학점수 입력 : ");
		int math = scan.nextInt();
		
		//합계, 평균 계산 
		total = kor + eng + math;
		avg = total / 3.0;

		//출력부분
		System.out.println("성함 :" + name);
		System.out.println("국어 점수 :" + kor);
		System.out.println("영어 점수 :" + eng);
		System.out.println("수학 점수 :" + math);
		System.out.println("총 점 :" + total);
		System.out.println("평균 점수 :" + avg);

	}

}
