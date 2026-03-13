import java.util.Scanner;

public class UniversityMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println(" University Management System ");

            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.print("Enter student ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Enter course: ");
            String course = input.nextLine();

            System.out.print("Enter fee amount: ");
            double fee = input.nextDouble();

            // Creating object using user input
            Student student = new Student(name, id, course, fee);

            System.out.println("\n Student Details ");

            student.displayRole();
            student.registerCourse(course);

            System.out.println("Fee Payment: " + student.calculatePayment());

        }

        catch (Exception e) {

            System.out.println("Invalid input! Please enter the correct data type.");

        }

        finally {

            System.out.println("Program executed successfully.");
            input.close();

        }
    }
}
