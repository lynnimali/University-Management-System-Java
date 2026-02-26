public class Student extends Person implements Registrable, Payable {

    private String course;
    private double fee;

    public Student(String name, int id, String course, double fee) {
        super(name, id);
        this.course = course;
        this.fee = fee;
    }

    // Method overriding
    @Override
    public void displayRole() {
        System.out.println("I am a Student.");
    }

    @Override
    public void registerCourse(String courseName) {
        this.course = courseName;
        System.out.println(getName() + " registered for " + courseName);
    }

    @Override
    public double calculatePayment() {
        return fee;
    }
}