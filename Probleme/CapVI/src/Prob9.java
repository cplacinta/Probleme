import java.io.IOException;
import java.util.Scanner;

public class Prob9 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti sirul: ");
        String str;
        str = in.nextLine();

        boolean strCompare = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                strCompare = false;
                break;
            }
        }

        if (!strCompare) {
            System.out.println("Cuvintul dat nu e palindrom");
        } else {
            System.out.println("Cuvintul dat este un palindrom");
        }
    }
}

