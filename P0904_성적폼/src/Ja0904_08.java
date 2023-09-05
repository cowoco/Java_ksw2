
public class Ja0904_08 {

	public static void main(String[] args) {
		
		int num = 9;
		switch (num) {
		case 1:
		case 7:
			System.out.println("SK");
			break;
		case 6:
		case 8:
			System.out.println("KTF");
			break;
		case 9:
			System.out.println("LG");
			break;

		default:
			System.out.println("해당사항 없음");
			break;
		}//switch 딱 떨어지면 스위치 문 
		
		
		if(num==1 || num==7 ) {
			System.out.println("sk");
		}else if(num ==6 || num==8) {
			System.out.println("KTF");
		}else if(num==9) {
			System.out.println("LG");
		}else {
			System.out.println("해당사항 없음");
		}//if
		
		
		
		
		
		
		
		

	}//main

}//class
