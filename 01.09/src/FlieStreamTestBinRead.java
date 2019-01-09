import java.io.*;

public class FlieStreamTestBinRead {

	public static void main(String[] args) {
		byte list [] = new byte[6];
		try (FileInputStream out = new FileInputStream("D:\\tes.bin")) {
			out.read(list);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		for(byte b: list) {
			System.out.println(b+" \n");
		}
	}

}
