package CreationalPattern.SingaltonPattern.LoggerExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    //private instance
    private static Logger instance;

    //private default constructor
    private Logger(){

    }

    public static synchronized Logger getInstance(){
        if(instance == null){
            // if null only it will create the object
            instance = new Logger();
        }
        return instance;
    }

    public void error(String message){
        this.log("ERROR",message);
    }

    public void info(String message){
        this.log("INFO",message);
    }
    public void warnig(String message){
        this.log("WARNING",message);
    }

    void log(String level, String message){
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(String.format("%s [%s]: %s", timestamp, level, message));
    }
}
