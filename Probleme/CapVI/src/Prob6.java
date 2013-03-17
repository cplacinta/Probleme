import java.io.IOException;
import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti sirul: ");
        String str;
        int k = 0;
        str = in.nextLine();
        char[] charArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                k++;
            }
        }

        System.out.println("Propozita contine " + (k + 1) + " cuvinte!");
    }
}

