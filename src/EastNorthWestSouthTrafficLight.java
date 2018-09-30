public class EastNorthWestSouthTrafficLight extends TrafficLight {
    @Override
    public void change() {
        currentState.change(this);
    }
}
