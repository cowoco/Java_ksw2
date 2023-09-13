package P0913;

import java.util.*;
import java.text.SimpleDateFormat;


public class J0913_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println(today);
		int[] a = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(a));
		
		java.lang.String str = new String("a");
		Date today = new Date();
		//format설정 - yyyy/MM/dd
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(today));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf.format(today));
		
		//날짜 객체2.
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년도MM월dd일 HH시mm분ss초");
		System.out.println(sdf3.format(cal.getTime()));
	
		

	}

}
