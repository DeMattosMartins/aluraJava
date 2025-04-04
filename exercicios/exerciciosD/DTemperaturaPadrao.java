package exerciciosD;

public class DTemperaturaPadrao implements DTemperaturaPadraoConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double c) {
        double fa = c*1.8 + 32;
        System.out.println("A temperatura convertida de Celsius para Fahrenheit é: " + fa);
    }

    @Override
    public void fahrenheitParaCelsius(double f) {
        double ce = (f - 32)/1.8;
        System.out.println("A temperatura convertida de Fahrenheit para Celsius é: " + ce);
    }
}
