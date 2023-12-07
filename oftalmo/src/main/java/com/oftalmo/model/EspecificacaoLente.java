package com.oftalmo.model;

public class EspecificacaoLente extends GenericModel {
    
    private float valor;
    private Integer idEstruturaLente;
    private Integer idAtributoEstruturaLente;

    public EspecificacaoLente (float valor, Integer idEstruturaLente, Integer idAtributoEstruturaLente) {
        this.valor = valor;
        this.idEstruturaLente = idEstruturaLente;
        this.idAtributoEstruturaLente = idAtributoEstruturaLente;
    }

    public EspecificacaoLente (Integer id, float valor, Integer idEstruturaLente, Integer idAtributoEstruturaLente) {
        this.valor = valor;
        this.idEstruturaLente = idEstruturaLente;
        this.idAtributoEstruturaLente = idAtributoEstruturaLente;
        super.setId(id);
    }

    public float getValor () {
        return valor;
    }

    public void setValor (float valor) {
        this.valor = valor;
    }

    public Integer getIdEstruturaLente () {
        return idEstruturaLente;
    }

    public void setIdEstruturaLente (Integer idEstruturaLente) {
        this.idEstruturaLente = idEstruturaLente;
    }

    public Integer getIdAtributoEstruturaLente () {
        return idAtributoEstruturaLente;
    }

    public void setIdAtributoEstruturaLente (Integer idAtributoEstruturaLente) {
        this.idAtributoEstruturaLente = idAtributoEstruturaLente;
    }

    @Override
    public String toString() {
        return "EspecificacaoLente {" +
                "id=" + getId() +
                "valor=" + valor + '\'' +
                "idEstruturaLente=" + idEstruturaLente + '\'' +
                "idAtributoEstruturaLente=" + idAtributoEstruturaLente + 
                '}';
    }
} 
