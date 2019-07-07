import java.io.ObjectInputStream.GetField;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
	public static void main(String[] args) {
		List<Student> ls = Student.getAllStudents().stream().sorted(Comparator.comparing(Student::getname))
				.collect(Collectors.toList());
		System.out.println(ls); // to get detail of the student name by the Alphabatical order.
		
		System.out.println();
		
		List<Student> ls2 =Student.getAllStudents().stream().
				sorted((s1,s2)->new Integer(s1.getname().length()).compareTo(s2.getname().length()))
				.collect(Collectors.toList());
		System.out.println(ls2);
		
		
		//get all the data in list without calling object.
		Student.getAllStudents().stream().forEach(System.out::println);
		
	
			
		}
		
	}
	
	
	

