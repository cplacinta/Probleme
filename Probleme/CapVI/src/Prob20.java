import java.io.IOException;
import java.util.Scanner;

public class Prob20 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti sirul: ");
        String str;
        str = in.nextLine();
        char[] charArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(charArray[i] + "-");
            if ((int)charArray[i] > 96){
            System.out.println((int)charArray[i] - 96);
            } else{
                System.out.println((int)charArray[i]- 64);
            }

            }
    }
}

