package seguro;

import local.Endereco;

public class SeguroAuto extends Seguro {
    private int deducaoAutomovel;
    private int numLicenca;
    private String estado;
    private String modelo;
    private int ano;

    public SeguroAuto(
        int numApolice, String nome, Endereco endereco, float valor, float premio, int deducaoAutomovel,
        int numLicenca, String estado, String modelo, int ano
    ) {
        super(numApolice, nome, endereco, valor, premio);
        this.deducaoAutomovel = deducaoAutomovel;
        this.numLicenca = numLicenca;
        this.estado = estado;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return getDeducaoAutomovel() + "\n" +
        getNumLicenca() + "\n" +
        getEstado() + "\n" +
        getModelo() + "\n" +
        getAno();
    }
    
    @Override
    public String imprimirSeguro() {
        System.out.println(toString());
        return toString();
    }

    public int getDeducaoAutomovel() {
        return deducaoAutomovel;
    }

    public void setDeducaoAutomovel(int deducaoAutomovel) {
        this.deducaoAutomovel = deducaoAutomovel;
    }

    public int getNumLicenca() {
        return numLicenca;
    }

    public void setNumLicenca(int numLicenca) {
        this.numLicenca = numLicenca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
