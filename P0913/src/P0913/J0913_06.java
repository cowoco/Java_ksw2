package P0913;

public class J0913_06 {
	public static void main(String[] args) {

		FireEngine f1 = new FireEngine();

		f1.water(); // car메소드
		f1.go(); // car메소드
		f1.stop();// FireEngine 메소드
		Ambulance a1 = new Ambulance();
		a1.siren(); // car
		a1.go();
		a1.stop();

		car c1 = new FireEngine();
		c1.go();
		c1.stop();
		// c1.water(); //공간은 있으나 사용은 할 수 없음

		// 다형성
		car c2 = new Ambulance();
		c1.go();
		c1.stop();
		// c1.siren(); //자손의 메소드

		car c3;

		c3 = f1; // 조상 참조변수 = 자손 참조변수
		//c3.water();//공간이 있어도 조상의 참조 변수로는 사용할 수 없음.

		FireEngine f2;
		f2 =(FireEngine)c3;
		System.out.println("f2 : ");
		f2.water();
		
		Ambulance a2;
		FireEngine f3;
		if(c3 instanceof FireEngine) {
			System.out.println("c3는 FireEngine으로 형변환 가능합니다.");	
			f3 =(FireEngine)c3;
			f3.water();
		}
		
		if(c3 instanceof Ambulance) {
			System.out.println("c3는 Ambulance으로 형변환 가능합니다.");
			a2 = (Ambulance)c3;
			a2.siren();
		}
		
//		object o1;
//		o1 = f1;	
//		o1 = a1;
		
		
//		a2 = (Ambulance)c3; //c3에는 FireEngine객체
//		a2.siren();//타입이 다르기에 

	}//main

}
