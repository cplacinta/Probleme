import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Prob24ggg {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti sirul: ");
        String str;
        str = in.nextLine();
        char[] charArray = str.toCharArray();
        Set<Character> set = new HashSet<Character>();
       /* set.add(new Character('a'));
        set.add(new Integer(4));
        set.add(new Integer(5));*/
        Set set2 = new HashSet<Integer>();
        set2.add(new Integer(3));
        set2.add(new Integer(4));
        set2.add(new Integer(5));

        set.retainAll(set2);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        int k = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (charArray[i] == ' ' ) {
                while (charArray[i + 1] == ' ') {
                    k++;
                    charArray[i] = charArray[i + 1];
                    i++;
                }
            }
        }
        for (int i = 0; i < str.length() - k; i++) {
            System.out.print(charArray[i]);
        }
    }
}

