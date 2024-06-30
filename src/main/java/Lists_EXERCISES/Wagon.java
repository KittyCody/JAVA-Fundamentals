package Lists_EXERCISES;

public class Wagon {
    private int number;
    private int capacity;
    private int currentPassengers = 0;

    public Wagon(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void addPassengers(int count) {
        this.currentPassengers += count;
    }
}
