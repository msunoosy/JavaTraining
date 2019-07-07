import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> ls = Student.getAllStudents();
		List<Student> nls = new ArrayList<Student>();
		for(Student s:ls) {
			if(s.getMarks()>=50) {
				nls.add(s);
			}
		}
		System.out.println(ls.size());
		System.out.println(nls.size());
		
		System.out.println("using stream");
		stream();

	}
	
	public static void stream() {
        List<Student>students=Student.getAllStudents().stream().filter(s->s.getname().contains("s")).collect(Collectors.toList());
        System.out.println(students.size());
        
    }
	
}
