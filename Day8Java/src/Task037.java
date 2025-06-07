class Task037 extends Employee {

    Task037() {
        // Can't do super.pwd = 1254; directly, so use setter
        setPwd(1254);          // Allowed via public method

        super.Salary = 50000;  // Allowed: protected field in superclass
        super.empid = 10001;   // Allowed: public field
    }

    public static void main(String[] args) {
        Task037 hr = new Task037();

        System.out.println("Pwd (via getter): " + hr.getPwd());
        System.out.println("Salary: " + hr.Salary);
        System.out.println("Emp ID: " + hr.empid);
    }
}
