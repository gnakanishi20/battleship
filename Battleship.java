import java.util.Scanner;

public class battleship
{
    boolean hit = false;
    boolean [][] first = boolean int [10][10];
     
    public board()
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
        int RowTwo = RowTwo.randomRow();
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
            int Length = 2 + i;
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
                    int Length = 2 + i;
                }
                ChangeBoard(int length, int x, int y, int d)
            }
            
        }
        
        for(int i = 2, i<5, i++)
        {
            int d = d.RanDirrection()
            int Coloumn = (int)(Math.random() * (10 - i));
            int Row = (int)(Math.random() * (10 - i));
            int Length = 2 + i;
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
                    int Length = 2 + i;
                }
                ChangeBoard(int length, int x, int y, int d)
            }
            
        }
        //create by changing spaces that it occupies into 1
        //pick between 1 or 2 to determine whether its horizontal or vertical
        // if the boat hits any spaces that is 1, move the whole boat one to the side and one up keep going until either hit the edge or is all 1. If not possible randomize again
        //
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
                first[x + i][y];
            }
        }
        else
        {
            for(int i = 0, i<TwoLength,i++)
            {
                first[x][y + 1];
            }
        }
    }
    
    
    public int RanDirrection()
    {
        int dirrection = (int)(Math.random() * 2);
        return dirrection;
    }
    //initializes board
    //take in a array value?
    //iterate through board
    //check if hit or not?
    
}