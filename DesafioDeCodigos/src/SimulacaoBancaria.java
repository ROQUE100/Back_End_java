import java.util.Scanner;

public class SimulacaoBancaria {
   
    public static void main(String[] args) {
        double saldo = 0;
        Scanner scanner = new Scanner(System.in);

        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
            

            //System.out.println("ESCOLHA UMA OPCAO: \n1 Depositar\n2 Sacar\n3 onsultar Saldo\n4 Encerrar");
            int opcao = scanner.nextInt(); 

            switch (opcao) {
                
                case 1:
                    // se o usuario escolher 1 o programa vai perguntar que valor que depositar e somará esse valor ao saldo
                    System.out.println("Qual valor a ser Depositado? ");
                    double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado;                    
                    System.out.println("saldo atual é: "+ saldo);                  
                    break;
                case 2:
                    //se o usuario escolher 2, o programa vai perguntar o valor e verificar se o saldo é suficiente
                    System.out.println("Qual valor a ser Sacado? ");
                    double valorSaque = scanner.nextDouble();
                    if (saldo >= valorSaque) {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado!");                        
                    } else {
                        System.out.println("Saldo insuficiente, programa encerrado!");
                        return; // Encerra o programa
                    }                    
                    break;
                case 3:
                    //se o usuario escolher 3, o programa exibirá o saldo atual
                    System.out.println("O saldo Atual é: "+saldo);
                    break;
                case 4:
                    // se o usuario digitar 4, o programa será encerrado
                    System.out.println("Encerrando o Programa! ");
                    scanner.close();
                    return; 
                default:
                    //se o usuario digitar algo que nao seja uma das opções, o sistema exibirá a seguinte mensagem
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
        } 
}

}
