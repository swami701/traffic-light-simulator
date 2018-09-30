import java.util.Timer;
import java.util.TimerTask;

public class TrafficController {
    private static final int END_AFTER_MINS = 1;
    private static final int YELLOW_DURATION = 3;
    private static final int GOING_STRAIGHT_DURATION = 57;
    private static final int GOING_RIGHT_DURATION = 67;
    private int sec;
    private int min;

    public void simulateTrafficSignal() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println(sec++ + 1 + " sec");
                if (sec % 60 == 0) {
                    min++;
                    System.out.println(min + " minute(s)");
                }

                //
                if (min >= END_AFTER_MINS) {
                    System.out.println("Stopping Simulation after " + min + " minutes!");
                    cancel();
                }
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 0, 1000);
    }
}
