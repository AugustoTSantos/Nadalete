package local;

public class Endereco {
    private String endecoCompleto;
    private String cidade;
    private String estado;
    private String cep;


    public Endereco(String endecoCompleto, String cidade, String estado, String cep) {
        this.endecoCompleto = endecoCompleto;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }


    @Override
    public String toString() {
        return getEndecoCompleto() + "\n" + getCidade() + "\n" + getEstado() + "\n" + getCep();
        
    }

    public String imprimirData() {
        System.out.println(toString());
        return toString();
    }


    public String getEndecoCompleto() {
        return endecoCompleto;
    }
    public void setEndecoCompleto(String endecoCompleto) {
        this.endecoCompleto = endecoCompleto;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
}
