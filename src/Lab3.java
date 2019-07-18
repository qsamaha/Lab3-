import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int userNum;
		String choice = "y";
		
		while (choice.equals("y")) {
		System.out.println("Hello, what is your name?");
		name = scan.nextLine();
		
		System.out.println(name + ", please enter an integer in the range of positive 1-100");
		userNum = scan.nextInt();
		
		if (userNum <= 100 && userNum >= 1) {
		 
		if (userNum % 2 == 0 && (userNum >= 2 && userNum <= 25)) {
	         System.out.println("The number is even and less than 25.");
		}
		if (userNum % 2 == 0 && (userNum >= 26 && userNum <= 60)) {
			 System.out.println("Even");
		}
		if (userNum % 2 == 0 && userNum > 60 ) {
			System.out.println(userNum + " is Even");
		}
		if (userNum % 2 != 0 && (userNum >= 1 && userNum <= 60)) {
			System.out.println(userNum + " is odd");
		}
		if (userNum % 2 != 0 && userNum > 60) {
			System.out.println(userNum + " is odd and over 60");
		}
		}
		else {
			System.out.println("Your number is not in the 1-100 range");
		}
		System.out.println("Continue? (y/n): ");
		scan.nextLine();
		choice = scan.nextLine();
		}
		
		System.out.println("Bye!");
		scan.close();

	}
	}


