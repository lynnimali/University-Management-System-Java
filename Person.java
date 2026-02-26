public abstract class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;     // use of this
        this.id = id;
    }

    // Encapsulation (getters)
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Abstract method
    public abstract void displayRole();
}