public class Mart extends Customer {

    // Method to override values and print
    void billing() {
        items = "Onions"; // inherited from Customer
        cost = 30;        // inherited from Customer

        System.out.println("Billing Items: " + items);
        System.out.println("Billing Cost: " + cost);
    }

    public static void main(String[] args) {
        Mart obj = new Mart();

        // Original purchase list
        obj.purchaseList();

        // Modify inherited fields
        obj.items = "Potatoes";
        obj.cost = 50;

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        // Print updated values
        System.out.println("Updated Items: " + obj.items);
        System.out.println("Updated Cost: " + obj.cost);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        // Run billing
        obj.billing();
    }
}
