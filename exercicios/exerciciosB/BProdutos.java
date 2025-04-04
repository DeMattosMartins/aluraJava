package exerciciosB;

public class BProdutos {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double aplicarDesconto(double desconto){
        return preco - ((desconto/100)*preco);
    }
}

