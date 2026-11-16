import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz imię i nazwisko");
        String name = scanner.nextLine();
        System.out.println("Podaj wiek");
        int age = scanner.nextint();
        System.out.println("Witaj " + name + ". Za " + (18 - age) + "lata będe miał 18 lat!");


        }
    }
