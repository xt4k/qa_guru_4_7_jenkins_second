package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Boolean.TRUE;
import static java.lang.Boolean.parseBoolean;
import static java.lang.System.*;
import static java.lang.System.getProperty;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

public class AtomJenkins {

    @Test
    void successTest1() {
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


    @Test
    void successTest4() {
       assertThat("true condition",true,is(true));
    }

    @Test
    void successTest5() {
        assertThat(true,is(true));
    }

    @Test
    void successTest6() {
        assertTrue(true);
    }

    @Test
    void successTest7() {
        assertTrue(true);
    }

    @Test
    void failedTest2() {
        assertThat("false condition",true, is(false));
    }




}
