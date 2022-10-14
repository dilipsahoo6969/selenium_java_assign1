package Assignment1;

public class Sixth_Question {

	public static void main(String[] args) {
		System.out.println("Prime Numbers from 1 to 1000 are:- ");
		int i,count,j;
		for(i=1; i<=1000; i++) {
			count = 0;
			for(j =1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(i);
			}
		}
	}


}