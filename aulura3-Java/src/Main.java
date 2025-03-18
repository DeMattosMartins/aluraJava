
//    primeiros codigos em java;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        System.out.println("Filme: Top Gun: Maverick");
        int ano = 2022;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = false;
        double noteDoFilme = 8.8;

        System.out.printf("\n");
        double media = (9.8 + 6.8 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme top Gun.
                Filme de aventura dos anos 80.
                Ano de lançamento
                """ + ano;
        System.out.println(sinopse);

        System.out.printf("\n");

        int estrela = (int) (media / 2);
        System.out.println(estrela);
    }
}