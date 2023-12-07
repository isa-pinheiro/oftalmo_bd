package com.oftalmo.util;

import java.sql.SQLException;
import java.util.List;

import com.oftalmo.DAO.ObservacaoLaudoDAO;
import com.oftalmo.model.ObservacaoLaudo;


public class ObservacaoLaudoTeste {

    static ObservacaoLaudoDAO observacaolaudodao = new ObservacaoLaudoDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println("count");
        int c = observacaolaudodao.count();
        System.out.println(c);

        //salvar
        System.out.println("Salvar");
        ObservacaoLaudo observacaolaudo = new ObservacaoLaudo("descricao", 1);
        observacaolaudodao.insertObservacaoLaudo(observacaolaudo);

        //buscar por ID
        System.out.println("Busca id");
        observacaolaudo = observacaolaudodao.selectObservacaoLaudo(1);
        System.out.println(observacaolaudodao.selectObservacaoLaudo(1));

        //update
        System.out.println("update");
        observacaolaudo.setDescricao("descricao1");
        observacaolaudo.setIdReceitaOculos(1);
        observacaolaudodao.updateObservacaoLaudo(observacaolaudo);
        observacaolaudo = observacaolaudodao.selectObservacaoLaudo(1);
        System.out.println(observacaolaudo);

        //select all
        System.out.println("select all");
        List<ObservacaoLaudo> observacaolaudos = observacaolaudodao.selectAllObservacaoLaudos();
        observacaolaudos.forEach(System.out::println);

        //delete
        // System.out.println("delete");
        // observacaolaudodao.deleteObservacaoLaudo(1);
        // observacaolaudodao.selectAllObservacaoLaudos().forEach(System.out::println);
    }
}
