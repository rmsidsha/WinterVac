import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) throws IOException {
		String pathName = "D:\\test.txt";
		try {
		FileReader fr = new FileReader(pathName);
		FileWriter out = new FileWriter("D:\\copy.txt");{
			
			int ch;
			while((ch=fr.read())!=-1) {
				System.out.println((char)ch);
				fr.close();
				out.write(ch);
			}
		}
		}catch(IOException e) {
			
		}
	}
}
