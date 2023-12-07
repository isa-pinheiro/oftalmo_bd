package com.oftalmo.model;

public class Medico extends GenericModel {
    
    private String nome;
    private String crm;

    public Medico(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public Medico(Integer id, String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
        super.setId(id);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico {" +
                "id=" + getId() +
                "nome=" + nome + '\'' +
                "crm=" + crm + 
                '}';
    }
}
