
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class J0905_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];// 배열 10개 생성

		// [1-100까지의 랜덤숫자를 생성해서 맞추는 프로그램을 구현]
		
		// 1.랜덤 숫자 생성
		int random = (int) (Math.random() * 100) + 1;// 1-100
		int i = 0; // 초기식

		System.out.println("[숫자 맞추기 게임]");

		// 2. while 무한 반복
		while (i < 10) {

			int input = 0;
			// 3. num 숫자 입력받기
			System.out.println("1-100사이의 숫자를 입력하세요");
			input = scan.nextInt();// input- 50, 20
			num[i] = input; // 입력한 숫자를 배열에 저장 num[0]=50, num[1]=20
			// 4. if 를 사용해서 랜덤 숫자와 입력숫자가 맞는 비교
			// 5. 큰수, 작은수, 정답 -break;
			if (random == input) {
				System.out.println("정답입니다");
				break;
			} else if (random > input) {
				System.out.println("입력한 수보다 큰 수 입니다.");

			} else {
				System.out.println("입력한 수보다 작은수 입니다.");
			}
			if (i == 9) {
				break;
			} // if

			i++;
		} // while

		System.out.printf("입력한 숫자 : ");
		for (int j = 0; j < i; j++) {
			System.out.printf(" %d ", num[j]);
		}
		System.out.println();

		System.out.println("랜덤숫자 : " + random);

//		System.out.println(num);//주소 값이 출력
//		System.out.println(Arrays.toString(num));//배열의 모든값을 출력
//		

//		for(int i =0; i<10; i++) {
//			System.out.println(num[i]);
//		}

	}// main

}// class
