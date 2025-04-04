package exerciciosC;

import java.util.Scanner;

public class CContaBancaria {
    Scanner scanner = new Scanner(System.in);
    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacarOuDepositar (){
        while(true){
            System.out.println("""
                        \n
                        Selecione o número da opção que deseja:
                        1-Ver saldo.
                        2-Movimentação.
                        3-Sair.
                        """);
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println(saldo);
            }
            //realiza a movimentação: saque ou deposito
            else if (opcao == 2) {
                //verifica qual movimentacao deve ser feita
                System.out.println("""
                            \n
                            Qual movimentação gostaria de realizar?
                            1-Deposito.
                            2-Saque.
                            """);
                int mov2 = scanner.nextInt();
                if(mov2 == 1){
                    System.out.println("Quanto gostaria de depositar?");
                    double deposito = scanner.nextDouble();
                    if(deposito > 0){
                        saldo += deposito;
                    } else {
                        System.out.println("Valor não valido");
                    }
                } else{
                    System.out.println("Quanto gostaria de sacar?");
                    double saque = scanner.nextDouble();
                    if(saque <= saldo){
                        saldo -= saque;
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                }
            }
            //encerra a repetição e o exercicio
            else if (opcao == 3) {
                System.out.println("Obrigado! Volte sempre\n");
                break;
            }
            //caso a opção digitada não seja valida
            else {
                System.out.println("Opção inválida.\n");
            }
        }
    }
}



