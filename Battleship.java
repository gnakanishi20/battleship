import java.util.Scanner;

public class battleship
{
    boolean hit = false;
    boolean [][] first = boolean int [10][10];
     
    public board()
    {
        // initialize an array, 10x10 grid, already declared false?
        boolean [][] first = new boolean [10][10];
        int dirrection;
    
        // set each space to false
        //create 5 ships with lengths 2,3,3,4,5 
        // ship 2
        int RowTwo = (int)(Math.random() * 10) + 1;
        int ColoumnTwo = (int)(Math.random() * 10) + 1;
        first [RowTwo][ColoumnTwo] = true;
        // picks dirrection of the boat, if dirrection = 1 then vertical if dirrection = 2 then horizontal
        int dirrection = (int)(Math.random() * 2) + 1;
        
        if(dirrection == 1)
        {
            first [RowTwo][ColoumnTwo + 1] = true;
        }
        else
        {
            first [RowTwo + 1][ColoumnTwo] = true;
        }
        
        //
        //create by changing spaces that it occupies into true
        //pick between 1 or 2 to determine whether its horizontal or vertical
        // if the boat hits any spaces that is true, move the whole boat one to the side and one up keep going until either hit the edge or is all true. If not possible randomize again
        //
    }
    //initializes board
    //take in a array value?
    //iterate through board
    //check if hit or not?
    public boardHit()
    {
        
    }
}