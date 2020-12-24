package parkingLot;

import java.util.HashMap;

public class Display {
    private final HashMap<ParkingLot, ParkingLotStatus> parkingLotEntries = new HashMap<>();

    public int update(ParkingLot parkingLot, ParkingLotStatus status) {
        this.parkingLotEntries.put(parkingLot, status);
        return parkingLotEntries.size();
    }
}
