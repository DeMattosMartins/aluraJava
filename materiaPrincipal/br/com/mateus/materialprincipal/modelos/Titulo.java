package br.com.mateus.materialprincipal.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluido;
    private double somaAvaliacao;
    private int totalDeAvaliacao = 0;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluido(boolean incluido) {
        this.incluido = incluido;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibeFicha(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    public void avalia(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacao++;
    }
    public double obterMedia(){
        return somaAvaliacao/totalDeAvaliacao;
    }


}
