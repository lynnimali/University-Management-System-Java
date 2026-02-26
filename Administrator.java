public class Administrator extends Staff {

    private String office;

    public Administrator(String name, int id, double salary, String office) {
        super(name, id, salary);
        this.office = office;
    }

    @Override
    public void displayRole() {
        System.out.println("I am an Administrator.");
    }

    @Override
    public void performDuties() {
        System.out.println("Managing university operations in office " + office);
    }
}
