public class Task035 {


    static void add(char x, char y) {
        System.out.println("Characters: " + x + ", " + y);
    }


    static void add(int x, int y) {
        System.out.println("Integers: " + x + ", " + y);
    }

    public static void main(String[] args) {
        add('d', 'a');       // Calls char version
        add(100, 100);       // Calls int version
    }
}
