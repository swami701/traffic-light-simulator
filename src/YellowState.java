public class YellowState implements ITrafficLightState {
    @Override
    public void change(TrafficLight trafficLight) {
        trafficLight.setCurrentState(new RedState());
    }
}
