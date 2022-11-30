package seguro;

import local.Endereco;

public class SeguroCasa extends Seguro{
    private int deducaoCasa;
    private int anoCompra;


    public SeguroCasa(
        int numApolice, String nome, Endereco endereco,
        float valor, float premio, int deducaoCasa, int anoCompra
        ) {
        super(numApolice, nome, endereco, valor, premio);
        this.deducaoCasa = deducaoCasa;
        this.anoCompra = anoCompra;
    }


    @Override
    public String toString() {
        return getDeducaoCasa() + "\n" + 
        getAnoCompra();
    }

    @Override
    public String imprimirSeguro() {
        System.out.println(toString());
        return toString();
    }


    public int getDeducaoCasa() {
        return deducaoCasa;
    }
    public void setDeducaoCaso(int deducaoCaso) {
        this.deducaoCasa = deducaoCaso;
    }

    public int getAnoCompra() {
        return anoCompra;
    }
    public void setAnoCompra(int anoCompra) {
        this.anoCompra = anoCompra;
    }
}
