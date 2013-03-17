import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti setul A: ");
        String str = in.nextLine();
        String str2 = null;

        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();

        int k = 0;
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'u'|| charArray[i] == 'i' || charArray[i] == 'o') {
                k++;
                charArray2[j] = charArray[i];
                j++;
            }
        }
        boolean flag = true;
        char temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < str2.length() - 1; i++) {
                if ((int) (charArray2[i]) > (int) (charArray2[i + 1])) {
                    {
                        temp = charArray2[i];
                        charArray[i] = charArray2[i + 1];
                        charArray2[i + 1] = temp;
                        flag = true;
                    }
                }
            }
        }

        LinkedHashSet ss = new LinkedHashSet();
        Iterator iterator = ss.iterator();

        for (int i = 0; i < str2.length(); i++) {
            ss.add(charArray2[i]);
            System.out.println(iterator.next());
        }
        System.out.println("Cuvintul " + str + " contine " + k + " vocale");
    }
}