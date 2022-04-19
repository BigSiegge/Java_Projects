public class Name {
    private String first, middle, last;

    public Name() {
        this("", "", "");
    }

    public Name(String first, String last) {
        this(first, "", last);
    }

    public Name(String first, String middle, String last) {
        setFirst(first);
        setMiddle(middle);
        setLast(last);
    }

    public Name(Name old) {
        this(old.first, old.middle, old.last);
    }

    public void setFirst(String first) {
        this.first = (first == null)? "" : first;
    }

    public void setMiddle(String middle) {
        this.middle = (middle == null)? "" : middle;
    }

    public void setLast(String last) {
        this.last = (last == null)? "" : last;
    }

    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public String toString() {
        return first + " " + middle + (middle.isEmpty()? "" : " ") + last;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Name) {
            Name var = (Name)other;
            return this.first.equals(var.first) && this.middle.equals(var.middle) && this.last.equals(var.last);
        } else {
            return false;
        }
    }
}
