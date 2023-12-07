package com.oftalmo.model;

import java.sql.Date;

public class ReceitaOculos extends GenericModel {

    private String detalhamento;
    private Date dtConsulta;
    private Integer idConsultaMedica;
    
    public ReceitaOculos (Date dtConsulta, Integer idConsultaMedica) {
        this.dtConsulta = dtConsulta;
        this.idConsultaMedica = idConsultaMedica;
    }

    public ReceitaOculos (String detalhamento, Date dtConsulta, Integer idConsultaMedica) {
        this.detalhamento = detalhamento;
        this.dtConsulta = dtConsulta;
        this.idConsultaMedica = idConsultaMedica;
    }

    public ReceitaOculos (Integer id, String detalhamento, Date dtConsulta, Integer idConsultaMedica) {
        this.detalhamento = detalhamento;
        this.dtConsulta = dtConsulta;
        this.idConsultaMedica = idConsultaMedica;
        super.setId(id);
    }

    public String getDetalhamento () {
        return detalhamento;
    }

    public void setDetalhamento (String detalhamento) {
        this.detalhamento = detalhamento;
    }

    public Date getDtConsulta () {
        return dtConsulta;
    }

    public void setDtConsulta (Date dtConsulta) {
        this.dtConsulta = dtConsulta;
    }

    public Integer getIdConsultaMedica () {
        return idConsultaMedica;
    }

    public void setIdConsultaMedica (Integer idConsultaMedica) {
        this.idConsultaMedica = idConsultaMedica;
    }

    @Override
    public String toString() {
        return "ReceitaOculos {" +
                "id=" + getId() + '\'' +
                "detalhamento=" + detalhamento + '\'' +
                "dtConsulta=" + dtConsulta + '\'' +
                "idConsultaMedica=" + idConsultaMedica +
                '}';
    }
}
