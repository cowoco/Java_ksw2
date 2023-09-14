package p0914;

import java.util.ArrayList;

public class J0914_10 {

	public static void main(String[] args) {
		
		//("aaa","111","홍길동","서울","010-111-1111");
		//("bbb","111","홍길동","서울","010-111-1111");
		//("ccc","111","홍길동","서울","010-111-1111");
		//("ddd","111","홍길동","서울","010-111-1111");
		//("eee","111","홍길동","서울","010-111-1111");
		
		
		//배열 5개 입력,출력
		//ArrayList 5개 입력 ,출력
		
		
		Member[] m = new Member[5];
		m[0] = new Member("aaa","1111","홍길동","서울","010-1111-1111");
		m[1] = new Member("bbb","222","유관순","부산","010-1111-1111");
		m[2] = new Member("ccc","333","이순신","대구","010-1111-1111");
		m[3] = new Member("ddd","444","강감찬","인천","010-1111-1111");
		m[4] = new Member("eee","555","김구","광주","010-1111-1111");
		
		for(int i=0; i<m.length; i++) {
			System.out.printf("[%s,%s,%s,%s,%s]\n",m[i].getId(),m[i].getPw(),
					m[i].getName(),m[i].getAddress(),m[i].getPhone());
				
		}
		
		
		
		
//		ArrayList list = new ArrayList();
//		list.add(new Member("aaa","홍길동","서울","010-1111-1111"));
//		
		
		
	}

}
