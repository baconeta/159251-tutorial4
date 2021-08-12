package massey.tutorial4.id20019455;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {

    @Test
    void add() {
        int answer = Calc.add(1, 2);
        assertEquals(answer, 3);
    }

    @Test
    void subtract() {
        int answer = Calc.subtract(5, 3);
        assertEquals(answer, 2);
    }

}