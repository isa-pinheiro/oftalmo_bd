package com.oftalmo.util;

import java.sql.SQLException;
import java.util.List;

import com.oftalmo.DAO.EstruturaLenteDAO;
import com.oftalmo.model.EstruturaLente;


public class EstruturaLenteTeste {

    static EstruturaLenteDAO estruturalentedao = new EstruturaLenteDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println("count");
        int c = estruturalentedao.count();
        System.out.println(c);

        //salvar
        System.out.println("Salvar");
        EstruturaLente estruturalente = new EstruturaLente("tipocorrecao", 1, 1);
        estruturalentedao.insertEstruturaLente(estruturalente);

        //buscar por ID
        System.out.println("Busca id");
        estruturalente = estruturalentedao.selectEstruturaLente(1);
        System.out.println(estruturalentedao.selectEstruturaLente(1));

        //update
        System.out.println("update");
        estruturalente.setTipoCorrecao("tipocorrecao1");
        estruturalente.setDistanciaPupilar(2);
        estruturalente.setIdReceitaOculos(1);
        estruturalentedao.updateEstruturaLente(estruturalente);
        estruturalente = estruturalentedao.selectEstruturaLente(1);
        System.out.println(estruturalente);

        //select all
        System.out.println("select all");
        List<EstruturaLente> estruturalentes = estruturalentedao.selectAllEstruturaLentes();
        estruturalentes.forEach(System.out::println);

        //delete
        // System.out.println("delete");
        // estruturalentedao.deleteEstruturaLente(1);
        // estruturalentedao.selectAllEstruturaLentes().forEach(System.out::println);
    }
}
