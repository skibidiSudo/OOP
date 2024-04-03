package hus.oop.lab5.themydateclass;

public class MyDate {
    private int year;
    private int month;
    private int day;
    static final private String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static final private String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    static final private int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    private int getMaxDayInMonth(int year, int month) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS_IN_MONTHS[month - 1];
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12 || day < 1 || day > getMaxDayInMonth(year, month))
            return false;
        return true;
    }

    public String getDayOfWeek(int year, int month, int day) {
        int a = (14 - month) / 12, y = year - a, m = month + 12 * a - 2;
        int dayOfWeek = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return DAYS[dayOfWeek];
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        return getDayOfWeek(year, month, day) + " " + day + " " +
                MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        int maxDaysInMonth = getMaxDayInMonth(this.year, this.month);
        if (this.day < maxDaysInMonth) {
            this.day++;
        } else {
            this.day = 1;
            if (this.month < 12) {
                this.month++;
            } else {
                this.month = 1;
                this.year++;
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month <  12){
            int newMonth = month + 1;
            day = (day <= getMaxDayInMonth(year, newMonth)) ? day : getMaxDayInMonth(year, newMonth);
            ++month;
        } else {
            month = 1;
            year++;
        }
        return this;
    }

    public MyDate nextYear() {
        if (year >= 9999) {
            throw new IllegalStateException("Year out of range!");
        }

        if (month == 2 && day == 29) {
            year++;
            day = 28;
        } else {
            year++;
        }
        return this;
    }
    public MyDate previousDay() {
        if (this.day > 1) {
            this.day--;
        } else {
            if (this.month > 1) {
                this.month--;
                this.day = getMaxDayInMonth(this.year, this.month);
            } else {
                this.month = 12;
                this.year--;
                this.day = getMaxDayInMonth(this.year, this.month);
            }
        }
        return this;
    }
    public MyDate previousMonth() {
        if (month > 1) {
            int newMonth = month - 1;
            day = (day <= getMaxDayInMonth(year, newMonth)) ? day : getMaxDayInMonth(year, newMonth);
            month--;
        } else {
            month = 12;
            year--;
        }
        return this;
    }
    public MyDate previousYear() {
        if (year <= 1) {
            throw new IllegalStateException("Year out of range!");
        }

        if (month == 2 && day == 29) {
            year--;
            day = 28;
        } else {
            year--;
        }
        return this;
    }
}
