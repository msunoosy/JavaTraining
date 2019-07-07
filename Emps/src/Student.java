import java.util.ArrayList;
import java.util.List;

/**
 * @param name
 * @param marks
 */
public class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;

	}
	
	public static List<Student> getAllStudents() {
	List<Student> ls = new ArrayList<Student>();
	ls.add(new Student("sunoos", 50));
	ls.add(new Student("ss ", 52));
	ls.add(new Student("cvxc", 12));
	ls.add(new Student("xzcx", 31));
	ls.add(new Student("fsdffd", 50));
	ls.add(new Student("jhgmnh", 50));
	ls.add(new Student("ghhnfg", 50));
	ls.add(new Student("fdfdsf", 50));
	ls.add(new Student("dasdas", 50));
	ls.add(new Student("vbgnyun", 50));
	return ls;
	}
	
	
public int getMarks() {
	return this.marks;
}

public String getname() {
	return this.name;
}

@Override
public String toString() {
	return "Student [name=" + name + ", marks=" + marks + "]";
}





}
