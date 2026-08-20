public class LogMaiuscula extends LogDecorator {
    public LogMaiuscula(Log log){ super(log); }
    public void log(String m){
        log.log(m.toUpperCase());
    }
}
