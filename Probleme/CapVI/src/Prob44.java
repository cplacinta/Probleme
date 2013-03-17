import java.io.IOException;
import java.util.Scanner;

public class Prob44 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti sirul: ");
        String str;
        String strAux;
        str = in.nextLine();
        char[] charArray = str.toCharArray();

        int numParantOppened = 0;
        int numParantClosed = 0;
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == '(') {
                numParantOppened++;
            } else if (charArray[i] == ')') {
                numParantClosed++;
            }
        }

        System.out.println("Numarul parantezilor deschise: " + numParantOppened);
        System.out.println("Numarul parantezilor inchise: " + numParantClosed);
        System.out.print(numParantClosed != numParantOppened ? "Numarul parantezilor deschise nu coincide cu numarul parantezilor inchise!"
                : "Numarul parantezilor deschise coincide cu numarul parantezilor inchise!");



    }
}

