import java.util.Scanner;

public class Prob2a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str;
        int k =0;
        str = in.nextLine();
        char[] charArray = str.toCharArray();
        for (int i=0; i < str.length(); i++) {
            if (charArray[i] == 'a' || charArray[i] == 'b')
            k++;
        }

        System.out.println(str);
        System.out.println("Numarul sumar a aparitiei a caracterelor 'a' si 'b' este de: " + k);

    }
}

