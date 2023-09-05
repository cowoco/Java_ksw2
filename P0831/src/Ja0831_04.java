
public class Ja0831_04 {
	public static void main(String[] args) {

		String name = "김승우";
		int total = 0;
		int avg = 0;
		int kor = 0;
		int math = 0;
		int eng = 0;

		kor = 99;
		math = 100;
		eng = 98;

		total = kor + math + eng;
		avg = total / 3;

		System.out.println("name : " + name);
		System.out.println("kor : " + kor);
		System.out.println("math : " + math);
		System.out.println("eng : " + eng);
		System.out.println("total : " + total);
		System.out.println("avg : " + avg);

		char grade = 'A';
		char grade2 = ' '; // 빈공백시 에러가 나지만 스페이스를 넣으면 에러 해결
		String str = ""; // Sting type 은 공백이 없어도 상관 없다.

	}

}
