import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        SmartTv smartTv = new SmartTv();

       if (smartTv.ligado ==true) {
        System.out.println("TV ligada! no canal "+ smartTv.canal+" e o volume é: "+smartTv.volume);
        
       } else {
        System.out.println ("TV esta desligada");
        
       }
       //ligando a TV
       smartTv.ligar();
       if (smartTv.ligado ==true) {
        System.out.println("novo estatus -> TV ligada! no canal "+ smartTv.canal+" e o volume é: "+smartTv.volume);
        
       } else {
        System.out.println ("TV esta desligada");
        
       }
       //aumentando e diminuindo volume 
       smartTv.aumentarVolume();
       smartTv.aumentarVolume();
       smartTv.aumentarVolume();
       smartTv.aumentarVolume();
       smartTv.diminuirVolume();

       //aumentando os canais de um em um
       smartTv.aumentarCanal();
       System.out.println("canal atual: "+smartTv.canal);


       //mudando canal informando o numero no controle
       //usando scaner para que o usuario informe para qual canal quer ir
       System.out.println("Digite um Canal: ");
       smartTv.mudarCanal(scanner.nextInt());

       System.out.println("canal atual: "+smartTv.canal);


       //desligando a TV
       smartTv.desligar();
       if (smartTv.ligado ==true) {
        System.out.println("novo estatus -> TV ligada! no canal "+ smartTv.canal+" e o volume é: "+smartTv.volume);
        
       } else {
        System.out.println ("TV esta desligada");
        
       }
       
        
        
       //fechando o scanner
       scanner.close();
    }
    
}
