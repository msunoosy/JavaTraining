import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
static void read() throws IOException {
	FileReader FR=new FileReader("/home/user/Desktop/ss.txt");
	BufferedReader Br=new BufferedReader(FR);
	System.out.println("Reading");
	String line;
	while((line=Br.readLine())!=null) {
		System.out.println(line);
	}
}
}
