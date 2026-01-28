package day2;

public class code3 {
	public static void main (String args[]) {
		swap(10,20);
	}
	private static void swap(int a, int b) {
	    a = a + b;
	    b = a - b;
	    a = a - b;

	    System.out.println("a:" + a);
	    System.out.println("b:" + b);
	}

}
