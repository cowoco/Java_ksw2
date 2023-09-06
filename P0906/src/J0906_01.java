
public class J0906_01 {

	public static void main(String[] args) {

		int[] num = new int[100];// 100 -> 주소는 0~99 99-0+1

		int[] random = new int[6];
//		random[0] =(int)(Math.random()*45);//0-44
//		random2[1] =(int)(Math.random()*45);//0-44
//		random3[2] =(int)(Math.random()*45);//0-44
//		random4[3] =(int)(Math.random()*45);//0-44
//		random5[4] =(int)(Math.random()*45);//0-44
//		random6[5] =(int)(Math.random()*45);//0-44

		for (int i = 0; i < num.length; i++) {// num[0], num[1].....num[44] //num.length; 배열의 길이 100이면 100이나옴
			random[i] = i + 1; // 1,11,21,31

		} // for
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}

		int n = 0;
		for (int i = 0; i < random.length; i++) {
			n = random[i];// 0-44
			System.out.println(num[n]);
		}
//		System.out.println("랜덤뽑기 : "+num[random]);
//		System.out.println("랜덤뽑기 : "+num[random2]);
//		System.out.println("랜덤뽑기 : "+num[random3]);
//		System.out.println("랜덤뽑기 : "+num[random4]);
//		System.out.println("랜덤뽑기 : "+num[random5]);
//		System.out.println("랜덤뽑기 : "+num[random6]);

//		for(int i=0; i<num.length; i++) { //nun.length 자동으로 숫자 인식
//			System.out.println(num[i]);
//			
//		}//for2

	}// main

}// class
