package P0920;

public class J0920_11 {

	public static void main(String[] args) {
		String str ="Hello World";
		String input ="hello world";
		if(str.equals(input)) {
			System.out.println("str,input 같음");
		}else {
			System.out.println("str,input 다름");
		}
		
		String str2 =str.toLowerCase();//소문자로 변환 
		System.out.println(str2);
		if(str2.equals(input)) {
			System.out.println("str,input 같음");
		}else {
			System.out.println("str,input 다름");
		}
		
		
	}

}
