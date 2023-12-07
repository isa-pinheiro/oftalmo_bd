package com.oftalmo.model;

import java.sql.Date;

public class ConsultaMedica extends GenericModel {
    
    private String assinatura;
    private Date dtConsulta;
    private Integer idPaciente;
    private Integer idMedico;

    public ConsultaMedica(String assinatura, Date dtConsulta, Integer idPaciente, Integer idMedico) {
        this.assinatura = assinatura;
        this.dtConsulta = dtConsulta;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
    }

    public ConsultaMedica(Integer id, String assinatura, Date dtConsulta, Integer idPaciente, Integer idMedico) {
        this.assinatura = assinatura;
        this.dtConsulta = dtConsulta;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;        
        super.setId(id);
    }

    public String getAssinatura () {
        return assinatura;
    }

    public void setAssinatura (String assinatura) {
        this.assinatura = assinatura;
    }

    public Date getDtConsulta () {
        return dtConsulta;
    }

    public void setDtConsulta (Date dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public Integer getIdPaciente () {
        return idPaciente;
    }

    public void setIdPaciente (Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdMedico () {
        return idMedico;
    }

    public void setIdMedico (Integer idMedico) {
        this.idMedico = idMedico;
    }

    @Override
    public String toString() {
        return "ConsultaMedica {" +
                "id=" + getId() +
                "assinatura=" + assinatura + '\'' +
                "dtConsulta=" + dtConsulta + '\'' +
                "idPaciente=" + idPaciente + '\'' +
                "idMedico=" + idMedico + 
                '}';
    }
}
