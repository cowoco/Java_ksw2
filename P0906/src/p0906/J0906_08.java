package p0906;

import java.util.Scanner;

public class J0906_08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] subject = {"국어","영어","수학"};
		//2차원 배열
		
		//점수입력
		int[][] score = new int[5][3];
		for(int i =0; i<5; i++) {
			for(int j =0 ; j<3; j++) {
				System.out.println(subject[j]+"점수를 입력하세요");
				score[i][j] = scan.nextInt();
				
			}//for-j
		}//for-i
		
		//점수 출력
		System.out.printf("%s\t%s\t%s\n",subject[0],subject[1],subject[2]);
		
		for(int i =0; i<5; i++) {
			for(int j =0; j<3; j++) {
				System.out.print(score[i][j]+"\t");

				
			}//for-j
			System.out.println();
		}//for-i
		
		
		
//		//1차원 베열
//		int[] arrKor = new int[5];
//		int[] arrEng = new int[5];
//		int[] arrMath = new int[5];
//		
//		
//		//입력부
//		for(int i =0; i<5; i++) {
//			System.out.println("국어 점수를 입력하세요");
//			arrKor[i] = scan.nextInt();
//			System.out.println("영어 점수를 입력하세요");
//			arrEng[i] = scan.nextInt();
//			System.out.println("수학 점수를 입력 하세요");
//			arrMath[i] = scan.nextInt();
//		}//for-input
		
	}//main
	

}//class
