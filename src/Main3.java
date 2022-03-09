import java.util.Scanner;

public class Main3 {
        public static void main(String[] args) {

            Scanner skanuje = new Scanner(System.in);
            System.out.println("Jak masz na imię?");
            String name = skanuje.nextLine();
            System.out.println("Jak masz na nazwisko? ");
            String lastName = skanuje.nextLine();
            System.out.println("Ile masz lat?");
            int age = skanuje.nextInt();
            if (age>18 && age<29) {
                System.out.println(name + lastName + " Możesz wejść");
            } else if (age >= 30){
                System.out.println(name + lastName + "Jesteś za stary ;)");
            } else {
                System.out.println(name + lastName + "Nie możesz wejść");
            }

        }


}
