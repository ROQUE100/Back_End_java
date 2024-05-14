import java.net.ContentHandler;

public class TestandoOCodigoSimulacao {
    
    public static void main(String[] args) {
        try {
            String verificarConta = verificarNumeroConta("12345678");
            System.out.println(verificarConta);
        } catch (CepInvalidoException e) {
            //exibindo mensagem para ajudar a solucionar a exessao
            System.out.println("o conta precisa ter 8 digitos numericos");
        }
        
    }

    //criando um metodo para formatar CEP
    static String verificarNumeroConta(String conta) throws ContaInvalidoException{
        // Verifica se o CEP possui exatamente 8 dígitos numéricos
        if (conta.length() != 8 || !conta.matches("[0-9]+")) // Verifica se o CEP contém apenas dígitos numericos
            throw new CepInvalidoException();

            //simulando um formato de conta
            return conta.substring(0, 2) + "." + conta.substring(2, 5) + "-" + conta.substring(5);
            
        
    }
}
