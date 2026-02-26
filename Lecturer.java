public class Lecturer extends Staff implements Payable {

    private String department;

    public Lecturer(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("I am a Lecturer.");
    }

    @Override
    public void performDuties() {
        System.out.println("Teaching students in " + department + " department.");
    }

    @Override
    public double calculatePayment() {
        return getSalary();
    }
}
