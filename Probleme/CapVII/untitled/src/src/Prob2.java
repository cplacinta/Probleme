import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Prob2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti setul A: ");
        String str;
        str = in.nextLine();
        System.out.println("Introduceti setul B: ");
        String str2;
        str2 = in.nextLine();

        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Set<Character> a = new HashSet<Character>();
        Set<Character> b = new HashSet<Character>();

        for (int i = 0; i < str.length(); i++) {
            a.add(charArray[i]);
        }

        for (int i = 0; i < str2.length(); i++) {
            b.add(charArray2[i]);
        }

        System.out.println(b.containsAll(a) ? "Setul A este un subset al setului B!" : "Setul A nu este un subset al " +
                "" +
                "setului B!");


        Iterator iterator = a.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}