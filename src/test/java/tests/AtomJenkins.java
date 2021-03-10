package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Boolean.parseBoolean;
import static java.lang.System.*;
import static java.lang.System.getProperty;
import static org.junit.jupiter.api.Assertions.*;

public class AtomJenkins {

    @Test
    void successTest() {
        assertTrue(true);
    }

    @Test
    void successTest2() {
        assertTrue(true);
    }

    @Test
    void failedTest() {
        fail();
    }


    @Test
    @DisplayName("Test from captain obviousness")
    void successTest3() {
        assertEquals(true==true,false==false);
    }


}
