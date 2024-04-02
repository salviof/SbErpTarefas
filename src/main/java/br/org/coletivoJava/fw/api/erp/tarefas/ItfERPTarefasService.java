/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.tarefas;

import br.org.coletivoJava.fw.api.erp.tarefas.model.ItfERPTarefa;

/**
 *
 * @author salvio
 */
public interface ItfERPTarefasService {

    public String getCodigoEspacoByName(String pCodigoTime, String pNomeEpaco);

    public String getCodigoTimeByName(String pSlug);

    public ItfERPTarefa getTarefaByID(String id);

    public String getListaDoEspacoByNameContendo(String pCodigoEspaco, String pTrechoNome);

    public String getListaDaPastaByNameContendo(String pCodigoPasta, String pTrechoNome);

    public String getCodigoPastaByNameContendo(String pCodigoEspaco, String pTrechoNome);

    public String criarPasta(String pCodigoEspaco, String pNome);

    public String criarListaNaPasta(String pCodigoPasta, String pNome);

    public ItfERPTarefa getTarefaEmPAByNameContendo(String pCodigoLista, String pTrechoNome);

    public ItfERPTarefa getTarefaEmListaByNameContendo(String pCodigoLista, String pTrechoNome);

    public String getCodigoModeloByNameContendo(String pCodigoTime, String... pTrechosNome);

    public boolean criarTarefaViaModelo(String pCodigoLista, String pModeloTarefa, String pNomeTarefa);

}
