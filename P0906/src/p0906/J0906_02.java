package p0906;

public class J0906_02 {
	public static void main(String[] args) {
		// 배열 100개를 생성하고, 1-100까지 숫자를 입력해서 출력 하시오 arrNum
		int[] arrNum = new int[100];
		int num = 0;

		// 입력하는 for
		for (int i = 0; i <arrNum.length; i++) {

			arrNum[i] = i + 1;

		}
		// 출력하는 for
		System.out.println("입력된 숫자");
		for (int i = 0; i < arrNum.length; i++) {
//			if(i==0){
//				System.out.print(","+arrNum[i]);
//				continue;
//			}
			if(i==0) {
				System.out.print(arrNum[i]);
			}else {
				System.out.print(","+arrNum[i]);
			}

		}//for-output

	}//main

}//class
