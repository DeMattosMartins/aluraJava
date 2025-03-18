public class oi {
    public static void main(String[] args) {
        int ano = 2022;
        boolean incluidoNoPlano = false;
        double noteDoFilme = 8.8;
        String tipoPlano = "Premium";

        if (ano > 2022){
            System.out.println("Pessoas estão curtindo!");
        } else {
            System.out.println("Filme retro! ");
            }

        if (incluidoNoPlano == true || tipoPlano.equals("Premium")){
            System.out.println("Filme disponivel.");
            } else {
            System.out.println("Compre o plano para assistir.");
        }
        }
    }

