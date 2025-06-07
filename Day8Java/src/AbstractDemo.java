// Main class
public class AbstractDemo {
    public static void main(String[] args) {
        // Using Task038 as abstract reference type
        Task038 emp = new SalariedEmployee("George W.", "Houston, TX", 43, 60000.00);

        System.out.println("\nCall mailCheck using Task038 reference:");
        emp.mailCheck();
    }
}