
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner skanuje = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name = skanuje.nextLine();
        System.out.println("Jak masz na nazwisko?");
        String lastName = skanuje.nextLine();
        System.out.println("Cześć "+ name + lastName);
    }
}
