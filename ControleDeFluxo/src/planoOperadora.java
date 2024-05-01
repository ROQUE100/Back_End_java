public class planoOperadora {
    public static void main(String[] args) {

        //comparando a usuabildiade do if else x switch case
        String plano = "t";
        if (plano.equalsIgnoreCase("b")) {
            System.out.println("plano basico: 100 minutos de ligação");            
        }
        else if (plano.equalsIgnoreCase("m")) {
            System.out.println("plano medio: 100 minututos de ligação\nmais whatsapp e instagran gratis");
        }
        else if (plano.equalsIgnoreCase("t")) {
            System.out.println("plano medio: 100 minututos de ligação\nmais whatsapp e instagran gratis\nmais 5gb de youtube");
        }
        else
            System.out.println("nao contemplado");

        //usando o Switch Case sem o "break" para que acrescente mais funcionalidades conforme o plano for aumentando
        String plano1 = "t";

        switch (plano1.toLowerCase()) {
            case "t":{
                System.out.println("mais 5gb de Youtube");}  
            case "m" :{
                System.out.println("mais whatsapp e instagran gratis");}
            case "b":{
                System.out.println("plano basico: 100 minutos de ligação"); 
                break;}        
                    
            default:
                System.out.println("nao contemplado");
                break;
        }


    }
    
}
