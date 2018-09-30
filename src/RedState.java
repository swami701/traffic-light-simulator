public class RedState implements ITrafficLightState {
    @Override
    public void change(TrafficLight trafficLight) {
        trafficLight.setCurrentState(new GreenState());
    }
}
