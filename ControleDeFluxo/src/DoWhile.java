import java.util.Random;
public class DoWhile {
    
    public static void main(String[] args) {

        //enquando while verifica o codigo para depois executar, 
        //do while executa pelo menos uma vez ate a condicao ser negativa
        System.out.println("discando... ");
        do {
            //executando repetidas vezes ate atender
            System.out.println("telefone tocando");
            
        }while (tocando());
        System.out.println("alor !!!");
          

        
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("atendeu? "+ atendeu);
        //negando para que nao continue em loop tocando
        return ! atendeu;
    }
}
