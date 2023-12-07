package com.oftalmo.util;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.oftalmo.DAO.ReceitaOculosDAO;
import com.oftalmo.model.ReceitaOculos;


public class ReceitaOculosTeste {

    static ReceitaOculosDAO receitaoculosdao = new ReceitaOculosDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println("count");
        int c = receitaoculosdao.count();
        System.out.println(c);

        //salvar
        System.out.println("Salvar");
        ReceitaOculos receitaoculos = new ReceitaOculos("detalhamento", Date.valueOf("2000-01-01"), 2);
        receitaoculosdao.insertReceitaOculos(receitaoculos);

        //buscar por ID
        System.out.println("Busca id");
        receitaoculos = receitaoculosdao.selectReceitaOculos(1);
        System.out.println(receitaoculosdao.selectReceitaOculos(1));

        //update
        System.out.println("update");
        receitaoculos.setDetalhamento("detalhamento1");
        receitaoculos.setDtConsulta(Date.valueOf("2001-01-11"));
        receitaoculos.setIdConsultaMedica(2);
        receitaoculosdao.updateReceitaOculos(receitaoculos);
        receitaoculos = receitaoculosdao.selectReceitaOculos(1);
        System.out.println(receitaoculos);

        //select all
        System.out.println("select all");
        List<ReceitaOculos> receitaoculoss = receitaoculosdao.selectAllReceitaOculoss();
        receitaoculoss.forEach(System.out::println);

        //delete
        // System.out.println("delete");
        // receitaoculosdao.deleteReceitaOculos(1);
        // receitaoculosdao.selectAllReceitaOculoss().forEach(System.out::println);
    }
}
