package P0920_입출력;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class J0920_wirter {
	
	public static void main(String[] args) {
		
		//글을 저장 할때 사용
		String str ="3,김종국,100,100,100,300,100.0,1\r\n";
		 str +="4,하하,100,100,100,300,100.0,1\r\n";
		 str +="5,지석진,100,100,100,300,100.0,1\r\n";
		 
		 
		 
		try {
			FileWriter fw = new FileWriter("c:/aaa/22.txt",true);//flase: 덮어쓰기 true: 이어쓰기
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(str);
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 
		System.out.println("글을 저장했습니다");
		 
		 
	}

}
