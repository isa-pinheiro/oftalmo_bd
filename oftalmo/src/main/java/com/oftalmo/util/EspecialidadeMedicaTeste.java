package com.oftalmo.util;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.oftalmo.DAO.EspecialidadeMedicaDAO;
import com.oftalmo.model.EspecialidadeMedica;


public class EspecialidadeMedicaTeste {

    static EspecialidadeMedicaDAO especialidademedicadao = new EspecialidadeMedicaDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println("count");
        int c = especialidademedicadao.count();
        System.out.println(c);

        //salvar
        System.out.println("Salvar");
        EspecialidadeMedica especialidademedica = new EspecialidadeMedica("observacao", Date.valueOf("1000-01-01"), 1, 1);
        especialidademedicadao.insertEspecialidadeMedica(especialidademedica);

        //buscar por ID
        System.out.println("Busca id");
        especialidademedica = especialidademedicadao.selectEspecialidadeMedica(1);
        System.out.println(especialidademedicadao.selectEspecialidadeMedica(1));

        //update
        System.out.println("update");
        especialidademedica.setObservacao("observacao1");
        especialidademedica.setDtConclusao(Date.valueOf("2001-01-01"));
        especialidademedica.setIdEspecialidade(1);
        especialidademedica.setIdMedico(1);
        especialidademedicadao.updateEspecialidadeMedica(especialidademedica);
        especialidademedica = especialidademedicadao.selectEspecialidadeMedica(1);
        System.out.println(especialidademedica);

        //select all
        System.out.println("select all");
        List<EspecialidadeMedica> especialidademedicas = especialidademedicadao.selectAllEspecialidadeMedicas();
        especialidademedicas.forEach(System.out::println);

        //delete
        // System.out.println("delete");
        // especialidademedicadao.deleteEspecialidadeMedica(1);
        // especialidademedicadao.selectAllEspecialidadeMedicas().forEach(System.out::println);
    }
}
