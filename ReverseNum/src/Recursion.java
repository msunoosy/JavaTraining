
public class Recursion {

	static void reverse(int num) {
		if(num<10) {
			System.out.println(num);
			return;
		}else {
		     System.out.print(num%10);
		     reverse(num/10);
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(15);

	}

}
