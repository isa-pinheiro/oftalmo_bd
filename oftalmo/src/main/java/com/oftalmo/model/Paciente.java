package com.oftalmo.model;

import java.sql.Date;

public class Paciente extends GenericModel {
    
    private String nome;
    private String cpf;
    private Date dtNascimento;

    public Paciente(String nome, String cpf, Date dtNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
    }

    public Paciente(Integer id, String nome, String cpf, Date dtNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        super.setId(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Override
    public String toString() {
        return "Paciente {" +
                "id=" + getId() +
                "nome=" + nome + '\'' +
                "cpf=" + cpf + '\'' +
                "dtNascimento=" + dtNascimento +
                '}';
    }
}
