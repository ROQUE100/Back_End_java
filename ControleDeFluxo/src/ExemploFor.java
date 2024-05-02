public class ExemploFor {
    public static void main(String[] args) throws Exception {
        //estrutura simples para uso de for
        for (int carneirinhos = 1; carneirinhos <=20; carneirinhos ++){
            System.out.println("contando carneirinhos: " + carneirinhos);
        }

        System.out.println("joazinho dormiu");

        //usando for em um arrey
        String alunos [] ={"claudio","paulo","marcia","pedro"};

        for (int x=0; x < alunos.length; x++){
            
            System.out.println("o aluno no indice "+ x +" = "+ alunos[x]);
        }

        //usando foreach
        for (String x : alunos) {
            System.out.println("o nome do aluno no indice "+ x);
            
        }


        
}}
