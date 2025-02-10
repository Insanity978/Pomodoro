import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimerCore {

    private Timer studyTimer, breakTimer;
    private TimerTask studytask, breakTask;
    private int studyMinutes, breakMinutes, sessions;

    // Default constructor
    TimerCore() {
        sessionPrompts();
        startStudy();
    };

    /**
     * Prompts user for Pomodoro preferences
     */
    public void sessionPrompts() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("How long do you want to study for? Type a number of minutes: ");
        studyMinutes = userInput.nextInt();

        System.out.print("How long should the break be? Type a number of minutes: ");
        breakMinutes = userInput.nextInt();

        System.out.print("How many times do you want to repeat this? Enter a number: ");
        sessions = userInput.nextInt();
    }

    public void startStudy() {
        studyTimer = new Timer();
        studytask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("its over!");
            }
        };

        // runs after 5 seconds
        studyTimer.schedule(studytask, 5000);
    }

    public void print() {
        System.out.println(studyMinutes + " " + breakMinutes + " " + sessions);
    }
}
