package homework10;

import org.junit.jupiter.api.BeforeEach;

public class CommonClassSetup {
    CommonClass commonClass;

    @BeforeEach
    void setUp() {
        commonClass = new CommonClass();
    }
}
