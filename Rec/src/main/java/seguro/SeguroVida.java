package seguro;

import java.util.Date;

import local.Endereco;

public class SeguroVida extends Seguro{
    private String beneficiario;
    private Date dataNasc;


    public SeguroVida(
        int numApolice, String nome, Endereco endereco,
        float valor, float premio, String beneficiario, Date dataNasc
        ) {
        super(numApolice, nome, endereco, valor, premio);
        this.beneficiario = beneficiario;
        this.dataNasc = dataNasc;
    }


    @Override
    public String toString() {
        return getBeneficiario() + "\n" + 
        getDataNasc();
    }

    @Override
    public String imprimirSeguro() {
        System.out.println(toString());
        return toString();
    }


    public String getBeneficiario() {
        return beneficiario;
    }
    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Date getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
}
