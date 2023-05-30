package area.perimetro;

import java.util.ArrayList;

public class AreaPerimetro {
    public static void main(String[] args) {
        ArrayList<Quadrilatero> quadrilateros = new ArrayList<>();

        Retangulo retangulo = new Retangulo(4, 5);
        quadrilateros.add(retangulo);

        Circulo circulo = new Circulo(3);
        quadrilateros.add(circulo);

        Quadrado quadrado = new Quadrado(1);
        quadrilateros.add(quadrado);

        for (Quadrilatero q : quadrilateros) {
            try {
                System.out.println("Area: " + q.calcularArea());
                System.out.println("Perimetro: " + q.calcularPerimetro());
                System.out.println("");
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        Circulo[] circulos = new Circulo[3];
        circulos[0] = new Circulo(2);
        circulos[1] = new Circulo(4);
        circulos[2] = new Circulo(6);

        for (Circulo c : circulos) {
            try {
                System.out.println("Area do circulo: " + c.calcularArea());
                System.out.println("Perimetro do circulo: " + c.calcularPerimetro());
                System.out.println("");
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}



