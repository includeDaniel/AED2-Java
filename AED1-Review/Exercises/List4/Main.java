package List4;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teste= new ArrayList<>();
        PopulaLista(teste);
        System.out.println(teste);

    }
    public static void PopulaLista(ArrayList<String> Lista) {
        String n;
        Scanner console = new Scanner(System.in);
        System.out.println("Digite nomes para popular o array | 'STOP' para parar");
        do {
            n = console.nextLine();
            Lista.add(n);
        } while (!n.equalsIgnoreCase("stop"));
    }
}
