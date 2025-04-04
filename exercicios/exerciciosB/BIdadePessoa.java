package exerciciosB;

import java.util.Scanner;

public class BIdadePessoa {
    Scanner scanner = new Scanner(System.in);

    private String nome = "Mateus";
    private int idade = 21;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void modifica (int n){
        if (n == 1){
            System.out.println("Diga a nova idade: ");
            int idade3 = scanner.nextInt();
            setIdade(idade3);
        } else if (n == 2) {
            System.out.println("Diga o novo nome: ");
            String novoNome = scanner.nextLine();
            setNome(novoNome);
        } else {
            System.out.println("Opção invalida");
        }
    }
    public void verificaIdade(){
        if(idade > 18){
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Não é maior de idade.");
        }
    }
}
