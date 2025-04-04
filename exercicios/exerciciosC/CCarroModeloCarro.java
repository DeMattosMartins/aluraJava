package exerciciosC;

public class CCarroModeloCarro extends CCarro {

    public void informacao(){

        double media = (getPrecoAno1() + getPrecoAno2() + getPrecoAno3())/3;
        System.out.println("A media dos valores do carro " + getModelo()+ " é: " + media);

    }
}
