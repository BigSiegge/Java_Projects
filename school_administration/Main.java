public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        Name name = new Name("Siegfried", "N");
        Date dob = new Date(4, 16, 2003);
        people[0] = new Student(name, dob, 65);

        name = new Name("Michelle", "Anderson");
        dob = new Date(7, 23, 1960);
        Date dateHired = new Date(1, 1, 2016);
        people[1] = new Administrator(
                name, dob, dateHired, "President");

        name = new Name("Moshe", "Lach");
        dob = new Date(1, 1, 1951);
        dateHired = new Date(8, 15, 1973);
        people[2] = new FacultyMember(
                name, dob, dateHired, true);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}