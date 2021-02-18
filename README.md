#The Bowling Game Kata

Your goal is to implement a class to calculate the score in a game of bowling.

#How to score a game of bowling
A game consists of 10 frames.
A frame consists of 1 or 2 rolls.

An open frame occurs when a bowler leaves oe or more pins standing after 2 rolls.  

a strike occus when the bowler knocks down all 10 balls in the first frame.  The score is 10 + the next 2 balls rolled.

A spare occurs when the bowler roles two balls ion the frame that total 10.  The score for the frame is 10 plus a bonus of the next ball rolled.

After the tenth frame has been bowled the bowler can roll 1 or two more balls to provide the bonus for bonus for either a spare or a strike.

A perfect game is 10 strikes for total score of 300 and is the maximum score for a game of bowling.

# Further Reading
Blog Post by Uncle Bob: http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata

Step through of the tests and solutions
PowerPoint by Uncle Bob: http://butunclebob.com/files/downloads/Bowling%20Game%20Kata.ppt

##Solution
A solution is provided on the branch: solution

#Annotations for the five tests
```
    @Test
    @DisplayName("Test 1:score should be 0 after rolling 20 0s (gutter balls)")

    @Test
    @DisplayName("Test 2:score should be 20 after rolling 20 1s")

    @Test
    @DisplayName("Test 3:score should be 20 after rolling 16 after a spare and 3 - roll 1,9,3 + 17 0s")

    @Test
    @DisplayName("Test 4:score should be 20 after rolling 16 after a strike and 3 and a 4 - roll 10,3,4 + 16 0s")
 
    @Test
    @DisplayName("Test 5:score should be 300 after a perfect game - roll 12 10s")
```
