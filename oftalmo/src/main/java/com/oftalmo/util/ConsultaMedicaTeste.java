package com.oftalmo.util;

import java.sql.SQLException;
import java.util.List;
import java.sql.Date;

import com.oftalmo.DAO.ConsultaMedicaDAO;
import com.oftalmo.model.ConsultaMedica;


public class ConsultaMedicaTeste {

    static ConsultaMedicaDAO consultamedicadao = new ConsultaMedicaDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println("count");
        int c = consultamedicadao.count();
        System.out.println(c);

        //salvar
        System.out.println("Salvar");
        ConsultaMedica consultamedica = new ConsultaMedica("assinatura", Date.valueOf("2000-01-01"), 1, 1);
        consultamedicadao.insertConsultaMedica(consultamedica);

        //buscar por ID
        System.out.println("Busca id");
        consultamedica = consultamedicadao.selectConsultaMedica(1);
        System.out.println(consultamedicadao.selectConsultaMedica(1));

        //update
        System.out.println("update");
        consultamedica.setAssinatura("assinatura1");
        consultamedica.setDtConsulta(Date.valueOf("2001-01-01"));
        consultamedica.setIdPaciente(1);
        
        consultamedicadao.updateConsultaMedica(consultamedica);
        consultamedica = consultamedicadao.selectConsultaMedica(1);
        System.out.println(consultamedica);

        //select all
        System.out.println("select all");
        List<ConsultaMedica> consultamedicas = consultamedicadao.selectAllConsultaMedicas();
        consultamedicas.forEach(System.out::println);

        //delete
        // System.out.println("delete");
        // consultamedicadao.deleteConsultaMedica(1);
        // consultamedicadao.selectAllConsultaMedicas().forEach(System.out::println);
    }
}
