package strings;

public class Main {
	
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "abc";
		
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = "abc";
		String s4 = new String("abc");
		s4 = s4.intern();
		
		System.out.println(s3);
		System.out.println(s4);
		
		if (s1 == s4) {
			System.out.println("IGUAL");
		} else {
			System.out.println("DIFERENTE");
		}
		
		if (s1.equals(s4)) {
			System.out.println("IGUAL");
		} else {
			System.out.println("DIFERENTE");
		}
	}
}
