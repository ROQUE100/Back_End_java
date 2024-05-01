public class SwitchCase {
    public static void main(String[] args) throws Exception {

        //estrutura encandeadas
        String sigla = "M";

        if (sigla.equalsIgnoreCase("p")) {
            System.out.println("pequeno");
        }
        else if (sigla.equalsIgnoreCase("m")) {
            System.out.println("médio");
        }
        else if (sigla.equalsIgnoreCase("g")) {
            System.out.println("grande");
        }
        else
        System.out.println("tamanho indefinido!");
    

    //usando Switch Case
        String sigla1 = "j";
        
       //usando "toLowerCase" para ignorar maiusculos
        switch (sigla1.toLowerCase()) {
            case "p":{
                System.out.println("pequeno");
                break;}
            case "m":{
                System.out.println("médio");
                break;}
            case "g":{
                System.out.println("grande");
                break;}     
            
        
            default:
                System.out.println("tamanho indefinido");
                
        }
        
}}
