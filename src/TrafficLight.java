public class TrafficLight {
    protected ITrafficLightState currentState;

    public void change() {
        currentState.change(this);
    }

    public ITrafficLightState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ITrafficLightState currentState) {
        this.currentState = currentState;
        System.out.println(this.getClass().getSimpleName() + " ==> " + currentState.getClass().getSimpleName());
    }
}
