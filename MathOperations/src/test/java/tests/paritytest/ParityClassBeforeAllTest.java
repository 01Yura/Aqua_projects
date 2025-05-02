package tests.paritytest;

import org.junit.jupiter.api.BeforeEach;

public class ParityClassBeforeAllTest {
    ParityClass parityClass;

    @BeforeEach
    public void beforeEachTest() {
        parityClass = new ParityClass();
    }

}
