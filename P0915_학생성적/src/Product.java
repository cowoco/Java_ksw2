
public class Product {
	String name;
	int price;
	int bonusPiont;
	
	
	@Override //조상에 있는걸 그대로 가져온거 
	public String toString() {
		return String.format("%s,%d,%d",name,price,bonusPiont);
	}

}
