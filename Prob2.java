import java.io.IOException;
import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numarul de elevi: ");
        Integer n = in.nextInt();
        Elev[] elevi = new Elev[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti numele elevului: ");
            String firstName = in.next();
            System.out.println("Introduceti prenumele elevului: ");
            String lastName = in.next();
            System.out.println("Introduceti anul de nastere a elevului: ");
            int year = in.nextInt();
            System.out.println("Introduceti luna de nastere a elevului: ");
            int month = in.nextInt();
            System.out.println("Introduceti ziua de nastere a elevului: ");
            int day = in.nextInt();
            elevi[i] = new Elev(i, firstName, lastName, year, month, day);

        }

        for (int i = 0; i < n; i++) {
            if (elevi[i].getMonth() == 2 && elevi[i].getFirstName().startsWith("A")) {
                System.out.println(elevi[i]);

            }
        }
    }
}

class Elev {
    private int id;
    private String firstName;
    private String lastName;
    private int year;
    private int month;
    private int day;

    public Elev(int id, String firstName, String lastName, int year, int month, int day) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getMonth() {
        return month;
    }

    public String toString() {
        return id + ": " + firstName + " " + lastName + ", " + day + "." + month + "." + year;
    }
}