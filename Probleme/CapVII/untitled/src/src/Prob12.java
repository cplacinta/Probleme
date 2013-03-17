import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prob12 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti setul A: ");
        String str = in.nextLine();
        System.out.println("Introduceti setul B: ");
        String str2 = in.nextLine();
        Set<Character> a = new HashSet<Character>();
        Set<Character> b = new HashSet<Character>();

        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            a.add(charArray[i]);
        }
        for (int i = 0; i < str2.length(); i++) {
            b.add(charArray2[i]);
        }

        System.out.println(a.equals(b) ? "Setul A si B contin aceleasi caractere" : "Setul A si B nu contin aceleasi caractere");



    }
}