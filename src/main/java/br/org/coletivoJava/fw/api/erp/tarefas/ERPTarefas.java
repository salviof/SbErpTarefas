package br.org.coletivoJava.fw.api.erp.tarefas;

import com.super_bits.modulosSB.SBCore.modulos.erp.ApiERPColetivoJavaFW;
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfApiErpSuperBits;

/**
 *
 * @author salvio
 */
@ApiERPColetivoJavaFW(descricaoApi = "Tarefas gestão de projetos", nomeApi = "Tarefas", slugInicial = "Tarefas")
public enum ERPTarefas implements ItfApiErpSuperBits<ItfERPTarefasService> {

    CLICKUP,
    ASANA;

    @Override
    public Class<? extends ItfERPTarefasService> getInterface() {
        return ItfERPTarefasService.class;
    }

    @Override
    public Class<? extends ItfERPTarefasService> getClasseImplementacaoPadrao() {
        return ItfERPTarefasService.class;
    }

}
