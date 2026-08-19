public class Validador{

    private final ValidadorStrategy strategy;

    public Validador(ValidadorStrategy strategy){
        this.strategy = strategy;
    }

    public boolean valida(String valor){
        return strategy.valida(valor);
    }
}