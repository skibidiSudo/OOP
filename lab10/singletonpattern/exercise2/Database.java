package hus.oop.lab10.singletonpattern.exercise2;

public class Database {
    private static Database instance;

    private Database(){

    }

    public static Database getInstance(){
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql){
        System.out.println("Executing SQL query: " + sql);
    }
}
