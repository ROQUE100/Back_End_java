import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SobreMin {
    public static void main(String[] args) throws Exception {
        //crindo uma variaval para capturar possiveis exessoes
        try {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("digite seu sobrenome");
        String sobreNome = scanner.nextLine();

        System.out.println("digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("digite sua altura");
        double altura = scanner.nextDouble();

        //imprimindo os dados coletados
        System.out.println("olá me chamo "+ nome.toUpperCase() +" "+ sobreNome.toUpperCase());
        System.out.println("tenho "+ idade + " anos");
        System.out.println("minha altura é:"+altura+ " Metros");

        scanner.close();
        }
            //tratando as possiveis exessoes que o TRY venha capturar
            //para isso precisamos prever as possiveis exessoes que nosso codigo venha ter
            catch (InputMismatchException e){
                System.out.println("os campos idade e altura precisam ser numerico!");


            }
    }
}
