import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimerCore {

    private Scanner userInput;
    private Timer studyTimer, breakTimer;
    private TimerTask studytask, breakTask;
    private int studyMinutes, breakMinutes, sessions;

    // Default constructor
    TimerCore() {
        sessionPrompts();
        // need to add completed session counter
        startStudy();
    };

    /**
     * Prompts user for Pomodoro preferences
     */
    public void sessionPrompts() {
        userInput = new Scanner(System.in);
        System.out.print("How long do you want to study for? Type a number of minutes: ");
        studyMinutes = userInput.nextInt();

        System.out.print("How long should the break be? Type a number of minutes: ");
        breakMinutes = userInput.nextInt();

        System.out.print("How many times do you want to repeat this? Enter a number: ");
        sessions = userInput.nextInt();

        userInput.close();
    }

    public void startStudy() {
        studyTimer = new Timer();
        // tasks run on a seperate thread. This causes problems if there are actions outside
        // and after running Timer#schedule()
        studytask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Study period is over!");
                System.out.println("Time for break, x amount of sessions remain!");
                System.out.println("Start break timer now? (Y/n)");
            }
        };

        // runs (task, amountOfMiliseconds)
        studyTimer.schedule(studytask, 1000 * 60 * studyMinutes);
    }
    
    /**
     * Prints out fields for debugging purposes
     */
    public void print() {
        System.out.println(studyMinutes + " " + breakMinutes + " " + sessions);
    }
}
