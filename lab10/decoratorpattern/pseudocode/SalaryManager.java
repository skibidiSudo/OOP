package hus.oop.lab10.decoratorpattern.pseudocode;

public class SalaryManager {
    private DataSource source;

    public SalaryManager(DataSource source) {
        this.source = source;
    }

    public String load() {
        return source.readData();
    }

    public void save() {
        source.writeData("salaryRecords");
    }
}
