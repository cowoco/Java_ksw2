package p0830;

public class Ja0830_02 {
	public static void main(String[] args) {
		
		boolean bo = true;
		boolean bo2 = false;
		char ch = 'a';
		char ch2 = '3';
		byte by = 1;
		short sh = 2;
		int a = 1;
		int b = 20;
		int in = 2100000000;
		long lo = 100L; // L을 넣으면 에러가 나지 않는다.
		float fl = 1.2F; // 소문자해도 상관 없다.
		double d = 11.12;
		double dou = 1.2; // D를 안 붙여도 됨 -> 그러니 당연히 안붙이는게 나음


		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a + b);
		System.out.println(a * b);
		System.out.print(a % b);

	}

}
