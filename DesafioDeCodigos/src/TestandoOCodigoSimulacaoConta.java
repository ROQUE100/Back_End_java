import java.util.Scanner;

public class TestandoOCodigoSimulacaoConta {  
    public static void main(String[] args) {
        //codigo aceito no desafio
        double saldo = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) { 
               

                int opcao = scanner.nextInt(); 

                switch (opcao) {
                    case 1:
                       
                        double valorDepositado = scanner.nextDouble();
                        saldo += valorDepositado;                    
                        System.out.println("Saldo atual: "+saldo);                  
                        break;
                    case 2:
                        
                        double valorSaque = scanner.nextDouble();
                        if (saldo >= valorSaque) {
                            saldo -= valorSaque;
                            System.out.println("Saldo atual: "+saldo);                        
                        } 
                        else {
                            System.out.println("Saldo insuficiente.");
                            System.out.println("Programa encerrado.");
                            return;
                        }                    
                        break;
                    case 3:
                        System.out.println("Saldo atual: "+saldo);
                        
                        break;
                        
                    case 0:
                      System.out.println("Programa encerrado.");
                        return; 
                        
                    default:
                        System.out.println("Programa encerrado.");
                        break;
                }
            }
        }  
        
    }
    
}
