import java.util.Scanner;

public class battleship
{
    boolean hit = false;
    // boolean [][] first = boolean int [10][10];
     
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
        first [RowTwo][ColoumnTwo] = 1;
        // picks dirrection of the boat, if dirrection = 1 then vertical if dirrection = 2 then horizontal
        int dirrection = dirrection.RanDirrection()
        
        if(dirrection == 1)
        {
            //makes sure boat wont go off grid
            if(ColoumnTwo == 10)
            {
                first [RowTwo][ColoumnTwo - 1] = 1;
            }
            else
            {
                first [RowTwo][ColoumnTwo + 1] = 1; 
            }
        }
        else
        {
            //makes sure boat wont go off grid
            if(RowTwo == 10)
            {
                first [RowTwo - 1][ColoumnTwo] = 1;
            }
            else
            {
                first [RowTwo + 1][ColoumnTwo] = 1;
            }
        }
        
        // ship 3
        int ColoumnThree = ColoumnThree.randomColoumn();
        int RowThree = RowThree.randomRow();
        
        int DirrectionThree = DirrectionThree.RanDirrection();
        
        do
        {
            int ColoumnThree = ColoumnThree.randomColoumn();
            int RowThree = RowThree.randomRow();
        }
        while(first [RowThree][ColoumnThree] == 1)
        
        
        
        if(DirrectionThree == 1)
        {
                //makes sure boat wont go off grid
            if(ColoumnThree >= 8)
            {
                if(first[RowThree][ColoumnThree] == 0 && first[RowThree][ColoumnThree - 1] == 0 && first[RowThree][ColoumnThree - 2] == 0)
                {
                    for(int i = 0, i<3, i++)
                    {
                        first [RowThree][ColoumnThree - i] = 1;
                    }
                }
                else if(ColoumnTwo == 9)
                {
                    for(int i = 0, i<3, i++)
                    {
                        first [RowThree - 1][ColoumnThree - i] = 1;
                    }
                }
                else
                {
                    if(first[RowThree][ColoumnThree] == 0 && first[RowThree][ColoumnThree - 1] == 0 && first[RowThree][ColoumnThree - 2] == 0)
                    {
                        for(int i = 0, i<3, i++)
                        {
                            first [RowThree - 2][ColoumnThree - i] = 1;
                        }
                    }
                }
            }
            else 
            {
                if(first[RowThree][ColoumnThree] == 0 && first[RowThree][ColoumnThree + 1] == 0 && first[RowThree][ColoumnThree + 2] == 0)
                {
                    first [RowThree][ColoumnThree + i]  = 1; 
                }
                
            }
            
        }
        else
        {
            //makes sure boat wont go off grid
            if(RowTwo == 10)
            {
                first [RowThree - i][ColoumnThree] = 1;
            }
            else
            {   
                first [RowThree + i][ColoumnThree] = 1;
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
    
    public randomColoumn()
    {
        int Coloumn = (int)(Math.random() * 10);
        return Coloumn;
    }
    
    public randomRow()
    {
        int Row = (int)(Math.random() * 10);
        return Row;
    }
    
    public RanDirrection()
    {
        int dirrection = (int)(Math.random() * 2);
        return dirrection;
    }
    //initializes board
    //take in a array value?
    //iterate through board
    //check if hit or not?
    
}