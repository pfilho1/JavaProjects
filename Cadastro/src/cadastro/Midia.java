package cadastro;

import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public void setCodigo(int codigo) { 
        this.codigo = codigo; 
    }

    public void setPreco(double preco) { 
        this.preco = preco; 
    }

    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public int getCodigo() { 
        return codigo; 
    }

    public double getPreco() { 
        return preco; 
    }

    public String getNome() { 
        return nome; 
    }

    public Midia() {   
        this(0, 0.0, "Nenhum");
    }

    public Midia(int codigo, double preco, String nome) {
        setCodigo(codigo);
        setPreco(preco);
        setNome(nome);
    }

    public String getTipo() {     
        return "Midia: ";
    }

    public String getDetalhes() {
        return "Codigo: " + getCodigo() + "\n" +
               "Preco: " + getPreco() + "\n" +
               "Nome: " + getNome() + "\n";
    }

    public void printDados() {
        String s = getTipo() + "\n" + getDetalhes() + "\n";
        System.out.println(s);
    }

    public void inserirDados() {
        Scanner in = new Scanner(System.in);

        System.out.printf("\n Entre com o codigo: ");
        int cod = in.nextInt();
        System.out.printf("\n Entre com o preco: ");
        double pre = in.nextDouble();
        in.nextLine();
        System.out.printf("\n Entre com o nome: ");
        String nom = in.nextLine();

        setCodigo(cod);
        setPreco(pre);
        setNome(nom);
    }
} 
