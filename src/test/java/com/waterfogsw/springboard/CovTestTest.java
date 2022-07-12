package com.waterfogsw.springboard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CovTestTest {

  CovTest covTest = new CovTest();

  @ParameterizedTest
  @ValueSource(ints = {0, Integer.MIN_VALUE})
  @DisplayName("a 값이 양수가 아닌경우")
  public void test(int src) {
    assertThrows(IllegalArgumentException.class, () -> covTest.test(src));
  }
}
