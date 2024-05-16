package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("claudio", "000.000.000-05");
		aluno.setNome("felipe");
		aluno.setIdade(8);
		aluno.setCpf("000.000.000-00");
		aluno.setEndereco("Av. 13 de maio, 1506");
		
		System.out.println(aluno.getCpf() +" "+ aluno.getEndereco());
		System.out.println("O aluno "+ aluno.getNome() + " tem "+ aluno.getIdade() + " anos");
	}

}
