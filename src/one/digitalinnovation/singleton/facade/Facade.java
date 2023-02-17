package one.digitalinnovation.singleton.facade;

import one.digitalinnovation.singleton.SingletonEager;

public class Facade {
    private int CepApi;

    public void migrarCliente(String nome, String cep){;
         String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
