public abstract class Person {
    private Name name;
    private Date dob;

    public Person(Name name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String toString() {
        return "Role: " + getRole() + " Name: " + name + " DoB: " + dob;
    }

    public abstract String getRole();
}