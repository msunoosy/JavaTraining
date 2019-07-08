import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ListSample {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("sunoos");
		ls.add("siraj");
		ls.add("zaky");
		ls.add("Rizan");
Scanner sc=new Scanner(System.in);
System.out.println("enter the name :-");		
		String search = sc.next();
		if (ls.contains(search)) {
			System.out.println("Search found " + search.toUpperCase());
			System.out.println("index is " + ls.indexOf(search));
			ls.set(ls.indexOf(search),"newitem");
		} else {
			System.out.println("not found");
		}
		
		for(String s:ls) {
			System.out.println(s+" index is "+ls.indexOf(s));
		}

	}

}
