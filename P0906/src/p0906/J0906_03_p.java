package p0906;

import java.util.Scanner;

public class J0906_03_p {

	public static void main(String[] args) {
		// arrKor 5개짜리 배열

		Scanner scan = new Scanner(System.in);
		
		//선언부
		int[] arrKor = new int[3];
		int[] arreng = new int[3];
		String[] name = new String[3];
		
		
		
		// 입력부
		for (int i = 0; i < 3; i++) {
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
			System.out.println(name[i] + "의 " + (i + 1) + " 번째 국어점수를 입력하세요");
			arrKor[i] = scan.nextInt();
			System.out.println(name[i] + "의 " + (i + 1) + " 번째 영어점수를 입력하세요");
			arreng[i] = scan.nextInt();
		}



		// 출력부
		System.out.println("입력한 이름 : ");
		for (int i = 0; i < name.length; i++) {
			if (i == 0) {
				System.out.print(name[i]);
				continue;
			} // if
			System.out.print("," + name[i]);
		} // for-name
		System.out.println();
		
		//-------------------------------------------
		System.out.println("선택한 국어점수 : ");
		for (int i = 0; i < arrKor.length; i++) {
			if (i == 0) {
				System.out.print(arrKor[i]);
				continue;
			} // if
			System.out.print("," + arrKor[i]);
		} // for-kor
		System.out.println();
		
		//--------------------------------------------
		System.out.println("선택한 영어점수 : ");
		for (int i = 0; i < arreng.length; i++) {
			if (i == 0) {
				System.out.print(arreng[i]);
				continue;
			} // if
			System.out.print("," + arreng[i]);
		} // for-eng
		System.out.println();
		

	}// main

}// class
