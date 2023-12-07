package com.oftalmo.model;
import java.sql.Date;

public class EspecialidadeMedica extends GenericModel {
    
    private String observacao;
    private Date dtConclusao;
    private Integer idEspecialidade;
    private Integer idMedico;

    public EspecialidadeMedica (Integer idEspecialidade, Integer idMedico) {
        this.idEspecialidade = idEspecialidade;
        this.idMedico = idMedico;
    }

    public EspecialidadeMedica (String observacao, Integer idEspecialidade, Integer idMedico) {
        this.observacao = observacao;
        this.idEspecialidade = idEspecialidade;
        this.idMedico = idMedico;
    }

    public EspecialidadeMedica (Date dtConclusao, Integer idEspecialidade, Integer idMedico) {
        this.dtConclusao = dtConclusao;
        this.idEspecialidade = idEspecialidade;
        this.idMedico = idMedico;
    }

    public EspecialidadeMedica (String observacao, Date dtConclusao, Integer idEspecialidade, Integer idMedico) {
        this.observacao = observacao;
        this.dtConclusao = dtConclusao;
        this.idEspecialidade = idEspecialidade;
        this.idMedico = idMedico;
    }

    public EspecialidadeMedica (Integer id, String observacao, Date dtConclusao, Integer idEspecialidade, Integer idMedico) {
        this.observacao = observacao;
        this.dtConclusao = dtConclusao;
        this.idEspecialidade = idEspecialidade;
        this.idMedico = idMedico;
        super.setId(id);
    }

    public String getObservacao () {
        return observacao;
    }

    public void setObservacao (String observacao) {
        this.observacao = observacao;
    }

    public Date getDtConclusao () {
        return dtConclusao;
    }

    public void setDtConclusao (Date dtConclusao) {
        this.dtConclusao = dtConclusao;
    }

    public Integer getIdEspecialidade () {
        return idEspecialidade;
    }

    public void setIdEspecialidade (Integer idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    public Integer getIdMedico () {
        return idMedico;
    }

    public void setIdMedico (Integer idMedico) {
        this.idMedico = idMedico;
    }

    @Override
    public String toString() {
        return "EspecialidadeMedica {" +
                "id=" + getId() +
                "observacao=" + observacao + '\'' +
                "dtConclusao=" + dtConclusao + '\'' +
                "idEspecialidade=" + idEspecialidade + '\'' +
                "idMedico=" + idMedico + 
                '}';
    }
}
