package exerciciosC;

public class CContaBancariaContaCorrente extends CContaBancaria {

    public void cobrarTarifaMensal(){
        System.out.println("desconto da tarifa mensal: R$30.00.\nNovo saldo da conta:");
        double desconto =  getSaldo() - 30;
        System.out.println(desconto);
    }
}
