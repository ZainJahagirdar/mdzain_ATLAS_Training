class Employee {
    private int pwd;
    protected int Salary;
    public int empid;

    Employee() {
        // You can initialize here
    }

    // Getter and setter for pwd to allow subclass access indirectly
    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public int getPwd() {
        return pwd;
    }
}


