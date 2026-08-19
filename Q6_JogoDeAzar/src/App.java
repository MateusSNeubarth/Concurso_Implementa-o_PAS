public class App {
    public static void main(String[] args) {
        IDado d6 = new DadoComHistorico(new Dado(6));

        d6.rolar();
        d6.rolar();
        d6.rolar();
        d6.rolar();

        System.out.println("Valor atual: " + d6.getValor());

        DadoComHistorico d6Historico = (DadoComHistorico) d6;

        System.out.println("Histórico: " + d6Historico.getHistorico());
    }
}
