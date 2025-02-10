import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int studyMinutes, breakMinutes, sessions;

        System.out.print("How long do you want to study for? Type a number of minutes: ");
        studyMinutes = userInput.nextInt();

        System.out.print("How long should the break be? Type a number of minutes: ");
        breakMinutes = userInput.nextInt();

        System.out.print("How many times do you want to repeat this? Enter a number: ");
        sessions = userInput.nextInt();

        System.out.println(studyMinutes + " " + breakMinutes + " " + sessions);
    }
}
