package P0913;

public class Deck {

	String[] shape = { "Heart", "Spade", "Diamond", "Clover" };
	Card[] c = new Card[52]; // 13장 카드를 Heart,1-13 13장 Spade, 1-13 13*4 =52

	Deck() {// 기본생성자
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card(shape[i / 13], i % 13 + 1);
		}
	}//Deck

	// 특정번호 카드 가져오기
	Card pick(int no) {
		if (no > 52) {
			System.out.println("숫자를 잘못 선택하셨습니다.");
			return c[no % 52];
		}
		return c[no];//c:주소값 
	}//pick

	// 랜덤으로 카드 가져오기
	Card pick() {
		int random = (int) (Math.random() * 52);
		return c[random];
	}//pick-random

	void shuffle() {
		Card temp;
		for (int i = 0; i < 1000; i++) {
			int random = (int) (Math.random() * 52);
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		} // for
	}//shuffle

	// 모든 카드출력메소드
	// 메소드 첫글자는 소문자여야 함
	void cardPrint() {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}//for
	}//cardPrint

}
