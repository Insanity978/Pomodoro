import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class Pomodoro {

    public static Pomodoro instance;
    private static TimerCore tC;

    private Pomodoro() {
        tC = new TimerCore();
    }

    public static void main(String[] args) {
        instance = new Pomodoro();
    }

    public static Pomodoro getInstance() {
        if (instance == null) return new Pomodoro();
        else return instance;
    }

}
