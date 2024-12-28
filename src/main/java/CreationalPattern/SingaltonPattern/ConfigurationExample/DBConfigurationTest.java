package CreationalPattern.SingaltonPattern.ConfigurationExample;

public class DBConfigurationTest {
    public static void main(String[] args) {
        DBConfiguration db = DBConfiguration.getInstance();
        System.out.println(db.getDbUrl());
    }

}
