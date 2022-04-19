public class Administrator extends Employee {
    private String title;

    public Administrator(Name name, Date dob, Date dateHired, String title) {
        super(name, dob, dateHired);
        this.title = title;
    }

    public String getRole() {
        return "Administrator";
    }

    @Override
    public String toString() {
        return super.toString() + " Title: " + title;
    }
}
