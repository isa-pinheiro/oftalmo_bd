package com.oftalmo.DAO;

import com.oftalmo.model.ReceitaOculos;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReceitaOculosDAO extends ConexaoDB {

    private static final String INSERT_RECEITAOCULOS_SQL = "INSERT INTO receitas_oculos (detalhamento, dt_consulta, id_consulta_medica) VALUES (?, ?, ?);";
    private static final String SELECT_RECEITAOCULOS_BY_ID = "SELECT id, detalhamento, dt_consulta, id_consulta_medica FROM receitas_oculos WHERE id = ?";
    private static final String SELECT_ALL_RECEITAOCULOS = "SELECT * FROM receitas_oculos;";
    private static final String DELETE_RECEITAOCULOS_SQL = "DELETE FROM receitas_oculos WHERE id = ?;";
    private static final String UPDATE_RECEITAOCULOS_SQL = "UPDATE receitas_oculos SET detalhamento = ?, dt_consulta = ?, id_consulta_medica = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM receitas_oculos;";

    public Integer count() {
        Integer count = 0;
        try (PreparedStatement preparedStatement = prepararSQL(TOTAL)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                count = rs.getInt("count");
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    public void insertReceitaOculos(ReceitaOculos entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_RECEITAOCULOS_SQL)) {
            preparedStatement.setString(1, entidade.getDetalhamento());
            preparedStatement.setDate(2, entidade.getDtConsulta());
            preparedStatement.setInt(3, entidade.getIdConsultaMedica());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ReceitaOculos selectReceitaOculos(int id) {
        ReceitaOculos entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_RECEITAOCULOS_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String detalhamento = rs.getString("detalhamento");
                Date dtConsulta = rs.getDate("dt_consulta");
                Integer idConsultaMedica = rs.getInt("id_consulta_medica");
                entidade = new ReceitaOculos(id, detalhamento, dtConsulta, idConsultaMedica);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<ReceitaOculos> selectAllReceitaOculoss() {
        List<ReceitaOculos> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_RECEITAOCULOS)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String detalhamento = rs.getString("detalhamento");
                Date dtConsulta = rs.getDate("dt_consulta");
                Integer idConsultaMedica = rs.getInt("id_consulta_medica");
                entidades.add(new ReceitaOculos(id, detalhamento, dtConsulta, idConsultaMedica));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteReceitaOculos(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_RECEITAOCULOS_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateReceitaOculos(ReceitaOculos entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_RECEITAOCULOS_SQL)) {
            statement.setString(1, entidade.getDetalhamento());
            statement.setDate(2, entidade.getDtConsulta());
            statement.setInt(3, entidade.getIdConsultaMedica());
            statement.setInt(4, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
