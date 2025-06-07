// Abstract class
abstract class Task038 {
    private String name;
    private String address;
    private int number;

    public Task038(String name, String address, int number) {
        System.out.println("Constructing a Task038 (Employee)");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay() {
        System.out.println("Inside Task038 computePay");
        return 0.0;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}

// Concrete subclass
class SalariedEmployee extends Task038 {
    private double salary;

    public SalariedEmployee(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;
    }

    @Override
    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary / 12;
    }

    @Override
    public void mailCheck() {
        System.out.println("Mailing check to " + getName() + " with monthly salary: " + computePay());
    }
}



