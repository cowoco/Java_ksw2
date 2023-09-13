package P0913;

public class Computer extends Product{
	
	String cpu;
	
	Computer(){
		
	}
	Computer(String pName, int Price,int bounsPiont,String cpu){
		this.pName = pName;
		this.price = Price;
		this.bonusPiont = bonusPiont;
		this.cpu = cpu;

		
	}
}
