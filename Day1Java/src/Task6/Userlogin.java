package Task6;
import java.util.Scanner;
public class Userlogin {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking input
	        System.out.print("Enter your login ID: ");
	        String id = scanner.nextLine();

	        System.out.print("Enter your password: ");
	        String pwd = scanner.nextLine();

	        // Masking the password
	        String maskedPwd = "*".repeat(pwd.length());

	        // Output
	        System.out.println("\nHi,\n");
	        System.out.println("\tYour login id is " + id);
	        System.out.println("And your pwd is " + maskedPwd);
	        
	        scanner.close();
	    }
	}

