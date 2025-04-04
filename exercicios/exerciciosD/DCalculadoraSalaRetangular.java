package exerciciosD;

public class DCalculadoraSalaRetangular implements DCalculadoraSalaRetangularCalculoGeometrico{
    @Override
    public double calcularArea(double altura, double largura) {
        return altura*largura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        return altura + altura + largura + largura;
    }
}
