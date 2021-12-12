package com.kodilla.exception.io.test;

import com.kodilla.exception.test.ExceptionHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testSuiteSecondChallenge {
    @Test
    public void testReadFileWithName() {
        // given
        ExceptionHandling tests = new ExceptionHandling();
        // when & then

       assertAll(
               () -> assertThrows(Exception.class , () -> tests.ExceptionSecondChallengeTester(2, 5)),
               () -> assertThrows(Exception.class , () -> tests.ExceptionSecondChallengeTester(0, -1)),
               () -> assertThrows(Exception.class , () -> tests.ExceptionSecondChallengeTester(4, 2)),
               () -> assertDoesNotThrow(() -> tests.ExceptionSecondChallengeTester(1.5 , 2)),
                () -> assertDoesNotThrow(() -> tests.ExceptionSecondChallengeTester(1 , 5))
        );
    }
}
