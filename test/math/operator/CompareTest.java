package math.operator;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

class CompareTest {
    @Test
    void shouldReturnTrueForCompare2FeetAnd24Inches() {
        Compare compare = new Compare(1, 12);
        assertTrue(compare.equalTo(2, 24));
    }

    @Test
    void shouldGiveFalseForCompare1FeetAnd5Inches() {
        Compare compare = new Compare(1, 12);
        assertFalse(compare.equalTo(1, 5));
    }
}