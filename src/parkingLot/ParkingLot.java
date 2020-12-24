package parkingLot;

import java.util.HashMap;

public class ParkingLot {
    private final int capacity;
    private int occupiedSpaces = 0;
    private final HashMap<ParkingLotStatus, Listeners> listeners = new HashMap<>();

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        for (ParkingLotStatus status : ParkingLotStatus.values()) {
            this.listeners.put(status, new Listeners());
        }
    }

    public boolean park() {
        if (this.isFull()) return false;
        this.occupiedSpaces++;
        this.notifyListeners();
        return true;
    }

    public void assignListener(ParkingLotListener listener, ParkingLotStatus status) {
        this.listeners.get(status).add(listener);
    }

    private void notifyListeners() {
        ParkingLotStatus status = this.getParkingLotStatus();
        Listeners listeners = this.listeners.get(status);
        listeners.informAll(this, this.getParkingLotStatus());
    }

    private double occupiedPercentage() {
        return (double) (this.occupiedSpaces * 100) / this.capacity;
    }

    private ParkingLotStatus getParkingLotStatus() {
        if (isFull()) return ParkingLotStatus.FULL;
        if (this.occupiedPercentage() >= 80) return ParkingLotStatus.ALMOST_FULL;
        if (this.occupiedPercentage() <= 20) return ParkingLotStatus.ALMOST_VACANT;
        return ParkingLotStatus.AVAILABLE;
    }

    private boolean isFull() {
        return this.occupiedPercentage() == 100;
    }

}
