package area.perimetro;

public class Quadrado extends Retangulo {
    public Quadrado(float lado) {
        super(lado, lado);
        if (lado <= 0) {
            throw new ArithmeticException("Lado igual ou menor que zero.");
        }
        if (lado != super.calcularPerimetro() / 4) {
            throw new ArithmeticException("Os lados do quadrado devem ser iguais.");
        }
    }
}