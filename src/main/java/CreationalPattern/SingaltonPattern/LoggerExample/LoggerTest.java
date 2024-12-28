package CreationalPattern.SingaltonPattern.LoggerExample;

public class LoggerTest {
    public static void main(String[] args) {

        Logger log = Logger.getInstance();

        log.error("Error while processing...");

        log.info("Info while processing...");

        log.warnig("Warning while processing...");

    }
}
