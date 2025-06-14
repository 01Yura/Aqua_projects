package homework10;

import no_bugs.homework10.CommonClass;
import org.junit.jupiter.api.BeforeEach;

public class CommonClassSetup {
    CommonClass commonClass;

    @BeforeEach
    void setUp() {
        commonClass = new CommonClass();
    }
}
