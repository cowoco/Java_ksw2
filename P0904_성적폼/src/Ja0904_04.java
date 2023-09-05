import java.util.Scanner;

public class Ja0904_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 90점 이상 A, 80 점 B, 70점이상 C,
		// 98점이상 이면 a+ 93점 이하는 a-

		String grade = "";
		System.out.println("점수를 입력하시오. ");
		int score = scan.nextInt();

		System.out.printf("점수는 %d 점\n", score);

		if (score >= 90) {
			// System.out.print("A");
			grade = "A";
			if (score >= 98) {
				// System.out.println("+");
				grade = grade + "+";
			} else if (score <= 93) {
				// System.out.println("-");
				grade = grade + "-";
			} else {
				System.out.println();
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 88) {
				grade = grade + "+";
			} else if (score <= 83) {
				grade = grade + "-";
			} else {
				System.out.println();
			}
		} else if (score >= 70) {
			// System.out.print("C");
			grade = "c";
			if (score >= 78) {
				// System.out.println("+");
				grade = grade + "+";
			} else if (score <= 73) {
				// System.out.println("-");
				grade += "-"; // grade = grade +"-"
			} else {
				System.out.println();
			}
		} else if (score >= 60) {
			grade = "D";
			if (score >= 68) {
				grade += "+";
			} else if (score <= 63) {
				grade += "-";
			} else {
				System.out.println();
			}
		} else {
			grade = "F";
		}

		System.out.println("학점 : " + grade);

	}// main
}// class
