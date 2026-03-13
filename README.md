# CS121-project8
The Java Guesser

## static void main ()
```
    new class instance
```
## constructor
```
response = 0
while keepGoing loop:
    menu()
    if response = 0
        keepGoing = false
    if response = 1
        humanGuesser()
    if response = 2
        computerGuesser()
```
## string menu()
```
print:
    0) Quit
    1) Human Guesser
    2) Computer Guesser
user input = response
return response
```
## void humanGuesser()
```
generate random num 1 to 100
int turns = 0
int guess = 0

while keepGoing loop:
    turns += 1
    input = tempString
    tempString convert to int = guess

    if guess < num
        print "Too Low"
    if guess > num
        print "Too High"
    if guess = num
        print "Correct"
        stop loop
    
    if turns < 7
         print "You Win!"
    if turns < 7
        print "You Lose... More than 7 tries"
    if turns = 7
        print "Try Again... Take less than 7 tries"
```
## void computerGuesser
```
int upper = 100
int lower = 1
int guess = getMean(upper, lower)
int turns = 0

while keepGoing loop
    turns += 1
    ask user for guess response
    if High
        upper = guess
        new guess with getMean
    if Low
        lower = guess
        new guess with getMean
    if Correct
        exit loop
    else
        "Incorrect Response..."
```
## getMean(upper, lower)
```
int mean
temp = lower + upper
result = temp/2
return result integer
```
