import java.util.*;
import java.io.*;

public class UniversityMain {

    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("How many students do you want to enter? ");
            int number = input.nextInt();
            input.nextLine();

            for (int i = 0; i < number; i++) {

                System.out.println("\nEnter details for Student " + (i + 1));

                System.out.print("Name: ");
                String name = input.nextLine();

                System.out.print("ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Course: ");
                String course = input.nextLine();

                System.out.print("Fee: ");
                double fee = input.nextDouble();
                input.nextLine();

                Student student = new Student(name, id, course, fee);

                students.add(student); // COLLECTION USED
            }

            saveToFile();
            loadFromFile();

        } catch (Exception e) {
            System.out.println("Invalid input detected.");
        } finally {
            input.close();
        }
    }

    // SAVE TO FILE
    public static void saveToFile() {

        try {
            FileWriter writer = new FileWriter("students.txt");

            for (Student s : students) {
                writer.write(s.getName() + "," + s.getId() + "," +
                        s.calculatePayment() + "\n");
            }

            writer.close();
            System.out.println("\nData saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    // READ FROM FILE
    public static void loadFromFile() {

        try {
            File file = new File("students.txt");
            Scanner reader = new Scanner(file);

            System.out.println("\nData Loaded From File ");

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
