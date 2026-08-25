public class LogNivel extends LogDecorator{
    private String nivel;
    public LogNivel(Log log, String nivel){ super(log); this.nivel = nivel; }
    public void log(String m){
        log.log(nivel + " " + m);
    }
}
