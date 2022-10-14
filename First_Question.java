package Assignment1;

public class First_Question {

	public static void main(String[] args) {
		int a = 10; //a=20, b = 10
		int b = 20;
		int temp;
		
		System.out.println("Before Swap!!!");
		System.out.println("First number = " +a);
		System.out.println("Second number = " +b);
		
		// Value of first is assigned to temporary
		temp = a;
		
		// value of second is assigned to 1st
		a = b;
		
		//value of temporary is assigned to second
		b = temp;
		
		System.out.println("**********************");
		
		System.out.println("After Swap!!!");
		System.out.println("First number = " +a);
		System.out.println("First number = " +b);
	}

}
