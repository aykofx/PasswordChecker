import java.util.Scanner;

public class PasswordCheckerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean passwordGood = false;
		
		do {
			
			System.out.println("Enter your password: ");
			String input = scanner.nextLine();
			passwordGood = false;
			
			if (!(input.length() >= 8 )) {
				System.out.println("Your password must have at least 8 characters!");
			}
			
			if (!input.matches(".*\\d.*")) {
				System.out.println("Your password must contain at least 1 number.");
			}
			
			if (!input.matches(".*[A-Z].*")) {
				System.out.println("Your password must have at least 1 capital letter.");
			}
			
			if (!input.matches(".*[^a-zA-Z0-9].*")) {
				System.out.println("Your password must contain at least 1 special character.");
			}
			
			if (input.length() >= 8 && input.matches(".*\\d.*") && input.matches(".*[A-Z].*") && input.matches(".*[^a-zA-Z0-9].*") ){
				System.out.println(input+ " Is a very save password.");
				passwordGood = true;
			}
			
		} while (!passwordGood);
		
		scanner.close();
	}

}
