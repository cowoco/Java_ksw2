package P0920;

import java.util.Scanner;

public class J0920_07 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str = new String(
				"(샌프란시스코=연합뉴스)김태종특파원=애플의최신스마트폰인아이폰15판매우려가커지는가운데사전주문이 호조세를 보이고 있다는 분석이 나왔다.\r\n"
				+ "\r\n"
				+ "모건스탠리는18일(현지시간)보고서에서아이폰15의 리드타임(주문부터 실제 납품까지 걸리는 시간)과 사전 예약 판매가 \"우려했던 것보다 낫다\"고 밝혔다.\r\n"
				+ "\r\n"
				+ "지난 12일 공개된 아이폰15 시리즈는 15일부터 사전 주문에 들어갔다. 모건스탠리는 아이폰15 프로 맥스의 리드타임은 평균 5∼6주 정도로 \"지난 7년 동안 출시된 모델 중 가장 길다\"고 썼다. 프로 맥스는 아이폰 시리즈 가운데 애플이 주력하고 있는 최상위 모델이다\r\n"
				+ "\r\n"
				+ "(샌프란시스코=연합뉴스)김태종특파원=애플의최신스마트폰인아이폰15판매우려가커지는가운데사전주문이호조세를보이고있다는분석이나왔다.\r\n"
				+ "\r\n"
				+ "모건스탠리는18일(현지시간)보고서에서아이폰15의리드타임(주문부터실제납품까지걸리는시간)과사전예약판매가\"우려했던것보다낫다\"고밝혔다.\r\n"
				+ "\r\n"
				+ "지난12일공개된아이폰15시리즈는15일부터사전주문에들어갔다.모건스탠리는아이폰15프로맥스의리드타임은평균5∼6주정도로\"지난7년동안출시된모델중가장길다\"고썼다.프로맥스는아이폰시리즈가운데애플이주력하고있는최상위모델이다");
		
		System.out.println(str);
		System.out.println("--------");
		
		while(true) {
		System.out.println("찾고자하는 글자를 입력하세요.(0 중지)");
		String search =scan.next();
		
		if(search.equals("0")) {
			System.out.println("프로그램종료");
			break;
		}
		
		
		
		
		String[]s =str.split(" ");
		int count=0;
		for(int i=0; i<s.length; i++) {
			int n =s[i].indexOf(search);
			if(n != -1)count++;
			
		}
		System.out.println("개수 : "+count);
		
		

		}
		
	}

}