
public class Ja0831_14 {
	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		long c = a * b;
		System.out.println(c);

		int x = 1000000;
		int y = 2000000;
		long z = (long) x * y; // long * int, long * long = long
		System.out.println(z);

		long num = (long) a * x / y;
		System.out.println(num);

		long num2 = (long) a / x * y;
		System.out.println(num2); // overflow가 일어나지 않도록 항상 long을 표시\
		
		
		int i = 5;
		int j = 1;
		i =  i + j; //i =2
		i += j; //축약형
		
		

	}

}
