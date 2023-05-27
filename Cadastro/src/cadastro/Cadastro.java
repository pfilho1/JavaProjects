package cadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro
{

    public static void main(String[] args) {
        //ArrayList da Atv verificadora 4
        ArrayList<Midia> midias = new ArrayList<Midia>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Inserir CD");
            System.out.println("2. Inserir DVD");
            System.out.println("3. Listar mídias");
            System.out.println("4. Sair");

            int opcao = in.nextInt();
            in.nextLine(); // consumir a quebra de linha

            if (opcao == 1) {
                CD cd = new CD();
                cd.inserirDados();
                midias.add(cd);
                System.out.println("CD inserido.");
            } else if (opcao == 2) {
                DVD dvd = new DVD();
                dvd.inserirDados();
                midias.add(dvd);
                System.out.println("DVD inserido.");
            } else if (opcao == 3) {
                if (midias.size() == 0) {
                    System.out.println("Nenhuma mídia cadastrada.");
                } else {
                    for (Midia midia : midias) {
                        midia.printDados();
                    }
                }
            } else if (opcao == 4) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
            System.out.println();
        }

        in.close();
    }

}
    