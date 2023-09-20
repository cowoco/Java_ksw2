package P0919;

public class KorPerson {

	KorPerson() {
	}

	KorPerson(String juminNo, String name) {
		this.juminNo = juminNo;
		this.name = name;

	}// KorPerson

	String juminNo;
	String name;

	@Override // eq+ctrl+sp
	public boolean equals(Object obj) {
		boolean temp = false;
		KorPerson k = (KorPerson) obj;
		if(juminNo.equals(k.juminNo)) {
			temp =true;
			
		}else {
			temp=false;
		}

		return temp;
	}

	@Override // tos
	public String toString() {
		return String.format("[%s, %s]", juminNo, name);

	}

}// c
