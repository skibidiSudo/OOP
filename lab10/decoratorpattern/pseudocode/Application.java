package hus.oop.lab10.decoratorpattern.pseudocode;

public class Application {
    public static void main(String[] args) {
        DataSource source = new FileDataSource("somefile.dat");
        source.writeData("salaryRecords");

        source = new CompressionDecorator(source);
        source.writeData("salaryRecords");

        source = new EncryptionDecorator(source);
        source.writeData("salaryRecords");

        DataSource externalSource = new FileDataSource("salary.dat");
        SalaryManager logger = new SalaryManager(externalSource);
        String salaryData = logger.load();
        System.out.println("Loaded salary data: " + salaryData);
        logger.save();
    }
}
