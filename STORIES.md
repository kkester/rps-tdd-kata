## TDD Code Kata User Stories

### Story 1 - Rock vs Rock Results in a Draw
```gherkin
Given A Game of RPS
When player 1 plays ROCK
  And player 2 plays ROCK
Then the result is a TIE
```

### Story 2 - Rock vs Paper Results in a Loss
```gherkin
Given A Game of RPS
When player 1 plays PAPER
And player 2 plays PAPER
Then the result is a TIE
  
Given A Game of RPS
When player 1 plays ROCK
  And player 2 plays PAPER
Then the result is a LOSS

Given A Game of RPS
When player 1 plays PAPER
And player 2 plays ROCK
Then the result is a WIN
```

### Story 3 - Rock vs Scissors Results in a Win
```gherkin
Given A Game of RPS
When player 1 plays ROCK
  And player 2 plays SCISSORS
Then the result is a WIN

Given A Game of RPS
When player 1 plays SCISSORS
And player 2 plays ROCK
Then the result is a LOSS

Given A Game of RPS
When player 1 plays SCISSORS
And player 2 plays SCISSORS
Then the result is a TIE
```

### Story 4 - Scissors vs Paper Results in a Win
```gherkin
Given A Game of RPS
When player 1 plays SCISSORS
And player 2 plays PAPER
Then the result is a WIN
  
Given A Game of RPS
When player 1 plays PAPER
  And player 2 plays SCISSORS
Then the result is a LOSS
```