package gof.facade;

import gof.subSistema1.crm.CrmService;
import gof.subSistema2.cep.CepApi;

public class Facade {

    public void migrarCliente (String nome, String cep){
        String cidade = CepApi.getCep().recuperarCidade(cep);
        String estado = CepApi.getCep().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);


    }
}
