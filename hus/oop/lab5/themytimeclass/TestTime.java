package hus.oop.lab5.themytimeclass;

public class TestTime {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 58);
        System.out.println("Starting time: " + time);
        time.nextSecond();
        System.out.println("Next second: " + time);
        time.nextMinute();
        System.out.println("Next minute: " + time);
        time.nextHour();
        System.out.println("Next hour: " + time);
        time.previousSecond();
        System.out.println("Previous second: " + time);
        time.previousMinute();
        System.out.println("Previous minute: " + time);
        time.previousHour();
        System.out.println("Previous hour: " + time);
        MyTime time2 = new MyTime();
        time2.setTime(10, 30, 15);
        System.out.println("Starting time for time2: " + time2);
    }
}
