package P0913;

public class Audio extends Product {
	String speakerPower;
	
	
	Audio(){
		this("브릿지스피커7800",200000,2000,"15W");
		
	}
	
	Audio(String PName,int price,int bonusPoint, String speakerPower){
		this.pName = pName;
		this.price = price;
		this.bonusPiont = bonusPiont;
		this.speakerPower = speakerPower;
	}
	
	

}
