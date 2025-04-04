package exerciciosB;

public class BAluno {
    private String aluno;
    private double notas;

    public double getNotas() {
        return notas;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public void setNotas(double notas) {
        this.notas += notas;
    }
    public double calcularMedia(double notasTotal, int divisor){
        return notasTotal/divisor;
    }
}
