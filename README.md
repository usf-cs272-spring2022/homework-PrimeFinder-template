PrimeFinder
=================================================

![Points](../../blob/badges/points.svg)

For this homework, you will modify the work queue implementation that is able to track and wait for pending work, and use it to find primes.

## Hints ##

Below are some hints that may help with this homework assignment:

  - Add a `pending` variable to the `WorkQueue` class to track unfinished work and implement a `finish()` method that waits until there is no more pending work.

  - There should *not* be a `pending` variable or `TaskManager` nested class in the `PrimeFinder` class! You will need to create an inner "task" or "work" class, however.

  - Implement the multithreaded `findPrimes(int, int, int)` method in `PrimeFinder` using your modified `WorkQueue` class. There should be 1 task or `Runnable` object for each number being tested and the `run()` method of these objects should use the `isPrime(int)` method.

  - Do not try to use lambda expressions or streams here, since data must be mutated outside of a thread's scope.

These hints are *optional*. There may be multiple approaches to solving this homework.

## Requirements ##

See the Javadoc and `TODO` comments in the template code in the `src/main/java` directory for additional details. You must pass the tests provided in the `src/test/java` directory. Do not modify any of the files in the `src/test` directory.

See the [Homework Guides](https://usf-cs272-spring2022.github.io/guides/homework/) for additional details on homework requirements and submission.
