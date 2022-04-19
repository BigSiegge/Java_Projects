public class FacultyMember extends Employee {
    private boolean hasTenure;

    public FacultyMember(Name name, Date dob, Date dateHired, boolean hasTenure) {
        super(name, dob, dateHired);
        this.hasTenure = hasTenure;
    }

    public String getRole() {
        return "Faculty member";
    }

    @Override
    public String toString() {
        return super.toString() + " Has Tenure: " + hasTenure;
    }
}