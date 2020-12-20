package parkingLot;

import java.util.ArrayList;

public class ParkingLot {
    private final int capacity;
    private final ArrayList<Integer> slots;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.slots = new ArrayList<>(capacity);
    }

    public boolean parkCar(int carId) {
        if (this.isFull()) return false;
        return this.slots.add(carId);
    }

    public boolean isFull() {
        return this.capacity == this.slots.size();
    }
}
