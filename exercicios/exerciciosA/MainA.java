package exerciciosA;//exercicios propostos

import java.util.Scanner;

public class MainA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //1.Crie uma classe Pessoa com um metodo que exibe "Olá, mundo!" no console;
        APessoa APessoa = new APessoa();
        APessoa.imprimir("Ola mundo! \n");

    //2.Crie uma classe Calculadora com um metodo que recebe um número como parâmetro e retorna o dobro desse número.
        ACalculadora calcula = new ACalculadora();
        System.out.println("Digite um numero: ");

        double numero = scanner.nextDouble();
        System.out.println("O dobro do número é: " + calcula.dobro(numero) + "\n");

    //3.Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e metodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        AMusica musica21 = new AMusica();

        musica21.titulo = "Um minuto para o fim do mundo.";
        musica21.anoDeLancamento = 2005;
        musica21.artista = "CPM22";
        System.out.println("Nome da musica: " + musica21.titulo);
        System.out.println("Ano de lançamento: " + 2005);
        System.out.println("Artista: " + musica21.artista);

        System.out.println("Avalie a música de 0 a 10 (Digite -1 para sair): ");
        double avaliar = 0;
        while (avaliar != -1){
            avaliar = scanner.nextDouble();
            if (avaliar != -1){
                musica21.avaliacao += avaliar;
                musica21.numAvaliacao++;}
        }
        System.out.println("A media das avaliações é: " + musica21.avaliacao/ musica21.numAvaliacao + "\n");

    //4.Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

        ACarro ACarro = new ACarro();
        ACarro.modelo = "Ferrari LaFerrari";
        ACarro.ano = 2013;
        ACarro.cor = "Vermelha";
        System.out.println("Ficha técnica: \nModelo: " + ACarro.modelo+ "\nAno de lançamento: " + ACarro.ano + "\nCor: " + ACarro.cor);

        System.out.println("\nO carro tem " + ACarro.calculaIdade(ACarro.ano) + " anos");
    }
}
