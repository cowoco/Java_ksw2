import java.util.Scanner;

public class J0905_17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int [] arrNum = new int[10];//입력된 숫자 저장 배열
		int number = 0;//입력한 숫자
		int count = 0; //도전 횟수
		int random = 0; //랜덤 숫자
		
		random = (int)(Math.random()*100)+1;//2-10 -> 10-2+1
		
		
		while(true) {
			System.out.println((count+1)+"번째 숫자를 입력하세요.");
			number =scan.nextInt();
			arrNum[count]= number; //배열에 입력한 숫자 저장
			
			//System.out.println("도전횟수 : "+(count+1));
			//System.out.println("입력한 숫자 : "+number);
			//입력된 국자와 랜덤숫자 비교 
			if(random==number) {
				System.out.println("정답입니다.");
				break;
			}else if(random>number) {
				System.out.println("입력한 숫자보다 큰수 입니다.");
				
			}else {
				System.out.println("입력한 숫자보다 작은 수 입니다.");
			}
			
			
			count++;
			if(count>9) {
				System.out.println("10번 완료! 프로그램 종료 합니다.");
				count--;
				break;
			}
		}//while
		
		//도전 횟수 출력 
		System.out.println("도전 횟수 : "+(count+1));
		
		//입력한 숫자 출력 
		System.out.println("입력한 숫자"+number);
		for(int i =0; i<9; i++) {
			if(i==0) {
				System.out.print(arrNum[i]);
				continue;
			}
			System.out.print(","+arrNum[i]);
			
		}
		
		
		//랜덤숫자 출력 
		System.out.println();
		System.out.println("랜덤 숫자"+random);
		
		
		
	}//main

}//class
