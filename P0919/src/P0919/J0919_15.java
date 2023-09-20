package P0919;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class J0919_15 {

	public static void main(String[] args) throws Exception {
		// lee1,lee2

		File f = new File("c:/bbb");
		if (!f.exists()) { // 폴더가 있는지 확인해서
			f.mkdir();// 폴더를 만들어라
		}

		FileInputStream fis = new FileInputStream("c:/aaa/lee1.jpg");
		FileInputStream fis2 = new FileInputStream("c:/aaa/lee2.jpg");
		FileOutputStream fos = new FileOutputStream("c:/bbb/lee1.jpg");
		FileOutputStream fos2 = new FileOutputStream("c:/bbb/lee2.jpg");

		while (true) {
			int read = fis.read();
//			int read2 = fis2.read();
			if (read == -1)break;
//			if (read2 == -1)break;
			fos.write(read);
//			fos.write(read2);

		}
		fis.close();
		fos.close();
//		fis2.close();
//		fos2.close();

		System.out.println("파일이 복사 되었습니다.");

	}

}
