package local;

public class Data {
    private int dia;
    private int mes;
    private int ano;


    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    @Override
    public String toString() {
        return getDia() + "/" + getMes() + "/" + getAno();
        
    }

    public String imprimirData() {
        System.out.println(toString());
        return toString();
    }


    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
