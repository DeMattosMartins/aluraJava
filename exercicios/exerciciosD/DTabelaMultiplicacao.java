package exerciciosD;

public class DTabelaMultiplicacao implements DTabelaMultiplicacaoTabuada{
    @Override
    public void mostrarTabuada(double numero) {
        for(int i = 1; i <= 10; i++){
            double resultado = numero*i;
            System.out.println("O numero: " + numero + " vezes o numero: " + i + " tem como resultado: " + resultado);
        }
    }
}
