package list.OperacoesBasicas; // Declara o pacote onde esta classe reside

import java.util.ArrayList; // Importa a classe ArrayList da biblioteca padrão de Java
import java.util.List; // Importa a interface List da biblioteca padrão de Java

public class ListaTarefa {
    // Declara um atributo privado do tipo List que conterá objetos do tipo Tarefa
    private List<Tarefa> tarefaList;

    // Construtor da classe ListaTarefa que inicializa tarefaList como uma nova instância de ArrayList
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Método público que adiciona uma nova Tarefa à lista, dado um texto de descrição
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao)); // Cria uma nova Tarefa com a descrição fornecida e a adiciona à lista
    }

    // Método público que remove tarefas da lista com uma descrição correspondente à fornecida
    public void removerTarefa(String descricao) {
        // Cria uma nova lista para armazenar as tarefas que precisam ser removidas
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        // Percorre cada tarefa na lista tarefaList
        for (Tarefa t : tarefaList) {
            // Se a descrição da tarefa for igual à descrição fornecida (ignorando maiúsculas e minúsculas)
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                // Adiciona a tarefa à lista de tarefas para remover
                tarefasParaRemover.add(t);
            }
        }

        // Remove todas as tarefas da lista tarefasParaRemover de tarefaList
        tarefaList.removeAll(tarefasParaRemover);
    }

    // Método público que retorna o número total de tarefas na lista
    public int obterNumeroTotalTarefas() {
        return tarefaList.size(); // Retorna o tamanho da lista tarefaList
    }

    // Método público que imprime as descrições de todas as tarefas na lista
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList); // Imprime a lista tarefaList (chamando implicitamente o método toString de cada tarefa)
    }

    public static void main(String[] args) {
        ListaTarefa tarefa = new ListaTarefa();
        tarefa.adicionarTarefa("tarefa1");
        tarefa.adicionarTarefa("tarefa2");
        System.out.println(tarefa.obterNumeroTotalTarefas());
        tarefa.removerTarefa("tarefa1");
        System.out.println(tarefa.obterNumeroTotalTarefas());
        tarefa.obterDescricoesTarefas();
    }
}
