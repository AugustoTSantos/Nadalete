package seguro;

import local.Endereco;

public abstract class Seguro {
    private int numApolice;
    private String nome;
    private Endereco endereco;
    private float valor;
    private float premio;


    public Seguro(int numApolice, String nome, Endereco endereco, float valor, float premio) {
        this.numApolice = numApolice;
        this.nome = nome;
        this.endereco = endereco;
        this.valor = valor;
        this.premio = premio;
    }


    @Override
    public String toString() {
        return getNumApolice() + "\n" + 
        getNome() + "\n" + 
        getEndereco() + "\n" + 
        getValor() + "\n" + 
        getPremio();
    }

    public abstract String imprimirSeguro();


    public int getNumApolice() {
        return numApolice;
    }
    public void setNumApolice(int numApolice) {
        this.numApolice = numApolice;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getPremio() {
        return premio;
    }
    public void setPremio(float premio) {
        this.premio = premio;
    }
}
