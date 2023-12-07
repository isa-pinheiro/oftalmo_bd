package com.oftalmo.util;

import java.sql.SQLException;
import java.util.List;

import com.oftalmo.DAO.AtributoEstruturaLenteDAO;
import com.oftalmo.model.AtributoEstruturaLente;


public class AtributoEstruturaLenteTeste {

    static AtributoEstruturaLenteDAO especialidadedao = new AtributoEstruturaLenteDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println("count");
        int c = especialidadedao.count();
        System.out.println(c);

        //salvar
        System.out.println("Salvar");
        AtributoEstruturaLente especialidade = new AtributoEstruturaLente("descricao", "lado_olho");
        especialidadedao.insertAtributoEstruturaLente(especialidade);

        //buscar por ID
        System.out.println("Busca id");
        especialidade = especialidadedao.selectAtributoEstruturaLente(1);
        System.out.println(especialidadedao.selectAtributoEstruturaLente(1));

        //update
        System.out.println("update");
        especialidade.setDescricao("descricao1");
        especialidade.setLadoOlho("lado_olho1");
        especialidadedao.updateAtributoEstruturaLente(especialidade);
        especialidade = especialidadedao.selectAtributoEstruturaLente(1);
        System.out.println(especialidade);

        //select all
        System.out.println("select all");
        List<AtributoEstruturaLente> especialidades = especialidadedao.selectAllAtributoEstruturaLentes();
        especialidades.forEach(System.out::println);

        //delete
        // System.out.println("delete");
        // especialidadedao.deleteAtributoEstruturaLente(1);
        // especialidadedao.selectAllAtributoEstruturaLentes().forEach(System.out::println);
    }
}
