package dev.tnordquist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class FizzBuzzTest {

  private static Object[][] fizzBuzz() {
    return new Object[][]{

        {new String[]{"1", "2", "Fizz", "4", "Buzz"},1, 6},
        {new String[]{"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"},1000, 1006}
    };
  }

  @ParameterizedTest
  @MethodSource
  void fizzBuzz(String[] expected, int start, int end) {

    String[] actual = FizzBuzz.fizzBuzz(start,end);
    assertArrayEquals(expected,actual);
  }
}