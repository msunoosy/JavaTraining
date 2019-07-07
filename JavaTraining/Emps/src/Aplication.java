import java.util.List;
import java.util.ArrayList;

public class Aplication {

	public static void main(String[] args) {

		List<Student> ls = new ArrayList<Student>();

		ls.add(new Student("sunoos", 50));
		ls.add(new Student("dsadsa", 50));
		ls.add(new Student("cvcvxc", 20));
		ls.add(new Student("xzczzx", 50));
		ls.add(new Student("fsdffd", 50));
		ls.add(new Student("jhgmnh", 50));
		ls.add(new Student("ghhnfg", 50));
		ls.add(new Student("fdfdsf", 50));
		ls.add(new Student("dasdas", 50));
		ls.add(new Student("vbgnyu", 50));
		
		
		for (Student s : ls) {
			System.out.println(s.name.toUpperCase() + "  |  " + s.marks);
		}


	}

}
