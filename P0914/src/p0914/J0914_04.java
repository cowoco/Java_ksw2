package p0914;

public class J0914_04 {
	public static void main(String[] args) {
		
		
		
		
		//상품을 구매하는 형태 
		Buyer b1 = new Buyer("aaa","홍길동");
		System.out.printf("%s잔액 : %d \n",b1.name,b1.money);
		
		
		b1.buy(new Tv());// Tv t
		b1.buy(new Tv());
		b1.buy(new Tv());
		
		b1.buy(new Computer());
		b1.buy(new Audio());
		b1.buy(new Washing());
		
		System.out.printf("%s잔액 : %d \n",b1.name,b1.money);
		System.out.println("상품구매 저장 크기 : "+b1.list.size());;
		b1.list.get(0);
		System.out.println("[ 상품 구매 목록 ]");
		
		
		if(b1.list.isEmpty()) {
			System.out.println("구매 물품이 없습니다.");
		}
		int sum =0;
		for(int i=0; i<b1.list.size(); i++) {	
			Product p =(Product)b1.list.get(i);
			sum += p.price;
			System.out.println(p);


		}//for
		
		System.out.printf(" 총 구매 금액 %,d원 \n",sum);

		

//		Tv t3 = new Tv();
//		System.out.println(t.price);
//		b1.money -= t3.price;//b1.money = b1.money -t.price;
//		b1.bonusPiont += t3.bonusPiont;
		
		
	

	}//m
}//c
