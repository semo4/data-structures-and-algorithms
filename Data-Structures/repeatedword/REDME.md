# Challenge Summary
<!-- Description of the challenge -->
- Write a function that accepts a lengthy string parameter and  return the first word to occur more than once in that provided string.

## Whiteboard Process
<!-- Embedded whiteboard image -->

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
- The function will track of all the words that are seen so far. The current word that is being examined will be checked against the the whole text to see if the word exist again in it. If it exists, then that means the word has been repeated so we return it. Otherwise move on the next word.
getWord()--> O(n2)

## Solution
<!-- Show how to run your code, and examples of it in action -->
- first defined text and store the whole string you need to check.
- then call the function and pass the text to it
- the function will return the repeated word.