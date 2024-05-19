package list.OperacoesBasicas; // Declara o pacote onde esta classe reside

public class Tarefa {
    // Declara um atributo privado do tipo String para armazenar a descrição da tarefa
    private String descricao;

    // Construtor da classe Tarefa que inicializa o atributo descricao com o valor fornecido
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Método público que retorna a descrição da tarefa
    public String getDescricao() {
        return descricao; // Retorna o valor do atributo descricao
    }

    @Override
    public String toString() {
        return descricao;
    }
}
