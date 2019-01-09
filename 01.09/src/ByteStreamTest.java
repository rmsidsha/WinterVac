import java.util.*;
import java.io.*;

public class ByteStreamTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	/*	System.out.println("원본 파일 입력");
		String inputFileName = sc.nextLine();
		System.out.println("복사 파일을 입력");
		String outputFileName = sc.nextLine();*/
		
		try(InputStream is = new FileInputStream("D:\\test.txt");
				OutputStream os = new FileOutputStream("D:\\testCopy.txt")){
			int c;
			while((c=is.read())!=-1) {
				os.write(c);
			}
		}catch(IOException e) {
			
		}
		System.out.println("로 복사했습니다.");

	}

}
