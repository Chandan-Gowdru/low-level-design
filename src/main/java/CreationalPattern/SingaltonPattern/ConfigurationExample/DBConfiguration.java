package CreationalPattern.SingaltonPattern.ConfigurationExample;

public class DBConfiguration {

    private static DBConfiguration instance;
    private String dbUrl;

    private DBConfiguration(){
        dbUrl = "jdbc:mysql://localhost:8080/testdatabase";
    }

    public static DBConfiguration getInstance(){
        if(instance == null){
            instance = new DBConfiguration();
        }
        return instance;
    }

    public String getDbUrl(){
        return dbUrl;
    }
}
