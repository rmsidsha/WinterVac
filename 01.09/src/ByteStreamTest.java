import java.util.*;
import java.io.*;

public class ByteStreamTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	/*	System.out.println("���� ���� �Է�");
		String inputFileName = sc.nextLine();
		System.out.println("���� ������ �Է�");
		String outputFileName = sc.nextLine();*/
		
		try(InputStream is = new FileInputStream("D:\\test.txt");
				OutputStream os = new FileOutputStream("D:\\testCopy.txt")){
			int c;
			while((c=is.read())!=-1) {
				os.write(c);
			}
		}catch(IOException e) {
			
		}
		System.out.println("�� �����߽��ϴ�.");

	}

}
