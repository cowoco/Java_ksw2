
public class Ja0901_05 {
	public static void main(String[] args) {

		int num = 12345;
		int result = 1234 * 100000 / 100000;
		System.out.println(result);

		double pi = 3.141592;
		double shortPi = (int) (pi * 1000) / 1000.0;
		System.out.println("pi : " + pi);
		System.out.println("shortPi : " + shortPi);

		// 소수점 4자리 이하 절삭하시오.
		double d = 123.15235678;
		double shord = (int) (d * 10000) / 10000.0;
		System.out.println(d);
		System.out.println(shord);

		// 소수점 2자리 이하 절삭
		double a = 2563.12121245;
		double shorta = (int) (a * 100) / 100.0;
		System.out.println(a);
		System.out.println(shorta);
		
		
		System.out.println("-------------------");
		
		
		//소수점 첫째 자리에서 반올림,올림,내림, 결정
		//Math.round() - 반올림 , Math.ceil()-올림, Math.floor() -버림 
		double n = 12.598;
		double n2 = 2.321;
		System.out.println(Math.round(n));
		System.out.println(Math.ceil(n2));
		System.out.println(Math.floor(n));
		
		
		//소수점 둘째 자리 반올림.
		//double n3 = (int)(n*100)/100.0;
		double n3 = Math.round(n*10)/10.0;
		System.out.println("둘째자리 반올림: " +n3);
		
		//소수점 넷째 자리 반올림
		double x = 156.7854294;
		double x2 = Math.round(x*1000)/1000.0;
		System.out.println("넷째자리 반올림"+ x2);
		

	}
}
