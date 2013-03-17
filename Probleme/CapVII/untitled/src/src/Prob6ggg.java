import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Prob6ggg {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti setul A: ");
        String str = in.nextLine();

        char[] charArray = str.toCharArray();
        Set<Character> ss = new LinkedHashSet<Character>();
        ss.add('u');
        ss.add('o');
        ss.add('i');
        ss.add('e');
        ss.add('a');

        Set<Character> ss2 = new LinkedHashSet<Character>();
        for (int i = 0; i < str.length() ; i++) {
            ss2.add(charArray[i]);
        }

        ss.retainAll(ss2);

        int k = 0;
        Iterator iterator = ss.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            k++;
        }
        System.out.println("Cuvintul " + str + " contine " + k + " vocale");
    }
}
