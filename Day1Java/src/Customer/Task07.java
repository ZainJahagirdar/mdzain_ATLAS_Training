package Customer;

class Customer {
    Customer() {
        
        System.out.println("Customer object created");
    }

    void accept() {
        System.out.println("accept customer called");
    }

    void display() {
        System.out.println("display customer called");
    }
}


public class Task07 {
    public static void main(String[] args) {
        Customer cobj = new Customer();  
        cobj.accept();                   
        cobj.display();                  
    }
}

