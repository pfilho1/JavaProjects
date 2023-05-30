package area.perimetro;

public class Retangulo extends Quadrilatero {
    float lado;
    private float altura;
    
    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }
    
    @Override
    public float calcularArea() {
        if (lado <= 0 || altura <= 0) {
            throw new ArithmeticException("Lado ou altura com valor inválido. Digite um valor acima de 0.");
        }
        return lado * altura;
    }
    
    @Override
    public float calcularPerimetro() {
        if (lado <= 0 || altura <= 0) {
            throw new ArithmeticException("Lado ou altura com valor inválido. Digite um valor acima de 0.");
        }
        return 2 * (lado + altura);
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}