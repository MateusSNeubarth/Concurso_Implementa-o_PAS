public abstract class LogDecorator implements Log {
    protected Log log;
    public LogDecorator(Log log){
        this.log = log;
    }
}
