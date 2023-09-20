package P0920;

public class J0920_14 {
	public static void main(String[] args) {
		String str = "abcdefghijklmnoarstuvwxyz";
		//반대로 출력해 보세요.
		System.out.println("제대로 출력 : "+str);
		System.out.println("길이:"+str.length());
		System.out.println("반대로 출력:"+str.charAt(25));
		System.out.println("반대로 출력:"+str.charAt(str.length()-1));
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println("2------------");
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		
		}
		
		
		StringBuffer sb = new StringBuffer(str);
        
        System.out.println(sb.reverse());
	}

}
