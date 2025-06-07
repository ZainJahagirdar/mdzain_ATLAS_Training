class Customer {
    // Fields declared in the class scope (not inside a method)
    int cost = 40;
    String items = "Tomatoes";

    void purchaseList() {
        System.out.println("Customer purchased: " + items + " for Rs." + cost);
    }
}

