package com.oftalmo.util;

import java.sql.SQLException;
import java.util.List;

import com.oftalmo.DAO.EspecialidadeDAO;
import com.oftalmo.model.Especialidade;


public class EspecialidadeTeste {

    static EspecialidadeDAO especialidadedao = new EspecialidadeDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println("count");
        int c = especialidadedao.count();
        System.out.println(c);

        //salvar
        System.out.println("Salvar");
        Especialidade especialidade = new Especialidade("descricao", "conselho");
        especialidadedao.insertEspecialidade(especialidade);

        //buscar por ID
        System.out.println("Busca id");
        especialidade = especialidadedao.selectEspecialidade(1);
        System.out.println(especialidadedao.selectEspecialidade(1));

        //update
        System.out.println("update");
        especialidade.setDescricao("descricao1");
        especialidade.setConselho("conselho1");
        especialidadedao.updateEspecialidade(especialidade);
        especialidade = especialidadedao.selectEspecialidade(1);
        System.out.println(especialidade);

        //select all
        System.out.println("select all");
        List<Especialidade> especialidades = especialidadedao.selectAllEspecialidades();
        especialidades.forEach(System.out::println);

        //delete
        // System.out.println("delete");
        // especialidadedao.deleteEspecialidade(1);
        // especialidadedao.selectAllEspecialidades().forEach(System.out::println);
    }
}
