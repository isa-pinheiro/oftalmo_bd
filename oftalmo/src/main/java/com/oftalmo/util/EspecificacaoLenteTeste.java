package com.oftalmo.util;

import java.sql.SQLException;
import java.util.List;

import com.oftalmo.DAO.EspecificacaoLenteDAO;
import com.oftalmo.model.EspecificacaoLente;


public class EspecificacaoLenteTeste {

    static EspecificacaoLenteDAO especificacaolentedao = new EspecificacaoLenteDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println("count");
        int c = especificacaolentedao.count();
        System.out.println(c);

        //salvar
        System.out.println("Salvar");
        EspecificacaoLente especificacaolente = new EspecificacaoLente(0.2f, 1, 1);
        especificacaolentedao.insertEspecificacaoLente(especificacaolente);

        //buscar por ID
        System.out.println("Busca id");
        especificacaolente = especificacaolentedao.selectEspecificacaoLente(1);
        System.out.println(especificacaolentedao.selectEspecificacaoLente(1));

        //update
        System.out.println("update");
        especificacaolente.setValor(0.4f);
        especificacaolente.setIdEstruturaLente(1);
        especificacaolente.setIdAtributoEstruturaLente(1);
        especificacaolentedao.updateEspecificacaoLente(especificacaolente);
        especificacaolente = especificacaolentedao.selectEspecificacaoLente(1);
        System.out.println(especificacaolente);

        //select all
        System.out.println("select all");
        List<EspecificacaoLente> especificacaolentes = especificacaolentedao.selectAllEspecificacaoLentes();
        especificacaolentes.forEach(System.out::println);

        //delete
        // System.out.println("delete");
        // especificacaolentedao.deleteEspecificacaoLente(1);
        // especificacaolentedao.selectAllEspecificacaoLentes().forEach(System.out::println);
    }
}
