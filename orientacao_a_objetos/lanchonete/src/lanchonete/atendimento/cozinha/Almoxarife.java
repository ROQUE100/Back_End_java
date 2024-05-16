package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DE INTENS");
				
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DE INTESN");
		
	}
	void entregarIngredientes() {
		controlarSaida();
		controlarEntrada();
		System.out.println("ENTREGANDO INGREDIENTES");
		
	}
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GAS");
	}

}
