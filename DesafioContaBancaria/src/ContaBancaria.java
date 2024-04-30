import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco do Brasil, Por favor confirme seus dados: ");
        System.out.println("seu nome: ");
        String cliente = scanner.nextLine();       

        System.out.println("sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("digite sua conta: 'sem digito' ");
        int conta = scanner.nextInt();
        

        final double saldo = 700.37;

        System.out.println("Obrigado " + cliente + " agencia: "+agencia + " conta: "+conta+" por confirmar seus dados, seu saldo é: "+ saldo +". deseja sacar alguma valor? ");

        System.out.println("para sacar precione 'Y', para mostrar saldo precione 'N' ");
        String sacar = "y";
        String naoSacar = "n";        
        String sacarValor = scanner.next();

        if (naoSacar.equalsIgnoreCase(sacarValor)) {
            System.out.println("seu saldo é: "+ saldo);            
        }

        if (sacar.equalsIgnoreCase(sacarValor)) {
            System.out.println("Qual valor? ");
            double valorSaque = scanner.nextDouble();
            if (valorSaque <= saldo) {
                System.out.println(cliente+", saque realizado, seu novo saldo é: "+ (saldo - valorSaque)+ ". foi um prazer atender-lo(a)");                
            } else {
                System.out.println("saldo insuficiente! Sessao Encerrada.");
            }
            
        } else {
            System.out.println("obrigado "+ cliente + ", foi um prazer atender-lo(a)");
            
        }

        


        



        scanner.close();
    }
}
