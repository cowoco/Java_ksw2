package P0919;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class J0919_06 {

	public static void main(String[] args) throws Exception{

		File f = new File("C:/download/aaa.txt");
		if (!f.exists()) {
			f.createNewFile();
		

		} // if
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter writer = new BufferedWriter(fw);
			writer.write("안녕하세요. 반갑습니다. \r\n 두번째 줄입니다.\r\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일이 생성 되었습니다.");

	}

}
