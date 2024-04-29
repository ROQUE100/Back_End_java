public class Usuario {
    public static void main(String[] args) {
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

       //mudando canal informando o numero no controle
       smartTv.mudarCanal(10);

       System.out.println("canal atual: "+smartTv.canal);


       //desligando a TV
       smartTv.desligar();
       if (smartTv.ligado ==true) {
        System.out.println("novo estatus -> TV ligada! no canal "+ smartTv.canal+" e o volume é: "+smartTv.volume);
        
       } else {
        System.out.println ("TV esta desligada");
        
       }




       
        
        


    }
    
}
