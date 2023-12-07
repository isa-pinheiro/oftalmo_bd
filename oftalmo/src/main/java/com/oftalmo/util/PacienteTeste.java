package com.oftalmo.util;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.oftalmo.DAO.PacienteDAO;
import com.oftalmo.model.Paciente;


public class PacienteTeste {

    static PacienteDAO pacientedao = new PacienteDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println("count");
        int c = pacientedao.count();
        System.out.println(c);

        //salvar
        System.out.println("Salvar");
        Paciente paciente = new Paciente("nome3", "cpf55", Date.valueOf("2050-01-01"));
        pacientedao.insertPaciente(paciente);

        //buscar por ID
        System.out.println("Busca id");
        paciente = pacientedao.selectPaciente(1);
        System.out.println(pacientedao.selectPaciente(1));

        //update
        System.out.println("update");
        paciente.setNome("nome2");
        paciente.setCpf("cpf55");
        paciente.setDtNascimento(Date.valueOf("2001-01-11"));
        pacientedao.updatePaciente(paciente);
        paciente = pacientedao.selectPaciente(1);
        System.out.println(paciente);

        //select all
        System.out.println("select all");
        List<Paciente> pacientes = pacientedao.selectAllPacientes();
        pacientes.forEach(System.out::println);

        //delete
        // System.out.println("delete");
        // pacientedao.deletePaciente(10);
        // pacientedao.selectAllPacientes().forEach(System.out::println);
    }
}
