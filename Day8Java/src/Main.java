// Main class to demonstrate abstraction
public class Main {
    public static void main(String[] args) {
        Gadgets remote1 = new TVRemote();
        remote1.turnOn();
        remote1.turnOff();

        Gadgets remote2 = new ACRemote();
        remote2.turnOn();
        remote2.turnOff();

        Gadgets remote3 = new FanRemote();
        remote3.turnOn();
        remote3.turnOff();

        Gadgets remote4 = new CoolerRemote();
        remote4.turnOn();
        remote4.turnOff();
    }
}
