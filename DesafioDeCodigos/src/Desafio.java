import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("qual o valor do salario base? ");
        float salarioBase = entrada.nextFloat();

        System.out.println("qual o valor dos demais beneficios? ");
        float valorBeneficios = entrada.nextFloat();

        float valorImposto =0;
        if (salarioBase >0 && salarioBase < 1100.01) {
            valorImposto = 0.05f * salarioBase;            
        }
        else if (salarioBase > 1100.00 && salarioBase < 2500.01) {
            valorImposto = 0.1f * salarioBase;            
        }       
        else {
            valorImposto = 0.15f * salarioBase;
        }

        float salarioLiquido = salarioBase - valorImposto + valorBeneficios;
        System.out.println("salario bruto: "+salarioBase);
        System.out.println("descontos: "+ valorImposto);
        System.out.println("beneficios:"+valorBeneficios);
        System.out.println("salario liquido: "+String.format("%.2f", salarioLiquido));





        entrada.close();
    }
}
