public class Date {
    private int month;
    private int dayOfMonth;
    private int year;

    public Date(int month, int dayOfMonth, int year) {
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.year = year;
    }

    public String toString() {
        return month + "/" + dayOfMonth + "/" + year;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Date) {
            Date var = (Date) other;
            return this.month == var.month && this.dayOfMonth == var.dayOfMonth && this.year == var.year;
        } else {
            return false;
        }
    }
}
