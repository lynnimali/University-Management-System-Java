public abstract class Staff extends Person {
    private double salary;

    public Staff(String name, int id, double salary) {
        super(name, id);   // use of super
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void performDuties();
}
