import java.util.Scanner;

public class repeticao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double nota = 0;
        double media = 0;

        for (int i = 1; i <= 3; i++)   {
            System.out.println("Diga sua avaliação do filme: ");
            nota = leitura.nextDouble();
            media += nota;
        }
        System.out.println("Media da avaliação: " + media/3);
    }
}
