import java.io.IOException;
import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti sirul: ");
        String str;
        str = in.nextLine();
        char[] charArray = str.toCharArray();
        for (int i = str.length() - 1; i > -1; i--) {
            System.out.print(charArray[i]);
        }

    }
}

