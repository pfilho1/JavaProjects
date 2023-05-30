package area.perimetro;

public class Circulo extends Quadrilatero {
    private float raio;
    
    public Circulo(float raio) {
        this.raio = raio;
    }
    
    @Override
    public float calcularArea() {
        if (raio <= 0) {
            throw new ArithmeticException("Raio com valor inválido! Digite um valor acima de 0.");
        }
        return (float) (Math.PI * raio * raio);
    }
    
    @Override
    public float calcularPerimetro() {
        if (raio <= 0) {
            throw new ArithmeticException("Raio com valor inválido! Digite um valor acima de 0.");
        }
        return (float) (2 * Math.PI * raio);
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
}
