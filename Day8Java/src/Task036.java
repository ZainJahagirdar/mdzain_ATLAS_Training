public class Task036 {

    // Method 1: int first, then float
    static void add(int x, float y) {
        System.out.println("int, float: " + x + ", " + y);
    }

    // Method 2: float first, then int
    static void add(float x, int y) {
        System.out.println("float, int: " + x + ", " + y);
    }

    public static void main(String[] args) {
        add(10.50f, 60);    // Calls float, int version
        add(100, 80.80f);   // Calls int, float version
    }
}

