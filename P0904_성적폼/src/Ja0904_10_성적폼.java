import java.util.Scanner;

public class Ja0904_10_성적폼 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("[학생성적 프로그램]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 학생검색");
		System.out.println("6. 등수 처리");
		System.out.println("7. 순차 정렬");
		System.out.println("8. 역순 정렬");
		System.out.println("-------------------");
		System.out.println("원하는 번호를 입력하새요.>>");

		int choice = scan.nextInt();

		switch (choice) {
		case 1:
			System.out.println("성적입력  선택하였습니다.");
			break;
		case 2:
			System.out.println("성적출력 선택하였습니다.");
			break;
		case 3:
			System.out.println("성적수정 선택하였습니다.");
			break;
		case 4:
			System.out.println("성적삭제 선택하였습니다.");
			break;
		case 5:
			System.out.println("학생검색 선택하였습니다.");
			break;
		case 6:
			System.out.println("등수 처리 선택하였습니다.");
			break;
		case 7:
			System.out.println("순차 정렬 선택하였습니다.");
				break;
		case 8:
			System.out.println("역순 정렬 선택하였습니다.");
			break;
				
		}//switch
		
		//조건문 2개 if, switch
		//반복문 2개 for, while

	}//main

}//class
