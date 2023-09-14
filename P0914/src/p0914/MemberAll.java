package p0914;

import java.util.ArrayList;

public class MemberAll{
	ArrayList list = new ArrayList();
	
	
	ArrayList memberRead() {
		Member m = new Member("aaa","111","홍길동","서울","010-111-1111");
		list.add(m);
		Member m2 = new Member("aaa","111","홍길동","서울","010-111-1111");
		list.add(m2);
		Member m3 = new Member("aaa","111","홍길동","서울","010-111-1111");
		list.add(m3);
		Member m4 = new Member("aaa","111","홍길동","서울","010-111-1111");
		list.add(m4);
		Member m5 = new Member("aaa","111","홍길동","서울","010-111-1111");
		list.add(m5);
		
		
		return list;
		
	}

}
