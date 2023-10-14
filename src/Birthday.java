public class Birthday {
    private final int day;
    private final int month;
    private final int year;

    public Birthday(String dateOfBirth) {
        String[] bd = dateOfBirth.split("/");
        day = Integer.parseInt(bd[0]);
        month = Integer.parseInt(bd[1]);
        year = Integer.parseInt(bd[2]);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
