import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm = 0;
        int parametroDois = 0;
        
        // Loop para garantir que o usuário insira números inteiros válidos
        while (true) {
            try {
                System.out.println("Digite o primeiro parâmetro");
                parametroUm = terminal.nextInt();
                System.out.println("Digite o segundo parâmetro");
                parametroDois = terminal.nextInt();
                
                
                break;
            } catch (InputMismatchException e) {
                // Caso o usuário não insira um número inteiro, exibir mensagem de erro
                System.out.println("Por favor, insira apenas números inteiros.");
                terminal.nextLine(); // refazendo o loop
            }
        }
        
        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException e) {
            // Imprimindo a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e.getMessage());
        }
        terminal.close();
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
