package List4;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> L = new ArrayList<>();
        PopulaLista(L);
        ImprimeLista(L);
        System.out.println(EncontraNomeSequencial(L, "Dan"));
        System.out.println(EncontraNomeBinario(L, "Dan"));

        RemoveNome(L, "Dan");
        ImprimeLista(L);

    }
    public static void PopulaLista(ArrayList<String> lista) {
        String n = "";
        Scanner console = new Scanner(System.in);
        System.out.println("Digite nomes para popular o array | 'STOP' para parar");
        while (!n.equalsIgnoreCase("stop")){
            n = console.nextLine();
            if(!n.equalsIgnoreCase("stop")) lista.add(n);
        }
    }

    public static void ImprimeLista(ArrayList<String> lista) {
        for (String a: lista) {
            System.out.println(a);
        }
    }

    public static boolean EncontraNomeSequencial(ArrayList<String> list, String n) {
        for (String a: list) {
            if(a.equalsIgnoreCase(n)) return true;
        }
        return false;
    }

    public static boolean EncontraNomeBinario(ArrayList<String> list, String n) {
        Collections.sort(list);
        int init = 0, middle, end = list.size() -1;
        while (init <= end) {
            middle = (end - init) /2;
            if(n.equalsIgnoreCase(list.get(middle))) {
                return true;
            } else if(n.compareToIgnoreCase(list.get(middle)) > 0) {
                init = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return false;
    }

    public static void RemoveNome(ArrayList<String> list, String n) {
        for (int i = 0; i <= list.size() -1; i++) {
            if(list.get(i).equalsIgnoreCase(n)) list.remove(i);
        }
    }
}
