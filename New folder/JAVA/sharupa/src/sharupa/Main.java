package sharupa;
import java.util.Scanner;
public class Main {
	

		
		public static void main(String args[]) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter an email which you would like to verify for correctness: ");
			String email = scanner.nextLine();
			EmailTest1 emailVerifyer = new EmailTest1();
			System.out.println("Output: ");
			System.out.println(emailVerifyer.isEmail(email));
		}
	
}
