public abstract class Employee extends Person {
    private Date dateHired;

    public Employee(Name name, Date dob, Date dateHired) {
        super(name, dob);
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + " date hired: " + dateHired;
    }
}
