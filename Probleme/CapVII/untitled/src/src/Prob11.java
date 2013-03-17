import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prob11 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente a setului A(Integer!): ");
        Integer n = in.nextInt();
        Set<Integer> a = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }

        System.out.println("Introduceti un numar: ");
        Integer aux = in.nextInt();

        System.out.println(a.contains(aux) ? "Setul A contine numarul " + aux : "Setul A nu contine numarul " + aux);
    }
}