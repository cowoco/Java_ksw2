import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();//객체선언
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		
		
		int choice = stuAction.mainPrint();
		
		switch (choice) {
		
		}

	}//main

}//class
