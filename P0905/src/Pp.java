import java.util.Scanner;

public class Pp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//1-100까지의 랜덤숫자를 생성해서 맞추는 프로그램을 구현
		//1.랜덤 숫자 생성
		//2. while 무한 반복
		//3. num 숫자 입력받기 
		//4. if 를 사용해서 랜덤 숫자와 입력숫자가 맞는 비교 
		//5. 큰수, 작은수, 정답 -break;
		System.out.println("숫자 맞추기 게임");
		int random = (int)(Math.random()*100)+1;
		int num = 0;
		while(true) {
			System.out.println("1-100까지 숫자 선택");
			num = scan.nextInt();
			if(random==num){
				System.out.println("정답입니다.");
				break;
				
			}else if(random>num){
				System.out.println("입력하신 수 보다 큽니다.");
			}else {
				System.out.println("입력하신 수 보다 작습니다.");
			}
		}
		
	}

}
