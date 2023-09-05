
public class Ja0831_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 1.6;
		int i = (int)d; //  형변환 - 정수부분만 입력
		
		System.out.println(i);
		
		
		int x = 10;
		double d2 = x;
	//	double d2 = (double)x;// 자동 현 변환 - double운 생략가능
		System.out.println(d2); 
		
	// 크기순서 : char,byte,short -> int -> long -> float  -> double  -> String
		
		
		
		
		System.out.println(10/3.0F);
		//실수형 값 %f , 정수형 값 %d , 문자열값 %s
		System.out.printf("%.1f \n", 10/3.0); // \n: 줄바꿈 \t: 사이띄움
		System.out.println("hi");
		System.out.printf("%s \n", "홍길동 입니다.");
		System.out.printf("%,22d", 100000000); //,천단위 표시 | 0 -> 남는 자리 0으로 채움.
		System.out.printf("국어 : % d , 영어 : % d \n", 100,99);
		System.out.printf(null, args);
		
	}

}
