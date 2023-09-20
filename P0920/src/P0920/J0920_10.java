package P0920;

public interface J0920_10 {
	
	public static void main(String[] args) {
		String str ="swim,golf,book,run,game";
		String[] hpbby =str.split(",");
		for(String h:hpbby) {
			System.out.println(h);
		}
		//배열에 담아 출력하시오 
	
		String str2 ="수영/골프/독서/조깅/게임";
		String[] hpbby2 =str.split("/");
		for(String h2:hpbby2) {
			System.out.println("h2: "+ h2);
		}
		
		String str3 ="수영/골프/독서/조깅/게임";
		String[] hpbby3 =str3.split("/");
		for(String h3:hpbby3) {
			System.out.println(h3);
		}
		
		String str4 ="자바-파이썬-C-자바스크립트-리액트";
		String[] subject = str4.split("-");
		for(String h4:subject) {
			System.out.println(h4);
		}
		

	}

}
