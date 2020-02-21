package com.ankit;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestLambda {
  public static void main(String[] args) {
    TestLambda testLambda = new TestLambda();
    testLambda.testLambdas();
  }

  private void testLambdas() {
    Function<String, String> upper = s -> s.toUpperCase();
    System.out.println(upper.apply("hello"));

    Consumer<String> upperConsumer = s -> System.out.println(s.toUpperCase());
    upperConsumer.accept("hello consumer");

    Predicate<String> p = (String s) -> s.startsWith("hello");
    System.out.println(p.test("hi"));
  }
}
