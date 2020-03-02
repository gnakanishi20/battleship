# battleship

1. When the game starts it initializes a random board consisting of 5 ships with lengths 2,3,3,4,5.
these ships are placed randomly on the board and in a random direction. Once the game does this 
it asks the user for what row and what coloumn they would like to shoot in. The game then takes 
in this input and decideds whether its a legal move and then if it is, it decideds whether the 
user has guessed the move before and if the user hasn't then determines whether the shot is a 
hit or miss. It then prints out if the shot is a hit and miss then prints out the game board showing
the moves that the player has already taked and the hits and misses. then the game checks to see if the
player has won the game. If so the game says "congratulations!" and the game is over.

2. The worst/best aha moment for me was coding in the methods and the syntax for them. For an hour I scowered
the internet in search for why the computer was giving me the error ".class" expected. I was so confused but
then when I looked at the code I was that put int in front of each variable that I was putting in the method.
Since I already declared these variable and jave them a data type the computer didn't read them. Once I fixed it my 
code ran and I felt really stupid but releived that I figured it out. 
My second aha moment was when I was talking with Mr.Kiang in class about how write my random game board. Originally
I was hard coding the whole game instead of finding a simpler way of doing it because I just couldn't think of any.
Then when I was talking to Mr. Kiang he said why not make the searching if I could put a ship in a space a different method then
the actually placing the ship itself. Then he also suggested instead of coding for the pieces exceeding the edge of the board
code it so they can't. This was a really big aha moment for me because it really gave me a way of coding my game more simply 
but I also still had to figure out how I was going to write it and he gave me the chance to still figure out all of the problems
by myself instead of doing it for me. So I coded this new, two method way and it was so much better than my original strategy of
hard coding. 
My final aha moment was with my game boards. Initially I made the game board that held the ships a boolean array. But I soon 
found out in my coding that this greatly limited my coding possibilities and actaually was more difficult then having it be 
an array that has the values of integers. When I changed the board to hold ints that each hold a different meaning/value the
game allowed me to have a greater diversity. I hit a problem with the booleans where after you guess a hit I would then change 
the value to false but if you guessed that same location again it would say that it is a miss and then change your hit to a miss
on the printed game board. By creating a board of ints it allowed me to bypass this problem by changing every hit to a different 
integer therefore when you guessed a already previously guess location the game would return that you guessed there and that you 
had to guess again. 
