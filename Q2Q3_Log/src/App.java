public class App {
    public static void main(String[] args) throws Exception {
        Log log = LogSimples.getInstance();
        log.log("Mensagem de alerta 1");
        log.log("Mensagem de alarme 23");
        log.log("Mensagem de PANICO!!");

        log = new LogColchetes(new LogNivel(LogSimples.getInstance(), "NIVEL 1"));
        log.log("Mensagem de alerta 1");

        for(String m: LogSimples.getInstance()){
            System.out.println(m);
        }
    }
}
