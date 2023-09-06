package p0906;

import java.util.Scanner;

public class J0906_03_p3 {

	public static void main(String[] args) {
		// arrKor 5개짜리 배열

		Scanner scan = new Scanner(System.in);

		// 선언부
		int[] arrKor = new int[10];
		int[] arrEng = new int[10];
		int[] arrMat = new int[10];
		String[] name = new String[10];
		int[] total = new int[10];
		double[] avg = new double[10];
		int count = 0; // 입력된 학생 수

		// 입력부
		for (int i = 0; i < name.length; i++) {
			System.out.println("이름을 입력하세요.(중지:0입력)");
			name[i] = scan.nextLine();// "0" String
			if (name[i].equals("0")) {
				System.out.println("입력을 중지합니다.");
				break;
			}
			System.out.println(name[i] + "의  국어점수를 입력하세요");
			arrKor[i] = scan.nextInt();
			System.out.println(name[i] + "의  영어점수를 입력하세요");
			arrEng[i] = scan.nextInt();
			System.out.println(name[i] + "의  수학점수를 입력하세요");
			arrMat[i] = scan.nextInt();
			scan.nextLine();
			total[i] = arrKor[i] + arrEng[i] + arrMat[i]; // 합계 입력
			avg[i] = total[i] / 3.0; // 평균입력

			count++;

		}//for-input

		// 출력부
		System.out.println();
		System.out.println("          [ 학생 성적표  ]          ");
		System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("-----------------------------------------------------------------------");
		for (int i = 0; i < count + 1; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
					i + 1, name[i], arrKor[i], arrEng[i], arrMat[i],total[i], avg[i]);
		}

//		System.out.printf("%s\t%d\t%d\n", name[0],arrKor[0],arrEng[0]);
//		System.out.printf("%s\t%d\t%d\n", name[1],arrKor[1],arrEng[1]);
//		System.out.printf("%s\t%d\t%d\n", name[2],arrKor[2],arrEng[2]);
//	

	}// main

}// class
