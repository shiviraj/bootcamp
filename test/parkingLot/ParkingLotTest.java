package parkingLot;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

class ParkingLotTest {
    @Test
    void shouldParkCarInParkingLot() {
        ParkingLot parkingLot = new ParkingLot(20);
        assertTrue(parkingLot.parkCar(1));
    }

    @Test
    void shouldNotParkCarInParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.parkCar(2);

        assertFalse(parkingLot.parkCar(1));
    }

    @Test
    void shouldAssertTrueIfParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.parkCar(2);

        assertTrue(parkingLot.isFull());
    }

    @Test
    void shouldAssertFalseIfParkingLotIsNotFull() {
        ParkingLot parkingLot = new ParkingLot(1);

        assertFalse(parkingLot.isFull());
    }

}