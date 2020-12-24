package parkingLot;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class AssistantTest {

    @Test
    void shouldUpdateDisplayWhenGettingNotification() {
        Display display = mock(Display.class);
        Assistant assistant = new Assistant(display);

        ParkingLot parkingLot = new ParkingLot(3);
        assistant.notify(parkingLot, ParkingLotStatus.FULL);

        verify(display).update(parkingLot, ParkingLotStatus.FULL);
    }
}