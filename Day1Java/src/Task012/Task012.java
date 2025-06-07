package Task012;


	import java.util.Scanner;

	public class Task012 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String correctId = "Zain";
	        String correctPwd = "123456789";

	        String inputId, inputPwd;

	        while (true) {
	            System.out.print("Enter Login ID: ");
	            inputId = scanner.nextLine();

	            System.out.print("Enter Password: ");
	            inputPwd = scanner.nextLine();

	            if (inputId.equals(correctId) && inputPwd.equals(correctPwd)) {
	                System.out.println("Login successful!");
	                break; 
	            } else {
	                System.out.println("Invalid login ID or password. Please try again.\n");
	            }
	        }

	        scanner.close();
	    }
	}

