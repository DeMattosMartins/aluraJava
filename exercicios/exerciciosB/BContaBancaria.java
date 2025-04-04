package exerciciosB;

import java.util.Scanner;

public class BContaBancaria {
    Scanner scanner = new Scanner(System.in);

    private int numeroConta = 1433;
    private double saldo = 2000;
    public String titular = "Mateus de Mattos";

    public double getSaldo() {
        return saldo;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void movimentacao(int n){
        if(n == 1){
            System.out.println("Quanto desaja depositar?");
            double deposito = scanner.nextDouble();
            if (deposito > 0){
                saldo += deposito;
                System.out.println("Seu novo saldo é de: " + saldo);
            } else {
                System.out.println("Número inválido.");
            }
        } else if (n == 2){
            System.out.println("Quanto deseja sacar?");
            double saque = scanner.nextDouble();
            if (saque < saldo && saque > 0){
                saldo -= saque;
                System.out.println("Seu novo saldo é de: " + saldo);
            } else if (saque > saldo){
                System.out.println("Saldo insuficiente.");
            } else {
                System.out.println("Valor inválido.");
            }
        }
    }
}
