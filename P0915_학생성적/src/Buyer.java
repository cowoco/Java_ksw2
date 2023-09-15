import java.util.ArrayList;

public class Buyer {
	
	Buyer(){
		
	}
	
	
	
	Buyer(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	
	}



	String id;
	String name;
	int money = 10000000;
	int bonusPiont = 0;
	
	
	ArrayList list = new ArrayList();
	
	
	int buy(Product p) {
		if(money<p.price) {
			System.out.println("[경고 잔액이 부족합니다.");
			System.out.println();
			return 0; 	
		}//if
		money -= p.price;
		bonusPiont += p.bonusPiont;
		list.add(p);
		return 1;
	}
	
	
	

}
