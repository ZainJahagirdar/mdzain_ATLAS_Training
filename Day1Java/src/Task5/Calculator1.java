package Task5;

public class Calculator1 {

	    
	    public static int add(int a, int b) {
	        return a + b;
	    }

	
	    public static int subtract(int a, int b) {
	        return a - b;
	    }

	   
	    public static int multiply(int a, int b) {
	        return a * b;
	    }

	   
	    public static int divide(int a, int b) {
	        return a / b; 
	    }

	    public static void main(String[] args) {
	        int x = 20;
	        int y = 5;

	        System.out.println("Addition: " + add(x, y));
	        System.out.println("Subtraction: " + subtract(x, y));
	        System.out.println("Multiplication: " + multiply(x, y));
	        System.out.println("Division: " + divide(x, y));
	    }
	}


