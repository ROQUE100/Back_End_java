package gof.strategy;

public class ComportamentoAgrecivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("movendo agressivamente...");
    }
}
