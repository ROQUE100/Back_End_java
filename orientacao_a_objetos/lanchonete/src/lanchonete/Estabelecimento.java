package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//acoes que nao precisam estarem disponiveis para toda a aplicacao
		cozinheiro.lavarIngredientes();
		//cozinheiro.baterVitaminaLiquidificador();
		//cozinheiro.selecionarIngredientesVitamina();
		//cozinheiro.prepararLanche();
		//cozinheiro.prepararVitamina();
		
		//acoes que o estabelecimento precisa ter ciencia
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		//Almoxarife almoxarife = new Almoxarife();
		//acoes que nao preicisam estarem disponiveis para toda aplicacao
		//almoxarife.controlarEntrada();
		//almoxarife.controlarSaida();
		//acoes que somente o pacote cozinha precisa conhecer (default)
		//almoxarife.entregarIngredientes();
		
		Atendente atendente = new Atendente();
		//atendente.pegarLancheCozinha();
		//atendente.pegarPedidoBalcao();
		atendente.receberPagamento();
		atendente.servindoMesa();
		//nao precisa esta visivel para todos (default)
		//atendente.trocarGas();
		
		
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//nao deveria, mas o estabelecimento ainda nao definiu as normas
		//cliente.pegarPedidoBalcao();
		
		//esta acao deveria ser sigilosa, poderia ser privada
		//cliente.consultarSaldoAplicativo();
		
		//imagine os clientes ouvindo que o gas acabou?
		//cozinheiro.pedirParaTrocarGas(atendente);
		//cozinheiro.pedirParaTrocarGas(almoxarife);
		
		
	}

}
