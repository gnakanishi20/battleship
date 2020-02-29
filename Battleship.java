import java.util.Scanner;

public class Battleship
{
    boolean hit = false;
    int[][] first = new int[10][10];

    
    public Battleship()
    {
        // initialize an array, 10x10 grid, already declared 0?
        // 1 = ship is there, 0 = no ship
        int d;
        int coloumn;
        int row;
        int length;
        
        
        for(int i =1; i<3; i++)
        {
            d = RanDirrection();
            coloumn = (int)(Math.random() * (10 - i));
            row = (int)(Math.random() * (10 - i));
            length = 1 + i;
            
            if(this.placeShip(length, row, coloumn, d))
            {
                changeBoard(length, row, coloumn, d);
            }
            else
            {
                while(!placeShip(length, row, coloumn, d))
                {
                    d = RanDirrection();
                    coloumn = (int)(Math.random() * (10 - i));
                    row = (int)(Math.random() * (10 - i));
                    length = 1 + i;
                }
                changeBoard(length, row, coloumn, d);
            }

        }
        
        for(int i = 2; i < 5; i++)
        {
            d = RanDirrection();
            coloumn = (int)(Math.random() * (10 - i));
            row = (int)(Math.random() * (10 - i));
            length = 1 + i;

            
            if(placeShip(length, row, coloumn, d))
            {
                changeBoard(length, row, coloumn, d);
            }
            else
            {
                while(!placeShip(length, row, coloumn, d))
                {
                    d = RanDirrection();
                    coloumn = (int)(Math.random() * (10 - i));
                    row = (int)(Math.random() * (10 - i));
                    length = 1 + i;
                }
                changeBoard(length, row, coloumn, d);
            }
            
        }
        //create by changing spaces that it occupies into 1
        //pick between 1 or 2 to determine whether its horizontal or vertical
        // if the boat hits any spaces that is 1, move the whole boat one to the side and one up keep going until either hit the edge or is all 1. If not possible randomize again
        //
    }
     
    public void play()
    {
        boolean win = false;
        int identical[][] = IdentBoard();
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Welcome to battleship!");
        //ask for the player to enter space to shoot 
        
        //since its going to be an array how do I take a command line function and translate that into the array
        // maybe have two command line asks first the column then the Pickrow?
        
        while(win == false)
        {
             System.out.println("What row do you want to shoot in?");
            int Pickrow = kb.nextInt();
        
            while(Pickrow > 10 || Pickrow < 0)
            {
                System.out.println("row number must be less then 10 and greater than 1, pick again!");
                Pickrow = kb.nextInt();
            }
        
        
            System.out.println("What coloumn do you want to shoot in?");
            int Pickcoloumn = kb.nextInt();
        
            while(Pickcoloumn > 10 || Pickcoloumn < 0)
            {
                System.out.println("coloumn number must be less then 10 and greater than 1, pick again!");
                Pickcoloumn = kb.nextInt();
            }
            
        // now with the array location check to see if the space is marked true or false
            if(first[Pickrow][Pickcoloumn] == 3)
            {
                System.out.println("Already shot at the location pick again!");
            }
            else if(first[Pickrow][Pickcoloumn] == 1)
            {
                System.out.println("Hit!");
                first[Pickrow][Pickcoloumn] = 3;
                identical[Pickrow][Pickcoloumn] = 1;
            }
            else
            {
                System.out.println("Miss!");
                first[Pickrow][Pickcoloumn] = 3;
                identical[Pickrow][Pickcoloumn] = 2;
            }
        // if marked true print hit and change the value on orgiginal board to false
        // on the identical board change the print value to 1 to make it print an X
            // will I implement something about sinking a ship?! how would I do that 
            
        // if marked false print miss!
            // Code a miss into the identical board, the print line will change it into the miss symbol, which will be a space "  " will represent miss, value will b 2
                // a regular space will be printed as a O and be represented as the value 3
            
        // maybe create an identical board that is the one that is printed on the screen
        // this printed board will have the hit and misses that the player guessed
        // yes I will do that 
            int IdentPickrow = 0;
            int IdentPickcoloumn = 0;
        
            for(int i = 0; i < 10; i++)
            {
                for(int j = 0; j < 10; j++)
                {
                    if(identical[IdentPickrow + i][IdentPickcoloumn + j] == 1)
                    {
                        System.out.print("X");
                    }
                    else if(identical[IdentPickrow + i][IdentPickcoloumn + j] == 2)
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("O");
                    }
                }
                System.out.println();
            }
        // print identical board, maybe create a different function within the driver
        
        //Check if the game is won
            if(dub())
            {
                System.out.println("Congratulations you won!");
                win = true;
            }
            // do this by checking if the original board is all false
            // if all false then keep running the game
            // put the whole code withing a while loop like in die 
            // if game is won, set the boolean to true and print out a winning statement
            System.out.println();
        }
        
    }
    
    public int[][] IdentBoard()
    {
        //creating new board to print
        int [][] identical = new int [10][10];
        
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                // a hit will be represented with 1 and print X, a miss will be represented as 2 and print " ", and a regular space will be 3 and print O
                identical[i][j] = 3;
            }
        }
        return identical;
    }
    
    //run until true, b=put in another function
    
    public boolean placeShip(int length, int x, int y, int d)
    {
        int placed = 0;
        while(placed < length)
        {
            if(first[x][y] == 0)
            {
                if(d == 1)
                {
                    x++;
                    placed++;
                }
                else
                {
                    y++;
                    placed++;
                }
                return true;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    
    //changes board
    public int[][] changeBoard(int length, int x, int y, int d)
    {
        if(d == 1)
        {
            for(int i = 0; i < length; i++)
            {
                first[x + i][y] = 1;
            }
        }
        else
        {
            for(int i = 0; i < length; i++)
            {
                first[x][y + i] = 1;
            }
        }
        return first;
    }
    
    // 0 == space, 1 == occupied
    
    public int RanDirrection()
    {
        int dirrection = (int)(Math.random() * 2) + 1;
        return dirrection;
    }
    
    public boolean dub()
    {
        // I am using var to check if everything in the interval is 0
        var result = true;
        for(var i = 0; i < 10; i++)
        {
            for(var j = 0; j < 10; j++)
            {
                if(first[i][j] == 1)
                {
                    return false;
                }
            }
        }
        // result = true;
        return true;
    }
    
    //initializes board
    //take in a array value?
    //iterate through board
    //check if hit or not?
    
}