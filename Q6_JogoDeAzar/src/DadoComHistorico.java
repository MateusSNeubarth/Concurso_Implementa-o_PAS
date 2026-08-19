import java.util.ArrayList;
import java.util.List;

public class DadoComHistorico extends DadoDecorator {

    private final List<Integer> historico;

    public DadoComHistorico(IDado dado) {
        super(dado);
        this.historico = new ArrayList<>();
    }

    @Override
    public void rolar() {
        dado.rolar();
        historico.add(dado.getValor());
    }

    public List<Integer> getHistorico() {
        return historico;
    }
}