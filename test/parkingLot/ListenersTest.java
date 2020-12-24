package parkingLot;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ListenersTest {

    @Test
    void shouldInformAllListeners() {
        Listeners listeners = new Listeners();
        ParkingLotListener assistant = mock(ParkingLotListener.class);
        listeners.add(assistant);

        ParkingLot parkingLot = new ParkingLot(4);
        listeners.informAll(parkingLot, ParkingLotStatus.FULL);
        
        verify(assistant).notify(parkingLot, ParkingLotStatus.FULL);
    }
}