package List11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> Nome =  new ArrayList<>();
    static ArrayList<String> Telefone =  new ArrayList<>();
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        int pos = 0;

        while(pos != 6) {
            System.out.println("-----------------Menu-----------------");
            System.out.println("1- Cadastrar novo nome/telefone");
            System.out.println("2- Exibir lista de contatos; ");
            System.out.println("3-  Busca por nome");
            System.out.println("4- Remoção de contato");
            System.out.println("5- Atualizar arquivo txt");
            System.out.println("6- Sair do programa");
            System.out.println("-----------------Menu-----------------");
            pos = teclado.nextInt();

            switch (pos) {
                case 1 -> {
                    Cadastrar();
                }
                case 2 -> {
                    Exibir();
                }
                case 3 -> {
                    BuscarNome();
                }
                case 4 -> {
                    Remover();
                }
                case 5 -> {
                    AtualizarTxt();
                }
                case 6 -> {
                    System.out.println("Encerrado!");
                }
            }
        }
    }

    public static void Cadastrar() {
        String nomeTemp, telefoneTemp;
        System.out.print("Digite o nome: ");
        nomeTemp = teclado.nextLine();
        System.out.print("\n Digite o telefone: ");
        telefoneTemp = teclado.nextLine();

        Nome.add(nomeTemp);
        Telefone.add(telefoneTemp);
    }

    public static void Exibir() {
        for(int i = 0; i < Nome.size(); i++) {
            System.out.print("\n Nome: " + Nome.get(i));
            System.out.print(", Telefone: " + Telefone.get(i));
        }
    }

    public static int BuscarNome() {
        String name;
        name = teclado.nextLine();
        for(int i = 0; i < Nome.size(); i++) {
            if(Nome.get(i).equalsIgnoreCase(name)) {
                System.out.println("Nome: " + Nome.get(i));
                System.out.println("Telefone: " + Telefone.get(i));
                return i;
            }

        }
        System.out.println("Contato não encontrado");
        return -1;
    }

    public static void Remover() {
        int index = BuscarNome();
        if(index >= 0) {
            Nome.remove(index);
            Telefone.remove(index);
        }
    }

    public static void AtualizarTxt() {

    }
}
