package exerciciosD;

public class DConversorMoeda implements DConversorMoedaFinanceiro {
    @Override
    public void converterDolarParaReal(double a) {
        System.out.println("O valor " + a + " em dolares convertido para reais fica: " + (a*5.16) + "\n(taxa de cambio: 5.16.)");
    }
}
