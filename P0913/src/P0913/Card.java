package P0913;

public class Card {
	
	//1
	
	Card(){}
	Card(String kind, int number){
			this.kind = kind;
			this.number = number;
			
	}
	
	final int NUBER_MAX = 13;
	String kind;
	int number;
	int flag;
	String[] CardShape = {"0","1","2","3","4","5","6","7",
					"8","9","10","J","Q","K"};
	
	//J-11, Q-12, k-13
	
	public String toString() {
		return String.format("[%s, %s]", kind,CardShape[number]);
		
	}
	


}
