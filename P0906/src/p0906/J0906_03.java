package p0906;

import java.util.Scanner;

public class J0906_03 {

	public static void main(String[] args) {
		// 국어점수 5개를 입력 arrKor 5개짜리 배열 생성 후, 점수를 직접 입력해서 출력하시오.
		Scanner scan = new Scanner(System.in);
		
		int[] arrKor = new int[5];


		System.out.println("점수를 입력하세요");
		// 입력부분
		for (int i = 0; i <arrKor.length; i++) {
			arrKor[i] = scan.nextInt();

		}

		// 출력 for문
		for (int i = 0; i <arrKor.length; i++) {
			if (i==0) {
				System.out.print(arrKor[i]);
			}else {
				System.out.print(","+arrKor[i]);
			}
			

		}//출력 for문

	}// main

}// class
