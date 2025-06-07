package Task011;

public class Task011 {
	
	    public static void main(String[] args) {
	      
	        String correctId = "Zain";
	        String correctPwd = "123456789";

	     
	        String inputId = "Zain";
	        String inputPwd = "123456789";

	      
	        if (inputId.equals(correctId) && inputPwd.equals(correctPwd)) {
	            System.out.println("Login successful!");
	        } else {
	            System.out.println("Invalid login ID or password.");
	        }
	    }
	}


