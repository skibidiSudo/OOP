package hus.oop.lab5.themytimeclass;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond(){
        second = (second + 1) % 60;
        if (second == 0) {
            nextMinute();
        }
        return this;
    }
    public MyTime nextMinute(){
        minute = (minute+1)%60;
        if(minute == 0){
            nextHour();
        }
        return this;
    }
    public MyTime nextHour() {
        hour = (hour + 1) % 24;
        return this;
    }

    public MyTime previousSecond() {
        second = (second - 1 + 60) % 60;
        if (second == 59) {
            previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        minute = (minute - 1 + 60) % 60;
        if (minute == 59) {
            previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        hour = (hour - 1 + 24) % 24;
        return this;
    }

}
