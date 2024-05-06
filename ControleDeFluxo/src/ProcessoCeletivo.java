// Importa as classes ArrayList e List do pacote java.util
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// Declaração da classe ProcessoCeletivo
public class ProcessoCeletivo {
    // Método principal
    public static void main(String[] args) {
        // Analisa os candidatos com seus respectivos salários pretendidos
        analizarCandidato("claudio", 1900.0);
        analizarCandidato("paulo", 2000.0);
        analizarCandidato("maria",2200.0);       

        // Chama o método de seleção de candidatos
        selecaoCandidatos();
    }    

    // Método para selecionar os candidatos
    static void selecaoCandidatos (){
        // Array com os nomes dos candidatos
        String [] candidatos = {"claudio", "maria", "julia", "pedro", "elias", "ana", "alex","joao", "joana"};

        // Variáveis para controle do processo de seleção
        int candidatosSelecionados = 0;
        int candidatoAtual =0;
        double salarioBase = 2000.0;

        // Lista para armazenar os nomes dos candidatos aprovados
        List<String> candidatosAprovados = new ArrayList<>();

        // Loop para selecionar os candidatos
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            // Obtém o nome e o salário pretendido do candidato atual
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            // Exibe informações sobre o candidato e seu salário pretendido
            System.out.println("O candidato "+ candidato + " solicitou este valor de salario "+ salarioPretendido);
            // Verifica se o candidato foi selecionado com base no salário base
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato "+candidato+" foi selecionado para vaga");
                // Adiciona o candidato à lista de aprovados
                candidatosAprovados.add(candidato);
                candidatosSelecionados++;
            } else {
                System.out.println(candidato + " nao foi selecionado");
            }
            candidatoAtual ++;            
        }        
        
        // Imprime todos os candidatos inscritos
        System.out.println("Este são todos os candidatos inscritos:");      
        for(int indice=0; indice< candidatos.length; indice++){
            System.out.println("o candidato de Nº " + (indice+1)+ " é o "+ candidatos[indice] );
        }

        // Imprime a lista dos candidatos aprovados
        System.out.println("Entre todos os escritos esses foram os aprovados: ");
        for (int aprovados=0; aprovados<candidatosAprovados.size(); aprovados++){
            System.out.println("Incrição: "+ (aprovados+1)+" Nome: " + candidatosAprovados.get(aprovados));
        }
    }       

    // Método para gerar valores aleatórios entre 1800 e 2200
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
    // Método para analisar um candidato com base em seu nome e salário pretendido
    static void analizarCandidato(String nome, double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("ligar para o candidato "+nome+" para marcar entrevista");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("ligar para o candidato "+nome+" com contra proposta");            
        } else{
            System.out.println(nome + ", aguardando resultado das demais candidaturas");
        }
    }
}
