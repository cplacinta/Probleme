import java.util.Scanner;

public class Prob2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str;
        int k = 0;
        str = in.nextLine();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'u'
                    || charArray[i] == 'i' || charArray[i] == 'o')
                k++;
        }

        System.out.println(str);
        System.out.println("Numarul vocalelor din sirul dat este: " + k);

    }
}

