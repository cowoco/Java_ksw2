public class Ja0904_11 {

	public static void main(String[] args) {
		//1부터 100까지의 합 : 5050
		//1부터 100까지의 합에서 합이 200을 넘는 때는 언제 일까요?  i를 출력하시오.
		
		//1, 1부터 100까지의 합을 구함
		//2. 조건문을 사용해서 sum 200이상일 때를 구함
		int i = 0, sum =0;
		
		for(i = 1 ; i<=100;i++) {
			sum += i;
			if(sum >= 200) {
				break;
			}
	
		}
	
		System.out.println("1부터 100까지 합 : " + sum);
		
		
		
		
		
		
//		//1부터 100까지의 합을 출력하시오 
//		int i = 0;
//		int sum = 0;
//		
//		for(i= 1; i<=10; i++){
//			
//			sum += i;
//		}
//		
//		System.out.printf("1부터  %d까지의 합계: %d \n ",i-1,sum);
		
		
		
		
//		int i = 0;
//		int sum = 0;
//
//		for (i = 1; i <= 1000; i++) { //초기화; 조건식; 증감식;
//			System.out.println(i);
//			sum = sum + i;
//
//		}
//		System.out.println("for 문 밖 i :" + i);
//		System.out.println("for 문 밖 sum : " + sum);

	}// main

}// class
