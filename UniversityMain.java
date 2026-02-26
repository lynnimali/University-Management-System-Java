public class UniversityMain {

    public static void main(String[] args) {

        // Creating objects
        Student student = new Student("Lynn", 101, "Computer Science", 50000);
        Lecturer lecturer = new Lecturer("Dr. Smith", 201, 120000, "IT");
        Administrator admin = new Administrator("Mr. John", 301, 90000, "Main Block");

        // Demonstrating inheritance and method overriding
        student.displayRole();
        lecturer.displayRole();
        admin.displayRole();

        System.out.println();

        // Calling interface methods
        student.registerCourse("Software Engineering");
        System.out.println("Student Fee: " + student.calculatePayment());

        System.out.println();

        lecturer.performDuties();
        System.out.println("Lecturer Salary: " + lecturer.calculatePayment());

        System.out.println();

        admin.performDuties();
    }
}