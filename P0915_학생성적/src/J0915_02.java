import java.util.Scanner;

public class J0915_02 {

	private static final Object name = null;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();// 객체선언
		String[] title = { "번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		int stuCount = 1;

		// 무한 반복
		loop: while (true) {
			// 메인화면 출력부분
			int choice = stuAction.mainPrint();

			switch (choice) {
			case 1:
				// 1. 학생입력메소드
				stuCount = stuAction.stuInput(stuCount);
				break;
			case 2: // 학생성적출력
				// 2. 학생성적출력 메소드
				stuAction.stuOutput();
				break;
			case 3:// 학생성적수정 메소드
				stuAction.stuUpdate();
				break;

			case 4:// 학생성적삭제 메소드
				stuAction.stuDelete();
				break;
			case 5:// 학생성적검색 메소드
				stuAction.stuSearch();
				break;
			case 6:// 등수처리 메소드
					// 6.등수처리
				System.out.println();
				System.out.println("[ 학생성적 등수처 ]");
				System.out.printf("등수처리를 진행 할까요?(0 .이전페이지 이동)\n");
				System.out.println("1. 예");
				System.out.println("2. 아니요");
				System.out.println("0. 이전페이지 이동");
				String name = scan.next();
				switch (choice) {
				case 1:
					for (int i = 0; i < stuAction.list.size(); i++) {
						int count = -1;
						StuScore s = (StuScore) stuAction.list.get(i);
						for (int j = 0; j < stuAction.list.size(); j++) {
							StuScore s2 = (StuScore) stuAction.list.get(j);
							if (s.getTotal() < s2.getTotal()) {
								count++;

							} // if

						} // for_j
						s.setRank(count);// 등수입력
					} // for_i

					System.out.println("등수처리가 완료되었습니다.");
					System.out.println();

					break;

				case 2:
					System.out.println("등수처리가 취소 되었습니다");
					System.out.println();
					break;

				case 0:
					System.out.println("이전페이지로 이동합니다 ");
					System.out.println();
					break;

				}

				break;// case 6 break
			case 0:// 프로그램종료
				System.out.println();
				System.out.println("[ 프로그램 종료 ]");
				System.out.printf("프로그램을 종료합니다.\n");

				break loop;

			} // switch -각메뉴

		} // while main 출력
	}// main
}// class