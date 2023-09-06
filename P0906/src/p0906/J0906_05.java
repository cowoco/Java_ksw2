package p0906;


import java.util.Arrays;
import java.util.Scanner;

public class J0906_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 선언부
		int[] lotto = new int[45];
		int[] WinLotto = new int[6]; // 당첨번호
		int[] myNum = new int[6];

		// 1-45 번호 입력
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		} // for-input

		// 번호섞기
		for (int i = 0; i < 500; i++) {
			int random = (int) (Math.random() * 45);// 0-44
			int temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;

		} // for-number mix

		// 당첨번호 입력
		for (int i = 0; i < 6; i++) {
			WinLotto[i] = lotto[i];
		} // for-win
		Arrays.sort(WinLotto); //순차정렬

		//나의 번호 입력부분
		for (int i = 0; i < 6; i++) {
			System.out.println("로또번호를 입력하세요.(1-45)");
			myNum[i] = scan.nextInt();

		}//for-number-input
		Arrays.sort(myNum);//순차정렬-낮은 숫자가 처음에 옴

		// 나의 번호출력
		System.out.println("-----------------------");
		System.out.println("    로또 105차 번호    ");
		System.out.println("-----------------------");
		//나의 출력번호 
		System.out.println(" ◆ 나의 입력번호 : ");
		for(int i =0; i<myNum.length; i++) {
			System.out.print(myNum[i]+" ");
		}
		System.out.println();
		
		
		
		
		//당첨번호 출력
		System.out.println(" ★ 당첨번호 : ");
		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				System.out.print(WinLotto[i]);

			} else {
				System.out.print("," + WinLotto[i]);
			}
		} // for-output
		
		

	}// main

}// class
