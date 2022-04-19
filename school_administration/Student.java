public class Student extends Person {
    private int numCreditsTaken;

    public Student(Name name, Date dob, int numCreditsTaken) {
        super(name, dob);
        this.numCreditsTaken = numCreditsTaken;
    }

    @Override
    public String toString() {
        return super.toString() + " credits taken: " + numCreditsTaken;
    }

    public String getRole() {
        return "Student";
    }
}