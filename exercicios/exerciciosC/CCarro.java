package exerciciosC;

public class CCarro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }
    public void maiorEMenorPreco(){
        double maior = precoAno1;
        double menor = precoAno1;

        if (maior < precoAno2){
            maior = precoAno2;
        }
        if (maior < precoAno3){
            maior = precoAno3;
        }
        if(menor > precoAno2){
            menor = precoAno2;
        }
        if (menor > precoAno3){
            menor = precoAno3;
        }

        if(maior == precoAno1){
            System.out.println("O maior preço foi no primeiro ano no valor de: " + precoAno1);
        } else if (maior == precoAno2){
            System.out.println("O maior preço foi no segundo ano no valor de: " + precoAno2);
        } else {
            System.out.println("O maior preço foi no terceiro ano no valor de: " + precoAno3);
        }

        if (menor == precoAno1){
            System.out.println("O menor preço foi no primeiro ano no valor de: " + precoAno1);
        } else if (menor == precoAno2){
            System.out.println("O menor preço foi no segundo ano no valor de: " + precoAno2);
        }else {
            System.out.println("O menor preço foi no terceiro ano no valor de: " + precoAno3);
        }
    }
}
