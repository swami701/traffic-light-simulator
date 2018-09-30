public class NorthSouthTrafficLight extends TrafficLight {
    @Override
    public void change() {
        currentState.change(this);
    }
}
