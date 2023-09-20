package P0920;

public class J0920_13 {
	public static void main(String[] args) {
		
		
		int no =0;
		for(int i=0; i<10; i++) {
			no += i;
		}
		System.out.println(no);
		
		//2. String객체 반복 - 반복횟수만큼 메모리 공간
		String str ="aaa";
		for(int i=0; i<10000; i++) {
			str += ""+ i;
		}
		System.out.println(str);
		
		
		//3. StringBuffer객체 반복 - 1개 메모리 공간 사용
		StringBuffer sb = new StringBuffer("aaa");
		//StringBuffer s = "aaa";//사용불가
		for(int i=0; i<10; i++) {
			sb.append(i);//문자를 추가 -apeend
			
		}
		System.out.println(sb);
		
		//4.StringBuffer 비교 -equals() 정의되어 있지 않음 
		StringBuffer sb1 = new StringBuffer("abc");//StringBuffer
		StringBuffer sb2 = new StringBuffer("abc");
		
		if(sb1.equals(sb2)) {
			System.out.println("sb1,sb2는 같음");
		}else {
			System.out.println("sb1,sb2는 다름");
			
		}//
		String s1 = sb1.toString();//StringBuffer객체를 
		String s2 = sb1.toString();
		if(s1.equals(s2)) {
			System.out.println("sb1,sb2는 같음");
		}else {
			System.out.println("sb1,sb2는 다름");
			
		}
		
	}

}
