import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoCeletivo {
    public static void main(String[] args) {
        List<String> candidatosAprovados = selecaoCandidatos();
        entrarEmContatoComCandidatos(candidatosAprovados);
    }    

    static List<String> selecaoCandidatos() {
        String [] candidatos = {"claudio", "maria", "julia", "pedro", "elias", "ana", "alex","joao", "joana"};
        int candidatosSelecionados = 0;
        double salarioBase = 2000.0;
        List<String> candidatosAprovados = new ArrayList<>();

        for (String candidato : candidatos) {
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato "+ candidato + " solicitou este valor de salário "+ salarioPretendido);
            
            if (salarioBase >= salarioPretendido && candidatosSelecionados < 5) {
                System.out.println("O candidato "+candidato+" foi selecionado para vaga");
                candidatosAprovados.add(candidato);
                candidatosSelecionados++;
            } else {
                System.out.println(candidato + " nao foi selecionado");
            }
        }

        System.out.println("Estes são todos os candidatos inscritos:");      
        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de Nº " + (indice+1)+ " é o "+ candidatos[indice] );
        }

        System.out.println("Dentre todos os inscritos, estes foram os aprovados: ");
        for (int aprovados = 0; aprovados < candidatosAprovados.size(); aprovados++){
            System.out.println("Incrição: "+ (aprovados+1)+" Nome: " + candidatosAprovados.get(aprovados));
        }

        return candidatosAprovados;
    }       

    static void entrarEmContatoComCandidatos(List<String> candidatosAprovados) {
        for (String candidato : candidatosAprovados) {
            entrarEmContato(candidato);
        }
    }

    static void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Entrando em contato com o candidato: " + candidato);
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com "+ candidato + " na "+ tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com "+ candidato + " após "+ tentativasRealizadas + " tentativas");
        }
    }

    static boolean atender (){
        return new Random().nextInt(3)==1;
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    } 
}
