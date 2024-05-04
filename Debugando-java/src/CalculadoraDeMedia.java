import java.util.Scanner;

public class CalculadoraDeMedia {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String [] alunos = {"claudio", "lucas", "joao","pedro"};

        double media = calcularMediaDaTurma(alunos, scanner);


        System.out.printf("media da turma! %.3f", media);

    }

    public static double calcularMediaDaTurma(String[] alunos, Scanner scanner){

        double soma = 0;
        for (String aluno : alunos){
            System.out.printf("nota do aluno %s:", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma /alunos.length;
    }
}
