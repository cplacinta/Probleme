import java.io.IOException;
import java.util.Scanner;

public class Prob36ggg {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti sirul: ");
        String str;
        String strAux;
        str = in.nextLine();
        strAux = null ;
        char[] charArray = str.toCharArray();
        char[] charArrayAux = strAux.toCharArray();

        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == ' ' ) {
                charArrayAux[j] = charArray[i+1];
                j++;
            }
        }
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int k =i + 1; k < str.length(); k++){
                if (charArrayAux[i]  == charArrayAux[k]){
                    counter++;


                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(charArray[i]);
        }
    }
}

