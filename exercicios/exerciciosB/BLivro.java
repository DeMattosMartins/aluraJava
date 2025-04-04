package exerciciosB;

public class BLivro {
    private String titulo;
    private String autor;

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void exibirDetalhe(String aut, String titu){
        System.out.println("O titulo é: " + titu + " do autor " + aut);
    }
}
