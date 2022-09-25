package lp2;

public class Historico {
    private Integer alunoMatricula;
    private String alunoNome;
    private String alunoCurso;
    private double alunoNota1;
    private double alunoNota2;
    private double alunoNota3;
    private double alunoNota4;
    

    public Historico(Integer alunoMatricula, String alunoNome, String alunoCurso, double alunoNota1,
    double alunoNota2,double alunoNota3, double alunoNota4) {
        this.alunoMatricula = alunoMatricula;
        this.alunoNome = alunoNome;
        this.alunoCurso = alunoCurso;
        this.alunoNota1 = alunoNota1;
        this.alunoNota2 = alunoNota2;
        this.alunoNota3 = alunoNota3;
        this.alunoNota4 = alunoNota4;
    }

    
    public Integer getAlunoMatricula() {
        return alunoMatricula;
    }
    public void setAlunoMatricula(Integer alunoMatricula) {
        this.alunoMatricula = alunoMatricula;
    }

    public String getAlunoNome() {
        return alunoNome;
    }
    public void setAlunoNome(String alunoNome) {
        this.alunoNome = alunoNome;
    }

    public String getAlunoCurso() {
        return alunoCurso;
    }
    public void setAlunoCurso(String alunoCurso) {
        this.alunoCurso = alunoCurso;
    }

    public double getAlunoNota1() {
        return alunoNota1;
    }
    public void setAlunoNota1(double alunoNota1) {
        this.alunoNota1 = alunoNota1;
    }

    public double getAlunoNota2() {
        return alunoNota2;
    }
    public void setAlunoNota2(double alunoNota2) {
        this.alunoNota2 = alunoNota2;
    }

    public double getAlunoNota3() {
        return alunoNota3;
    }
    public void setAlunoNota3(double alunoNota3) {
        this.alunoNota3 = alunoNota3;
    }

    public double getAlunoNota4() {
        return alunoNota4;
    }
    public void setAlunoNota4(double alunoNota4) {
        this.alunoNota4 = alunoNota4;
    }
}
