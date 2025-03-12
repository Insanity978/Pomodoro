import java.util.Scanner;

public class TimerCore {

    private Scanner userInput;
    private int studyMinutes, breakMinutes, sessions;
    private boolean studyFinished = false;
    private long studyStartTime, studyEndTime;
    private long breakStartTime, breakEndTime;
    private boolean breakFinished;

    // Default constructor
    TimerCore() {
        studySessionPrompts();
        breakSessionPrompts();
        // need to add completed session counter
        for(int i = 0; i < sessions; i++){
            startStudy();
            System.out.println("Break time starts now");
            startBreak();
        }

    };

    /**
     * Prompts user for Pomodoro preferences
     */
    public void studySessionPrompts() {
        userInput = new Scanner(System.in);
        System.out.print("How long do you want to study for? Type a number of minutes: ");
        studyMinutes = userInput.nextInt();

        System.out.print("How many times do you want to repeat this? Enter a number: ");
        sessions = userInput.nextInt();

        //userInput.close();
    }

    public void breakSessionPrompts(){
        userInput = new Scanner(System.in);
        System.out.println("How long do you want to take a break for? Enter a number: ");
        breakMinutes = userInput.nextInt();

        userInput.close();
    }

    public void startStudy() {
        // use a while loop that checks system time for time 
        // tracking. Maybe come back to this with TimerTask and Timer
        // when learnt more about managing threads? 
        studyStartTime = System.currentTimeMillis();
        studyEndTime = studyStartTime + studyMinutes * 1000 * 60;
         
        while (!studyFinished) {
            // update the clock
            if (System.currentTimeMillis() >= studyEndTime) studyFinished = true;
        }
        System.out.println("finished study time!");

    }

    public void startBreak() {
        breakStartTime = System.currentTimeMillis(); //Starts when prompt ends @breakSessionPrompts
        breakEndTime = breakStartTime + breakMinutes * 1000 * 60;

        while(!breakFinished){
            if(System.currentTimeMillis() >= breakEndTime) {
                breakFinished = true;
            }
        }
        System.out.println("finished break time!");
    }
    
    /**
     * Prints out fields for debugging purposes
     */
    public void print() {
        System.out.println(studyMinutes + " " + breakMinutes + " " + sessions);
    }
}
