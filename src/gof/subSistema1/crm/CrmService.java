package gof.subSistema1.crm;

import javax.xml.transform.Source;

public class CrmService {

    private CrmService(){
        super();
    }
    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("cliente salvo no sistema CRM. ");
        System.out.println(nome);
        System.out.println(cidade);
        System.out.println(cep);
        System.out.println(estado);
    }
}
