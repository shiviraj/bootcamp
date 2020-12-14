//package math.probabilty;
//
//import exception.ChanceOutOfBoundsException;
//import org.junit.jupiter.api.Test;
//
//import static junit.framework.TestCase.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//class ChanceTest {
//    @Test
//    void shouldThrowChanceOutOfBoundsException() {
//        assertThrows(ChanceOutOfBoundsException.class, () -> Chance.init(1.5));
//    }
//
//    @Test
//    void shouldCalculateProbabilityOfGettingOneTailWhileFlippingOneCoin() throws ChanceOutOfBoundsException {
//        Chance chanceOfGettingOneTail = Chance.init(0.5);
//        assertEquals(new Chance(0.5), chanceOfGettingOneTail.not());
//    }
//
//    @Test
//    void shouldCalculateProbabilityOfGettingTwoTailWhileFlippingTwoCoin() throws ChanceOutOfBoundsException {
//        Chance chanceOfGettingOneTail = Chance.init(0.5);
//        assertEquals(new Chance(0.25), chanceOfGettingOneTail.and(chanceOfGettingOneTail));
//    }
//
//    @Test
//    void shouldCalculateProbabilityOfGettingAtLeastOneTailWhileFlippingTwoCoin() throws ChanceOutOfBoundsException {
//        Chance chanceOfGettingOneTail = Chance.init(0.5);
//
//        assertEquals(new Chance(0.75), chanceOfGettingOneTail.or(chanceOfGettingOneTail));
//    }
//}