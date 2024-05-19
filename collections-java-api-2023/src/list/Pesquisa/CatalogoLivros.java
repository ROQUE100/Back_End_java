package list.Pesquisa; // Declara o pacote onde a classe está localizada

import java.util.ArrayList; // Importa a classe ArrayList
import java.util.List; // Importa a interface List

// Declara a classe CatalogoLivros
public class CatalogoLivros {
    // Atributo para armazenar a lista de livros
    private List<Livro> livroList;

    // Construtor que inicializa a lista de livros
    public CatalogoLivros() {
        this.livroList = new ArrayList<>(); // Inicializa a lista de livros como um ArrayList vazio
    }

    // Método para adicionar um livro ao catálogo
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao)); // Cria um novo objeto Livro e o adiciona à lista de livros
    }

    // Método para pesquisar livros pelo autor
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>(); // Cria uma lista para armazenar os livros do autor
        if (!livroList.isEmpty()) { // Verifica se a lista de livros não está vazia
            for (Livro l : livroList) { // Percorre todos os livros na lista
                if (l.getAutor().equalsIgnoreCase(autor)) { // Verifica se o autor do livro corresponde ao autor pesquisado
                    livrosPorAutor.add(l); // Adiciona o livro à lista de livros do autor
                }
            }
            return livrosPorAutor; // Retorna a lista de livros do autor
        } else {
            throw new RuntimeException("A lista está vazia!"); // Lança uma exceção se a lista de livros estiver vazia
        }
    }

    // Método para pesquisar livros por um intervalo de anos
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>(); // Cria uma lista para armazenar os livros dentro do intervalo de anos
        if (!livroList.isEmpty()) { // Verifica se a lista de livros não está vazia
            for (Livro l : livroList) { // Percorre todos os livros na lista
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) { // Verifica se o ano de publicação do livro está dentro do intervalo
                    livrosPorIntervaloAnos.add(l); // Adiciona o livro à lista de livros do intervalo de anos
                }
            }
            return livrosPorIntervaloAnos; // Retorna a lista de livros dentro do intervalo de anos
        } else {
            throw new RuntimeException("A lista está vazia!"); // Lança uma exceção se a lista de livros estiver vazia
        }
    }

    // Método para pesquisar um livro pelo título
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null; // Inicializa a variável que armazenará o livro encontrado
        if (!livroList.isEmpty()) { // Verifica se a lista de livros não está vazia
            for (Livro l : livroList) { // Percorre todos os livros na lista
                if (l.getTitulo().equalsIgnoreCase(titulo)) { // Verifica se o título do livro corresponde ao título pesquisado
                    livroPorTitulo = l; // Atribui o livro encontrado à variável
                    break; // Interrompe o loop após encontrar o livro
                }
            }
            return livroPorTitulo; // Retorna o livro encontrado
        } else {
            throw new RuntimeException("A lista está vazia!"); // Lança uma exceção se a lista de livros estiver vazia
        }
    }

    // Método principal para testar as funcionalidades do catálogo de livros
    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        // Exibindo livros pelo mesmo autor
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

        // Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

        // Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
    }
}
