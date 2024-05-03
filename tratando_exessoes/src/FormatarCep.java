public class FormatarCep {
    
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("12345678");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            //exibindo mensagem para ajudar a solucionar a exessao
            System.out.println("o cep precisa ter 8 digitos numericos");
        }
        
    }

    //criando um metodo para formatar CEP
    static String formatarCep(String cep) throws CepInvalidoException{
        // Verifica se o CEP possui exatamente 8 dígitos numéricos
        if (cep.length() != 8 || !cep.matches("[0-9]+")) // Verifica se o CEP contém apenas dígitos numericos
            throw new CepInvalidoException();

            //simulando um formato de cep
            return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
            
        
    }
}
