//importando um gerador de valores aleatorios para testar o codigo
import java.util.concurrent.ThreadLocalRandom;
public class While {
    
    public static void main(String[] args) {
        double mesada = 50.0;

        //while antes verifica se a expressao é verdadeira para depois executar o codigo
        while (mesada >0) {
            double valorDoce = valorAleatorio();
            
            //usando um if so para que o valor nao fique negativo
            if (valorDoce > mesada)
                valorDoce=mesada;
            System.out.println("doce do valor: "+ valorDoce+ "adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("saldo da mesada: "+mesada);
    }
        private static double valorAleatorio(){
            return ThreadLocalRandom.current().nextDouble(2,8);
        }
    
}
