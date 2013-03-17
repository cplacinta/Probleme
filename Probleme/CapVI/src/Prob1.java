import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str;
        int k =0;
        str = in.nextLine();
        str.toCharArray();
        for (int i=0; i < str.length(); i++) {
            k++;
        }

        System.out.println(str);
        System.out.println("Lungimea este de: " + k);

    }
}

