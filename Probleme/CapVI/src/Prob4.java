import java.io.IOException;
import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti sirul: ");
        String str;
        int k = 0;
        str = in.nextLine();
        char x = in.next().charAt(0);
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == x) {
                k++;
                break;
            }
        }
        if (k != 0){
            System.out.println("Da");
        } else{
            System.out.println("Nu");
        }




    }
}

