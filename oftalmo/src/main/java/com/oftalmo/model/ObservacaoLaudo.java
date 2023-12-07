package com.oftalmo.model;

public class ObservacaoLaudo extends GenericModel {
    
    private String descricao;
    private Integer idReceitaOculos;

    public ObservacaoLaudo (String descricao, Integer idReceitaOculos) {
        this.descricao = descricao;
        this.idReceitaOculos = idReceitaOculos;
    }

    public ObservacaoLaudo (Integer id, String descricao, Integer idReceitaOculos) {
        this.descricao = descricao;
        this.idReceitaOculos = idReceitaOculos;
        super.setId(id);
    }

    public String getDescricao () {
        return descricao;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public Integer getIdReceitaOculos () {
        return idReceitaOculos;
    }

    public void setIdReceitaOculos (Integer idReceitaOculos) {
        this.idReceitaOculos = idReceitaOculos;
    }

    @Override
    public String toString() {
        return "ObservacaoLaudo {" +
                "id=" + getId() +
                "descricao=" + descricao + '\'' +
                "idReceitaOculos=" + idReceitaOculos + 
                '}';
    }
}
