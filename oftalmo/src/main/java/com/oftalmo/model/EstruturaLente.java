package com.oftalmo.model;

public class EstruturaLente extends GenericModel {
    
    private String tipoCorrecao;
    private Integer distanciaPupilar;
    private Integer idReceitaOculos;

    public EstruturaLente (String tipoCorrecao, Integer distanciaPupilar, Integer idReceitaOculos) {
        this.tipoCorrecao = tipoCorrecao;
        this.distanciaPupilar = distanciaPupilar;
        this.idReceitaOculos = idReceitaOculos;
    }

    public EstruturaLente (Integer id, String tipoCorrecao, Integer distanciaPupilar, Integer idReceitaOculos) {
        this.tipoCorrecao = tipoCorrecao;
        this.distanciaPupilar = distanciaPupilar;
        this.idReceitaOculos = idReceitaOculos;
        super.setId(id);
    }

    public String getTipoCorrecao () {
        return tipoCorrecao;
    }

    public void setTipoCorrecao (String tipoCorrecao) {
        this.tipoCorrecao = tipoCorrecao;
    }

    public Integer getDistanciaPupilar () {
        return distanciaPupilar;
    }

    public void setDistanciaPupilar (Integer distanciaPupilar) {
        this.distanciaPupilar = distanciaPupilar;
    }

    public Integer getIdReceitaOculos () {
        return idReceitaOculos;
    }

    public void setIdReceitaOculos (Integer idReceitaOculos) {
        this.idReceitaOculos = idReceitaOculos;
    }

    @Override
    public String toString() {
        return "EstruturaLente {" +
                "id=" + getId() +
                "tipoCorrecao=" + tipoCorrecao + '\'' +
                "distanciaPupilar=" + distanciaPupilar + '\'' +
                "idReceitaOculos=" + idReceitaOculos + 
                '}';
    }

}
