import java.util.Timer;
import java.util.TimerTask;

public class TrafficController {
    private int sec;
    private int cycle;
    private TrafficLight eastWest, northSouth, northWestSouthEast, eastNorthWestSouth;

    public TrafficController() {
        eastWest = new EastWestTrafficLight();
        northSouth = new NorthSouthTrafficLight();
        northWestSouthEast = new NorthWestSouthEastTrafficLight();
        eastNorthWestSouth = new EastNorthWestSouthTrafficLight();
    }

    public void simulateTrafficSignal() {
        // Set up initial state
        setUpIntialState();

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                sec++;
                System.out.println(sec + " second(s)");

                // Going Straight - Change to Green to Yellow
                if (sec == ApplicationConstants.GREEN_DURATION) {
                    if (northSouth.getCurrentState().getClass().getSimpleName().equals("GreenState")) {
                        northSouth.change();
                    } else {
                        eastWest.change();
                    }
                }

                // Going Straight - Change to Yellow to Red
                if (sec == (ApplicationConstants.GREEN_DURATION + ApplicationConstants.YELLOW_DURATION)) {
                    if (northSouth.getCurrentState().getClass().getSimpleName().equals("YellowState")) {
                        northSouth.change();
                    } else {
                        eastWest.change();
                    }
                }

                // Turn Right --- Change Green to Yellow
                if (sec == ApplicationConstants.TURN_RIGHT_GREEN_DURATION) {
                    if (northWestSouthEast.getCurrentState().getClass().getSimpleName().equals("GreenState")) {
                        northWestSouthEast.change();
                    } else {
                        eastNorthWestSouth.change();
                    }
                }

                // Turn Right --- Change Yellow to Red & RESET the Cycle
                if (sec == (ApplicationConstants.TURN_RIGHT_GREEN_DURATION + ApplicationConstants.YELLOW_DURATION)) { // Change to Red
                    if (northWestSouthEast.getCurrentState().getClass().getSimpleName().equals("YellowState")) {
                        eastWest.change();
                    } else {
                        northSouth.change();
                    }
                    eastNorthWestSouth.change();
                    northWestSouthEast.change();
                    sec = 0;
                    cycle++;
                    System.out.println("Completed " + cycle + " cycle!");
                }

                checkForTermination(this, timer);
            }
        };
        timer.schedule(timerTask, 0, 1000);
    }

    private void checkForTermination(TimerTask timerTask, Timer timer) {
        if (cycle >= ApplicationConstants.END_AFTER_CYCLE) {
            System.out.println();
            System.out.println("=================");
            System.out.println("Stopping Simulation after " + cycle + " cycle(s)!");
            System.out.println("=================");
            timerTask.cancel();
            timer.cancel();
            timer.purge();
        }
    }

    private void setUpIntialState() {
        System.out.println("=================");
        System.out.println("Initial state");
        // Setting Green
        northSouth.setCurrentState(new GreenState());
        northWestSouthEast.setCurrentState(new GreenState());

        // Setting Red
        eastWest.setCurrentState(new RedState());
        eastNorthWestSouth.setCurrentState(new RedState());
        System.out.println("=================");
        System.out.println();
        System.out.println();
    }
}
