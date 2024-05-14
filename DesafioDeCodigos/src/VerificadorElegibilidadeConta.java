import java.util.Scanner;

// Aqui é definido uma classe chamada VerificadorElegibilidadeConta:
public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        // Verifique se a idade é maior ou igual a 18 e imprima uma mensagem informando que o usuário é elegível para criar uma conta bancária:
        if (idade >= 18) {
            System.out.println("Elegível");
        } else {
            System.out.println("Não elegível");
        }

        // Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}
