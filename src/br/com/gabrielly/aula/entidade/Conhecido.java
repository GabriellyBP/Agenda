package br.com.gabrielly.aula.entidade;

import br.com.gabrielly.aula.enums.Referencia;

public class Conhecido {

    private int id;
    private String nome;
    private Referencia referencia;
    private int ultimoId;

    public Conhecido(String nome, Referencia referencia) {
        this.nome = nome;
        this.referencia = referencia;
    }

    public Conhecido(int id, String nome, Referencia referencia) {
        this.id = id;
        this.nome = nome;
        this.referencia = referencia;
    }

    public Conhecido(String nome, String referencia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUltimoId() {
        return ultimoId;
    }

    public void setUltimoId(int ultimoId) {
        this.ultimoId = ultimoId;
    }

    public String getNome() {
        return nome;
    }

    public Referencia getReferencia() {
        return referencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setReferencia(Referencia referencia) {
        this.referencia = referencia;
    }
}
