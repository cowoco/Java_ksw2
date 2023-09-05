import java.util.Scanner;

public class Ja0901_09_note {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하시오 : ");
		int number = scan.nextInt();
		if(number >=90) {
			System.out.println("A학점 입니다.");
		}else if(number<=89 && number>=80){
			System.out.println("B학점 입니다.");
		}else if(number<=79 && number>=70){
			System.out.println("C학점 입니다.");
		}else if(number<=69 && number>=60){
			System.out.println("D학점 입니다.");
		}else {
			System.out.println("F학점 입니다.");
		}
		

	}

}
