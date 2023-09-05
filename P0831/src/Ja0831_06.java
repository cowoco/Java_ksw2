
public class Ja0831_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2147483647;
		int total =0;
		total = x + 1;
		
		System.out.println(total);
		
		int a = 1000000;
		long b = 1000000;
		long lo = a * b ;  //21억을 넘을것 같다고 하면 long 으로 타입변경
		
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println("lo : "+ lo);
	}

}
