import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Prob15 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti un cuvint: ");
        String str = in.nextLine();
        Set<Character> a = new HashSet<Character>();
        char[] charArray = str.toCharArray();
        str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            a.add(charArray[i]);
        }

        int k =0;
        Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            k++;
        }
        System.out.println("In cuvintul " + str + " sunt " + k + " litere distincte");
    }
}