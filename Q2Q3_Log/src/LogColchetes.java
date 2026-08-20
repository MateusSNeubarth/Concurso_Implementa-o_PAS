public class LogColchetes extends LogDecorator {
    public LogColchetes(Log log){ super(log); }
    public void log(String m){
        log.log("[" + m + "]");
    }
}
