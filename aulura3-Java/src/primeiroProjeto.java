import java.util.Scanner;

public class primeiroProjeto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
//        Dados cliente;
          String nome = "Mateus de Mattos";
          String conta = "Corrente";
        double saldo = 2500.00;

//Printar as opções possiveis;
        String mensagemInicial= """
               Digite o número da operação a que deseja:
               
               1- Consultar saldo.
               2- Receber valor.
               3- Transferir valo.
               4- Sair.
               
               """;

        System.out.println("Nome do cliente: " + nome + "\nTipo de conta: " + conta + "\n");
        System.out.println(mensagemInicial);
        int opcao = ler.nextInt();

//estrutura de repetição até o cliente desejar sair.
        while (opcao != 4) {
        //opção de apenas consultar saldo
            if (opcao == 1) {
                System.out.println("O seu saldo atual é: " + saldo + "\n");
            }
        //opção de receber um valor no saldo;
            else if (opcao == 2) {
                System.out.println("Quanto irá receber?");
                double receber = ler.nextDouble();
                saldo += receber;
                System.out.println("Saldo atual: " + saldo + "\n");
            }
        //opção de transferir um valor do saldo.
            else if(opcao == 3) {
                System.out.println("Quanto deseja transferir?");
                double transferir = ler.nextDouble();

                //verificar se a transferência é possivel.
                if (transferir < saldo) {
                    saldo -= transferir;
                    System.out.println("Seu saldo atual é: " + saldo + "\n");
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            }
        //caso não tenha sido digitado uma opção valida.
            else {
                System.out.println("Opção invalidada.\n ");
            }

        //printar novamente as opções possiveis;
            System.out.println(mensagemInicial);
            opcao = ler.nextInt();
        }
        System.out.println("Obrigado! Volte sempre!");
    }

}
