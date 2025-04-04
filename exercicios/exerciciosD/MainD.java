package exerciciosD;

import java.util.Scanner;

public class MainD {
    public static void main(String[] args) {
        //Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o metodo converterDolarParaReal() para converter um valor em dólar para reais.
        // A classe deve receber o valor em dólar como parâmetro.
        DConversorMoeda converte = new DConversorMoeda();
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Diga o valor em dolár: ");
        double dolar = scanner1.nextDouble();
        converte.converterDolarParaReal(dolar);

        //Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular.
        // A classe deve receber altura e largura como parâmetros.
        DCalculadoraSalaRetangular calculadora = new DCalculadoraSalaRetangular();
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Diga a largura: ");
        double largura = scanner2.nextDouble();

        System.out.println("Diga a altura: ");
        double altura = scanner2.nextDouble();

        double area = calculadora.calcularArea(altura, largura);
        double perimetro = calculadora.calcularPerimetro(altura, largura);

        System.out.println("A area é: " + area + "\nO perímetro é: " + perimetro);

        //Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o metodo mostrarTabuada() para exibir a tabuada de um número.
        // A classe deve receber o número como parâmetro.
        DTabelaMultiplicacaoTabuada tabuada = new DTabelaMultiplicacao();
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Diga um número: ");
        double numero = scanner3.nextDouble();

        tabuada.mostrarTabuada(numero);

        //Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
        // Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
        DTemperaturaPadrao temperatura = new DTemperaturaPadrao();
        Scanner scanner4 = Scanner(System.in);

        System.out.println("Temperatura em C ou em F?");
        String temp = scanner4.nextLine();
        System.out.println("Diga a temperatura: ");

        if (temp.equalsIgnoreCase("c")){
            double tempC = scanner4.nextDouble();
            temperatura.celsiusParaFahrenheit(tempC);
        } else if (temp.equalsIgnoreCase("f")){
            double tempF = scanner4.nextDouble();
            temperatura.fahrenheitParaCelsius(tempF);
        } else{
            System.out.println("Valor inserido não valido");
        }



    }
}
