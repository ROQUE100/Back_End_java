public class Operador {
    public static void main(String[] args)  {

        int a, b;
        a = 5;
        b = 6;

        String resultado1 = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado1);

        String resultado = "";

        //usando ifelse 
        if (a==b) {
            resultado = "verdadeiro";
            
        } else {
            resultado = "falso";
            
        }

        System.out.println(resultado);

        //para comprar string ou objetos usamos equals em vez do operador ternario ==
        String nomeUm = "claudio";
        String nomeDois = "claudio";

        System.out.println(nomeUm.equals(nomeDois));

        //operadores logicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        //&& se as duas condicoes forem verdadeiras
        if (condicao1 && condicao2) {
            System.out.println("as duas condicoes sao verdadeiras");            
        } else {
            System.out.println("pelo menos uma condicao não é verdadeira");
        }
        
        // || se pelo menos uma condicao for verdadeira...
        if (condicao1 || condicao2) {
            System.out.println("pelo menos uma condicao é verdadeira");
        } else {
            System.out.println("nem uma condicao é verdadeira");
        }
    }}

