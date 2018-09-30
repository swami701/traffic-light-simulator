public class GreenState implements ITrafficLightState {
    @Override
    public void change(TrafficLight trafficLight) {
        trafficLight.setCurrentState(new YellowState());
    }
}
