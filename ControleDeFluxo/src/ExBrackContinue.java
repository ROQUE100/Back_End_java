public class ExBrackContinue {
    public static void main(String[] args) {
        //usando um break para parar a execursao quando chegar em 3
        for(int numero =1; numero<=5; numero++){
            if (numero ==3) 
                break;
                System.out.println("numero = "+numero);                
            
        }
        for(int numero1 =1; numero1<=5; numero1++){
            if (numero1 ==3) 
                continue;
                System.out.println("numero = "+numero1);                
            
        }
}}
