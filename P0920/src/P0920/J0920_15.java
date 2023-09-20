package P0920;

public class J0920_15 {
	public static void main(String[] args) {
		int a = -5;
		System.out.println(Math.abs(a));
		
		
		
		double b = 12.912;
		System.out.println(Math.ceil(b)); //소수점 첫째자리 올림
		System.out.println(Math.floor(b));//소수점 첫째자리 버림
		System.out.println(Math.round(b));//반올림
		
		
		int no1 = 10;
		int no2 = 15;
		int no3 = 13;
		System.out.println("더 큰 비교 값 출력:"+Math.max(no1, no2));
		System.out.println("더 작은 비교 값 출력:"+Math.min(no1, no2));
		
		//3개의 no1,no2,no3 최대값과 최소값을 출력하시오 
		System.out.println("더 큰 비교 값 출력:"+Math.max(Math.max(no1, no2),no3));
		System.out.println("더 작은 비교 값 출력:"+Math.min(Math.min(no1, no2),no3));
		
		int max;
		if(no1>=no2 && no1>no3) {
			max = no1;
		
		}else if(no2>no1 && no2>no3) {
			max = no2;
		}else {
			max = no3;
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		
		int min;
		if(no1<=no2 && no1<=no3) {
			min = no1;
		
		}else if(no2<no1 && no2<no3) {
			
			min = no2;
		}else {
			min = no3;
		}
		System.out.println("가장 작은 수는 " + min + "입니다.");
	}

}
