package com.oftalmo.util;

import java.sql.SQLException;
import java.util.List;

import com.oftalmo.DAO.MedicoDAO;
import com.oftalmo.model.Medico;


public class MedicoTeste {

    static MedicoDAO medicodao = new MedicoDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println("count");
        int c = medicodao.count();
        System.out.println(c);

        //salvar
        System.out.println("Salvar");
        Medico medico = new Medico("nome", "crm");
        medicodao.insertMedico(medico);

        //buscar por ID
        System.out.println("Busca id");
        medico = medicodao.selectMedico(1);
        System.out.println(medicodao.selectMedico(1));

        //update
        System.out.println("update");
        medico.setNome("nome1");
        medico.setCrm("crm1");
        medicodao.updateMedico(medico);
        medico = medicodao.selectMedico(1);
        System.out.println(medico);

        //select all
        System.out.println("select all");
        List<Medico> medicos = medicodao.selectAllMedicos();
        medicos.forEach(System.out::println);

        //delete
        // System.out.println("delete");
        // medicodao.deleteMedico(1);
        // medicodao.selectAllMedicos().forEach(System.out::println);
    }
}
