package Task03;

public class SwapNumbers {
	    public static void main(String[] args) {
	        int a = 2;
	        int b = 5;

	        System.out.println("Before swapping: a = " + a + ", b = " + b);

	        // Swapping using a temporary variable
	        int temp = a;
	        a = b;
	        b = temp;

	        System.out.println("After swapping: a = " + a + ", b = " + b);
	    }
	}


