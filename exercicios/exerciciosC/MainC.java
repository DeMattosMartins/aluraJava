package exerciciosC;

import java.util.Scanner;

public class MainC {
    public static void main(String[] args) {
//    Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
//    Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
//    Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

        Scanner scanner1 = new Scanner(System.in);
        CCarroModeloCarro modeloCarro = new CCarroModeloCarro();

        System.out.println("Diga o modelo do carro: ");
        String carro = scanner1.nextLine();
        modeloCarro.setModelo(carro);

        System.out.println("Diga o valor do primeiro ano: ");
        double ano1 = scanner1.nextDouble();
        modeloCarro.setPrecoAno1(ano1);

        System.out.println("Diga o valor do segundo ano: ");
        double ano2 = scanner1.nextDouble();
        modeloCarro.setPrecoAno2(ano2);

        System.out.println("Diga o valor do terceiro ano: ");
        double ano3 = scanner1.nextDouble();
        modeloCarro.setPrecoAno3(ano3);

        modeloCarro.informacao();
        modeloCarro.maiorEMenorPreco();

//Crie uma classe Animal com um metodo emitirSom().
// Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal.
// Adicione o metodo emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o metodo.
//  Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
        Scanner scanner2 = new Scanner(System.in);
        CAnimalCachorro cachorro = new CAnimalCachorro();
        CAnimalGato gato = new CAnimalGato();

        System.out.println("Qual animal gostaria de ver?(gato ou cachorro)");
        String animal = scanner2.nextLine();
        if(animal.equals("cachorro")){
            cachorro.emitirSom();
            cachorro.abanarRabo();
        } else if (animal.equals("gato")){
            gato.emitirSom();
            gato.gatoFeliz();
        } else {
            System.out.println("Não foi inserido um animal valido");
        }
//        Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo().
//        Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
//        Adicione um metodo específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
        CContaBancariaContaCorrente conta = new CContaBancariaContaCorrente();

        conta.sacarOuDepositar();
        conta.cobrarTarifaMensal();

//Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos().
// Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.
    }
}

