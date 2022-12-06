## TDD Code Kata Starter Project

- This project was generated using [Spring Initializr](https://start.spring.io/)
- This project comes with JUnit5 built in and does not include JUnit4.
- To build and run this project, you will need to have JDK 11 installed on your work station

### Getting Started
1. Choose your IDE.  IntelliJ is recommended, but eclipse could be used if that is the team's preference.  Ideally all participants in the code kata can use the same IDE.
2. This project has branches that can be referenced to see possible solutions for each step of the kata.  The main branch contains an empty project and should be used to start the kata.

### What is a Code Kata?
A Code Kata is a small group coding exercise where each participant writes small snippets of code in one sitting, sometimes repeatedly, in order to build muscle memory and practise their craft.

### What is TDD?
TDD stands for Test Driven Development and in a nutshell it is a practice where you implement a feature by first writing the test, getting the test to fail, then implement the simplest minimal code needed to make the test pass, refactor the code, and then repeat.

### Executing this TDD Code Kata
In this Code Kata, the exercise will involve building a simple Rock, Paper, Scissors game.  The goal is to write a method that takes two parameters; hand one and hand two.  The method will then determine the result and return a value indicating that either Hand One Won, Hand Two Won, or the result was a Tie. The team should also decide which assertion framework they will use.  The first Kata should probably use `org junit` assertions, but subsequent Katas could use others such as `assertj`.

#### Step 1
Write a failing test.  Refer to the [User Stories](STORIES.md) and review the first test case which is rock vs rock. 
```java
@Test
void rockVsRock() {
    assertEquals(true, false);
}
```

Run the test and validate that it failed for the expected reason.  If the failure looks good, then make the test pass.
```java
@Test
void rockVsRock() {
    assertEquals(true, true);
}
```
Run the test again and verify that the test passes.

#### Step 2
Rewrite the test with the goal that this iteration could potentially be the final implementation.
```java
@Test
void rockVsRock() {
    assertEquals(Result.DRAW, new Rps().play(Hand.ROCK, Hand.ROCK));
}
```

The key to this step is to write the code so that it has compile errors and then let the IDE generate the code. Once the IDE has generated the code, the implementation of our method should look like below.
```java
public Result play(Hand hand1, Hand hand2) {
    return null;
}
```

Run the test and validate that it fails for the expected reason.  If the failure is correct, then implement the simplest solution that will make the test pass.
```java
public Result play(Hand hand1, Hand hand2) {
    return Result.DRAW;
}
```

Re-run the test and validate that it passes. If the test is green, then review code and refactor if necessary.  At this point, only the test may need some clean up.
```java
class RpsTest {

    Rps rps = new Rps();

    @Test
    void rockVsRock() {
        assertEquals(Result.DRAW, rps.play(Hand.ROCK, Hand.ROCK));
    }
}
```

### Subsequent Steps
The next step then would be to implement the remainder of User Stories.  Following the Gherkin, the tests should be implemented first and executed and the results validated that all the new tests fail and all the existing tests still pass.  After this, the simplest code is then implemented to get each test to pass one at a time.  Once all tests are green, then the code is reviewed and refactored as needed.  After refactoring, all tests are ran once again to validate that everything is still green.
