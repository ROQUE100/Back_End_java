package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	
	//pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONADO LANCHE NATURAL HAMBURGER NO BALCAO");
	}
	
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONADO SUCO NO BALCAO");
				
	}
	
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
		
	}
	
	private void prepararLanche() {
		selecionarIngredietesLanche();
		fritarIngredienteslanche();
		prepararCombo();
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGER");
	}

	public void prepararVitamina() {
		selecionarIngredientesVitamina();
		baterVitaminaLiquidificador();
		System.out.println("PREPARANDO SUCO");
		
	}

	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
	}
	
	private void selecionarIngredietesLanche() {
		System.out.println("SELECIONANDO PAO, SALADA, OVO E CARNE");
	}
	
	public void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}

	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
	}
	
	private void fritarIngredienteslanche() {
		System.out.println("FRITANDO A CARNE E OVOS DO HAMBURGER");
	}
	
	//atendente e cozinheiro nao estao na mesma hierarquia de classe, 
	//e o metodo trocar gas nao é publico, logo nao é possivel chama-lo aqui
	//public void pedirParaTrocarGas(Atendente meuAmigo) {
	//	meuAmigo.trocarGas();
	//}
	
	void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}	
	
	public void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}	
	
	
}	

