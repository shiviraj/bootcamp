package parkingLot;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ParkingLotTest {
    @Test
    public void shouldParkACarWhenParkingLotHasEmptySpaces() {
        ParkingLot parkingLot = new ParkingLot(5);
        assertTrue(parkingLot.park());
    }

    @Test
    public void shouldNotParkACarWhenParkingLotHasNoEmptySpaces() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park();
        assertFalse(parkingLot.park());
    }

    @Test
    public void shouldNotifyAssistantWhenParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        Assistant assistant = mock(Assistant.class);
        parkingLot.assignListener(assistant, ParkingLotStatus.FULL);

        assertTrue(parkingLot.park());
        verify(assistant).notify(parkingLot, ParkingLotStatus.FULL);
    }

    @Test
    public void shouldNotifyToAttendantWhenParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        ParkingLotListener attendant = mock(ParkingLotListener.class);
        parkingLot.assignListener(attendant, ParkingLotStatus.FULL);

        assertTrue(parkingLot.park());
        verify(attendant).notify(parkingLot, ParkingLotStatus.FULL);
    }

    @Test
    public void shouldNotifyToManagerWhenParkingLotIs80PercentFull() {
        ParkingLot parkingLot = new ParkingLot(5);
        ParkingLotListener manager = mock(ParkingLotListener.class);
        parkingLot.assignListener(manager, ParkingLotStatus.ALMOST_FULL);

        assertTrue(parkingLot.park());
        assertTrue(parkingLot.park());
        assertTrue(parkingLot.park());
        assertTrue(parkingLot.park());

        verify(manager).notify(parkingLot, ParkingLotStatus.ALMOST_FULL);
    }

    @Test
    public void shouldNotifyToAttendantWhenParkIs20PercentFull() {
        ParkingLot parkingLot = new ParkingLot(5);
        ParkingLotListener attendant = mock(ParkingLotListener.class);
        parkingLot.assignListener(attendant, ParkingLotStatus.ALMOST_VACANT);

        assertTrue(parkingLot.park());

        verify(attendant).notify(parkingLot, ParkingLotStatus.ALMOST_VACANT);
    }

    @Test
    public void shouldNotifyToAttendantWhenParkIsAtMost20PercentFull() {
        ParkingLot parkingLot = new ParkingLot(10);
        ParkingLotListener attendant = mock(ParkingLotListener.class);
        parkingLot.assignListener(attendant, ParkingLotStatus.ALMOST_VACANT);

        assertTrue(parkingLot.park());

        verify(attendant).notify(parkingLot, ParkingLotStatus.ALMOST_VACANT);
    }
}


