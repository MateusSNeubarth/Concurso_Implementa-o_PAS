import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogSimples implements Iterable<String>, Log{
    private List<String> mensagens;
    static LogSimples instance;

    private LogSimples(){
        mensagens = new LinkedList<>();
    }

    public void log(String m){
        String logM = LocalDate.now().toString() + " : " + m;
        mensagens.add(logM);
    }

    static public LogSimples getInstance(){
        if (instance == null)
            instance = new LogSimples();
        return instance;
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }
}
