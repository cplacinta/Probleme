import java.io.IOException;
import java.util.Scanner;

public class Prob43ggg {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti sirul: ");
        String str;
        String strAux;
        str = in.nextLine();
        char[] charArray = str.toCharArray();

        if (charArray[0] >= 97) {
            charArray[0] = (char) ((int) charArray[0] - 32);
        }

        for (int i = 1; i < str.length(); i++) {
            if (charArray[i - 1] == ' ') {
                if ((int) charArray[i] >= 97) {
                    charArray[i ] = (char) ((int) charArray[i] - 32);
                    i++;
                }
            }
                for (int j = i; j < str.length(); j++,i++) {
                    if (charArray[j] == '.' || charArray[j] == ' ' || charArray[j - 1] == ' ') {
                        break;
                    } else if ((int) charArray[j] <= 96){
                        charArray[j] = (char) ((int) charArray[j] + 32);
                    }
                }
            }

        for (int i = 0; i < str.length(); i++) {
            System.out.print(charArray[i]);
        }
    }
}

