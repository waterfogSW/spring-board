package com.waterfogsw.springboard;

import org.springframework.util.Assert;

public class CovTest {
  public void test(int a) {
    Assert.isTrue(a > 0, "A must be positive");

    System.out.println(a);
  }

}
