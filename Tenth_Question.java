package Assignment1;

public class Tenth_Question {

	public static void main(String[] args) {
		String [] name = {"Java","JavaScript","Selenium","Python","Mukesh"};
		for(int i=0; i<name.length; i++) {
			if(name[i] == "Selenium") {
				System.out.println("The programme breaks as Selenium word comes");
				break;
			}
			System.out.println(name[i]);
		}
	}
}
