public class Task034 {

    // Method with 2 parameters
    static void add(int x, int y) {
        System.out.println("Two parameters: x = " + x + ", y = " + y);
    }

    // Method with 3 parameters
    static void add(int x, int y, int z) {
        System.out.println("Three parameters: x = " + x + ", y = " + y + ", z = " + z);
    }

    public static void main(String[] args) {
        add(10, 20, 30);  // Calls the method with 3 parameters
        add(50, 100);     // Calls the method with 2 parameters
    }
}
