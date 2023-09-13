package P0913;

public class Tv extends Product {
	
	int size;
	
	Tv(){
		this("삼성TV70",1000000,10000,70);
	}
	Tv(String pName, int price,int bonusPiont,int size){
		this.pName =pName;
		this.price =price;
		this.bonusPiont =bonusPiont;
		this.size =size;
		
		
		
	}

}
