import java.util.Scanner;


public class Ja0901_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자 한개를 입력하세요");
		String str = scan.nextLine(); //문자열을 입력받느
		char ch = str.charAt(0);//String 첫번째 주소
		
		
		
		if((ch>='a'&& ch <='z')||(ch>='A'&& ch <='Z'))
			System.out.println("영어 소문자");
		else
			System.out.println("영어 소문자 아님");
		
		System.out.println("입력문자 아님"+ch);
		
		System.out.println("입력한 글자 길이: " +str.length());
		System.out.println("입력한 문자:"+ch);
		
		
	}

}
