public class SmartTv {
    boolean ligado=false;
    int canal=1;
    int volume=25;

    public void ligar (){
        ligado=true;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("volume "+volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("volume "+volume);
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }



    public void desligar (){
        ligado=false;
    }









    }
