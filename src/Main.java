
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("How long do you want to study for? Type a number of minutes: ");
        Scanner scanner = new Scanner(System.in);
        int Study_minutes = scanner.nextInt();

        System.out.println("How long should the break be? Type a number of minutes: ");
        int Break_minutes = scanner.nextInt();

        System.out.println("How many times do you want to repeat this? Enter a number: ");
        int sessions = scanner.nextInt();

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}