# Secret Handshake

Given a decimal number, convert it to the appropriate sequence of events for a secret handshake.

> There are 10 types of people in the world: Those who understand
> binary, and those who don't.

You and your fellow cohort of those in the "know" when it comes to
binary decide to come up with a secret "handshake".

```
1 = wink - 1
10 = double blink - 2
100 = close your eyes - 4
1000 = jump - 8


10000 = Reverse the order of the operations in the secret handshake. - 16
```

Here's a couple of examples:

Given the input 3, the function would return the array
["wink", "double blink"] because 3 is 11 in binary.

Given the input 19, the function would return the array
["double blink", "wink"] because 19 is 10011 in binary.
Notice that the addition of 16 (10000 in binary)
has caused the array to be reversed.


To run the tests:

```sh
$ gradle test
```

For more detailed info about the Java track see the [help page](http://exercism.io/languages/java).

## Source

Bert, in Mary Poppins [http://www.imdb.com/character/ch0011238/quotes](http://www.imdb.com/character/ch0011238/quotes)

## Submitting Incomplete Problems
It's possible to submit an incomplete solution so you can see how others have completed the exercise.

