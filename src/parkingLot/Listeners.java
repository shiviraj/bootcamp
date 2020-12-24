package parkingLot;

import java.util.HashSet;

public class Listeners {
    private final HashSet<ParkingLotListener> listeners = new HashSet<>();

    public void add(ParkingLotListener listener) {
        this.listeners.add(listener);
    }

    public void informAll(ParkingLot parkingLot, ParkingLotStatus status) {
        this.listeners.forEach(listener -> listener.notify(parkingLot, status));
    }
}
