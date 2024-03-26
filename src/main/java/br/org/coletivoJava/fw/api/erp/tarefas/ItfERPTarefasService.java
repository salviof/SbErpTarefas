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

    public ItfERPTarefa getTarefaEmListaBySlug(String pCodigoLista, String id);

    public ItfERPTarefa getTarefaEmListaByFolder(String pCodigoLista, String id);

    public String getCodigoModeloBySlugs(String pCodigoTime, String... pSlugs);

}
