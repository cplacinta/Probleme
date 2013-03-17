import java.io.IOException;
import java.util.Scanner;

public class Prob22 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String[] strArray = new String[3];
        System.out.println("Introduceti sirul: ");
        for (int i = 0; i < 3; i++){
            strArray[i] = in.nextLine();
        }
        System.out.println("Introduceti litera: ");
        char x = in.next().charAt(0);
        System.out.println("Persoanele care se incep cu litera '" + x + "' sunt:");
        for (int i = 0; i < 3; i++){
            if (strArray[i].charAt(0) == x){
                System.out.println(strArray[i]);
            }
        }
    }
}

