import java.io.IOException;
import java.util.Scanner;

public class Prob38 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti sirul: ");
        String str;
        str = in.nextLine();
        char[] charArray = str.toCharArray();

        boolean flag = true;
        char temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < str.length() - 1; i++) {
                if ((int) (charArray[i]) > (int) (charArray[i + 1])) {
                    {
                        temp = charArray[i];
                        charArray[i] = charArray[i + 1];
                        charArray[i + 1] = temp;
                        flag = true;
                    }
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(charArray[i]);
        }
    }
}

