package P0913;



public class J0913_03 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "Spade";
		c1.number = 1;
		c1.flag = 1; //private 같은 클래스에서만 사용
		System.out.printf("%s","%d",c1.kind,c1.kind);
		System.out.printf("%s","%d",c1.kind,c1.number,c1.flag);
		
		
		//CCard c2 = new CCard();
		
		CCard c2 = new CCard();//public 모든 페키지에서 적용 가능
		
		
		
		

	}

}
