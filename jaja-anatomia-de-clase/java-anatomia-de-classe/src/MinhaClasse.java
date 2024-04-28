public class MinhaClasse {
    public static void main(String[] args) {
        String meuNome = "claudio";
        int anoNascimento = 1988;
        int diaNascimento = 9;
        int mesNascimento = 02;

        System.out.println("meu nome é: "+meuNome + ", e eu nasci em: "+ diaNascimento +"/" + mesNascimento +"/"+ anoNascimento);
        
        String primeroNome ="Claudio";
        String segundoNome = "Roque";
        String nomeCompleto = nomeCompleto(primeroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
