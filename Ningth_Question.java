package Assignment1;

public class Ningth_Question {

	public static void main(String[] args) {
		int [] num = {12,34,66,85,900};
		for(int pr:num) {
			if(pr == 85) {
				System.out.println("The program breaks as the number is 85");
				break;
			}
			System.out.println(pr);
		}

	}

}
