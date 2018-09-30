public class NorthWestSouthEastTrafficLight extends TrafficLight {
    @Override
    public void change() {
        currentState.change(this);
    }
}
