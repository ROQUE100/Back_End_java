import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Informe o limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();
        double totalSacado = 0.0;

        for (;;) {  // Loop infinito, será interrompido por condições internas
            System.out.print("Informe o valor do saque: ");
            double valorSaque = scanner.nextDouble();
            
            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break;
            }
            
            if (totalSacado + valorSaque > limiteDiario) {
                System.out.println("Limite diário atingido. Saque não permitido.");
                break;
            } else {
                totalSacado += valorSaque;
                System.out.println("Saque realizado com sucesso. Limite restante: " + (limiteDiario - totalSacado));
            }
        }

        scanner.close();
    }
}
