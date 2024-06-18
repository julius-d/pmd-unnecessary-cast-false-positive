package org.example;

import io.vavr.collection.Array;
import io.vavr.collection.Seq;
import io.vavr.control.Either;

public class Main {

  public Either<Seq<String>, String> loadAll() {
    return load()
        .mapLeft(it -> (Seq<String>) Array.of(it))
        .map(foo -> "bar");
  }

  private Either<String, String> load() {
    return Either.left("hello");
  }

}
