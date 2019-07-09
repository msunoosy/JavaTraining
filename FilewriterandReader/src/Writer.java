import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	 static void write() throws IOException {
		FileWriter fr = new FileWriter("/home/user/Desktop/ss.txt");
		BufferedWriter br = new BufferedWriter(fr);
		for (int i = 1; i <= 10; i++) {
			br.write("ss"+i);
			br.newLine();
		}
		br.close();
		System.out.println("file writed");
	}
}
