
public class Ja0831_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		a++;
		System.out.println(a);

		int b = 10;
		int c = 10;
		b--;
		b--;
		--b;
		--b;
		--b;
		b--;
		
		c=b; //분리해서 적는거 
		
		
		System.out.println(b);
		
		boolean power = true;
		System.out.println(power);
		power = !power;
		System.out.println(!power);
		power = !power;
		System.out.println(power);
		
		char ch = 'A';
		char ch2 = 'a';
		System.out.println(ch+ch2); //65+97 =162
		System.out.printf("%c,%c\n",ch,ch2);
	}

}
