public class EastWestTrafficLight extends TrafficLight {
    @Override
    public void change() {
        currentState.change(this);
    }
}
