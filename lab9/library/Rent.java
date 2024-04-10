package hus.oop.lab9.library;

import java.util.Date;
public class Rent {
    protected Item item;
    protected Date end;
    protected Student student;
    protected Date begin;

    public Rent(Item item, Date end, Student student, Date begin) {
        this.item = item;
        this.end = end;
        this.student = student;
        this.begin = begin;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Rent[" +
                "item=" + item +
                ", end=" + end +
                ", student=" + student +
                ", begin=" + begin +
                ']';
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }
}
