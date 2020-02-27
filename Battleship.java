import java.util.Scanner;

public class Battleship
{
    boolean hit = false;
    int[][] first = new int[10][10];
    
    public Battleship()
    {
        // initialize an array, 10x10 grid, already declared 0?
        // 1 = ship is there, 0 = no ship
        int [][] first = new int [10][10];
        int dirrection;
    
        // set each space to 0
        //create 5 ships with lengths 2,3,3,4,5 
        // ship 2
        // int RowTwo = (int)(Math.random() * 10) + 1;
        // int ColoumnTwo = (int)(Math.random() * 10) + 1;
        // int lastRoll2 = last2.roll();
        
        int ColoumnTwo = ColoumnTwo.randomColoumn();
        int RowTwo = RowTwo.randomRow();;
        int d = d.RanDirrection()
        int TwoLength = 2;
        // picks dirrection of the boat, if dirrection = 1 then vertical if dirrection = 2 then horizontal
        
        // if(PlaceShip(TwoLength, RowTwo, ColoumnTwo, d) == true)
        // {
        //     if(d == 1)
        //     {
        //         for(int i = 0, i<TwoLength,i++)
        //         {
        //             first[RowTwo + i][ColoumnTwo];
        //         }
        //     }
        //     else
        //     {
        //         for(int i = 0, i<TwoLength,i++)
        //         {
        //             first[RowTwo][ColoumnTwo + 1];
        //         }
        //     }
        // }
        
        for(int i = 1, i<3, i++)
        {
            int d = d.RanDirrection()
            int Coloumn = (int)(Math.random() * (10 - i));
            int Row = (int)(Math.random() * (10 - i));
            int Length = 1 + i;
            
            if(PlaceShip(int length, int x, int y, int d))
            {
                ChangeBoard(int length, int x, int y, int d)
            }
            else
            {
                while(!PlaceShip(int length, int x, int y, int d))
                {
                    int d = d.RanDirrection()
                    int Coloumn = (int)(Math.random() * (10 - i));
                    int Row = (int)(Math.random() * (10 - i));
                    int Length = 1 + i;
                }
                ChangeBoard(int length, int x, int y, int d)
            }
            
        }
        
        for(int i = 2, i<5, i++)
        {
            int d = d.RanDirrection()
            int Coloumn = (int)(Math.random() * (10 - i));
            int Row = (int)(Math.random() * (10 - i));
            int Length = 1 + i;
            
            if(PlaceShip(int length, int x, int y, int d))
            {
                ChangeBoard(int length, int x, int y, int d)
            }
            else
            {
                while(!PlaceShip(int length, int x, int y, int d))
                {
                    int d = d.RanDirrection()
                    int Coloumn = (int)(Math.random() * (10 - i));
                    int Row = (int)(Math.random() * (10 - i));
                    int Length = 1 + i;
                }
                ChangeBoard(int length, int x, int y, int d)
            }
            
        }
        //create by changing spaces that it occupies into 1
        //pick between 1 or 2 to determine whether its horizontal or vertical
        // if the boat hits any spaces that is 1, move the whole boat one to the side and one up keep going until either hit the edge or is all 1. If not possible randomize again
        //
        return first;
    }
     
    public void play()
    {
        boolean win = false;
        
        board create[][] = new board();
        
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Welcome to battleship!");
        //ask for the player to enter space to shoot 
        System.out.println("What row do you want to shoot in?");
        int PickRow = kb.nextInt();
        
        do
        {
            System.out.println("Row number must be less then 10, pick again!");
            PickRow = kb.nextInt();
        }
        while(PickRow > 10);
        
        System.out.println("What Coloumn do you want to shoot in?");
        int PickColoumn = kb.nextInt();
        
        do
        {
            System.out.println("Coloumn number must be less then 10, pick again!");
            PickColoumn = kb.nextInt();
        }
        while(PickColoumn > 10);
        //since its going to be an array how do I take a command line function and translate that into the array
        // maybe have two command line asks first the column then the PickRow?
        
        while(win == false)
        {
        // now with the array location check to see if the space is marked true or false
            if(first [PickRow][PickColoumn] == true)
            {
                System.out.println("Hit!");
                first[PickRow][PickColoumn] = 0;
                identical[PickRow][PickColoumn] = 1;
            }
            else
            {
                System.out.println("Miss!");
                identical[PickRow][PickColoumn] = 2;
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
            int IdentPickRow = 0;
            int IdentPickColoumn = 0;
        
            for(int i = 0; i<10; i++)
            {
                for(int j = 0; j<10; j++)
                {
                    if(identical[IdentPickRow + j][IdentPickColoumn + i] == 1)
                    {
                        System.out.println("X");
                    }
                    else if(identical[IdentPickRow + j][IdentPickColoumn + i] == 2)
                    {
                        System.out.println(" ");
                    }
                    else
                    {
                        System.out.println("O");
                    }
                }
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
        }
        
    }
    
    public IdentBoard()
    {
        //creating new board to print
        int [][] indentical = new int [10][10]
        
        for(int i=0; i<10; i++)
        {
            for(int j=0; i<10; i++)
            {
                // a hit will be represented with 1 and print X, a miss will be represented as 2 and print " ", and a regular space will be 3 and print O
                indentical [i][j] = 3;
            }
        }
    }
    
    //run until true, b=put in another function
    
    public boolean PlaceShip(int length, int x, int y, int d)
    {
        int placed = 0;
        while(placed < length)
        {
            if(board[x][y] == 0)
            {
                if(d == 1)
                {
                    x++;
                }
                else
                {
                    y++;
                }
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    
    public static ChangeBoard(int length, int x, int y, int d)
    {
        if(d == 1)
        {
            for(int i = 0, i<length, i++)
            {
                first[x + i][y] = 1;
            }
        }
        else
        {
            for(int i = 0, i<TwoLength,i++)
            {
                first[x][y + i] = 1;
            }
        }
    }
    
    // 0 == space, 1 == occupied
    
    public int RanDirrection()
    {
        int dirrection = (int)(Math.random() * 2);
        return dirrection;
    }
    
    public boolean dub()
    {
        // I am using var to check if everything in the interval is 0
        var result = true;
        for(var i=0; i<10; i++)
        {
            for(var j=0; i<10; i++)
            {
                if(first[i][j] = 1)
                {
                    result = false;
                    break;
                }
            }
        }
        return true;
    }
    //initializes board
    //take in a array value?
    //iterate through board
    //check if hit or not?
    
}