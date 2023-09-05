
public class J0905_06 {
	public static void main(String[] args) {
		//구구단 while 문
		int i = 2;
		while(i<=9) {
			int j = 1;
			while(j<=9) {
				System.out.printf("%d  *  %d  =  %d \t", j, i, i * j);
				i++;
			}
		
			i++;
		}
		
		
		
		
		
//		for(int i =2; i<=9; i++) {
//			for(int j =1; j<=9; i++) {
//				System.out.printf("%d  *  %d  =  %d \t", j, i, i * j);
//			}
//		}
//		
		
		
		
		
		
//		//10에서 0까지
//		int i =10;
//		while(i<= 10 && i>=0) {
//			System.out.println(i);
//			i--;
//		}
		
		
		//초기화는 while 문 안에 넣으면 안됨
//		int i =0;
//		while(i>=0) {
//			//i=10;
//			System.out.println(i);
//			i--;
//		}
//		
		
//		//while
//		int i = 10;
//		while(i>=0) {
//			System.out.println(i);
//			i--;
//		}
		
		
		
//		for(int i = 0; i>=0; i--) {
//			System.out.println(i);
//		}//for
	}//main

}//class
