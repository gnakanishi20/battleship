import java.util.Scanner;

public class Battleship
{
    boolean hit = false;
    int[][] first = new int[10][10];

    
    public Battleship()
    {

        int d;
        int coloumn;
        int row;
        int length;
        
        // places ships with length 2,3
        for(int i =1; i<3; i++)
        {
            d = RanDirrection();
            coloumn = (int)(Math.random() * (10 - i));
            row = (int)(Math.random() * (10 - i));
            length = 1 + i;
            
            //Checks to see if we can place the ship at the locations then if can places, if not changes the values until we can
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
        
        //places ships with length 3,4,5
        for(int i = 2; i < 5; i++)
        {
            d = RanDirrection();
            coloumn = (int)(Math.random() * (10 - i));
            row = (int)(Math.random() * (10 - i));
            length = 1 + i;

             //Checks to see if we can place the ship at the locations then if can places, if not changes the values until we can
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

    }
     
    public void play()
    {
        boolean win = false;
        //calls the identical board
        int identical[][] = IdentBoard();
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Welcome to battleship!");
        //ask for the player to enter space to shoot 
        
        //since its going to be an array how do I take a command line function and translate that into the array
        // maybe have two command line asks first the column then the Pickrow?
        
        while(win == false)
        {
             System.out.println("What row do you want to shoot in?");
            int Pickrow = kb.nextInt() - 1;
            // sets the parameters of input, add something that makes sure its an int
            while(Pickrow > 10 || Pickrow < 0)
            {
                System.out.println("row number must be between 1 and 10, pick again!");
                Pickrow = kb.nextInt() - 1;
            }
        
            // sets the parameters of input
            System.out.println("What coloumn do you want to shoot in?");
            int Pickcoloumn = kb.nextInt() - 1;
        
            while(Pickcoloumn > 10 || Pickcoloumn < 0)
            {
                System.out.println("coloumn number must be between 1 and 10, pick again!");
                Pickcoloumn = kb.nextInt() - 1;
            }
            
            // checks to see if user had a hit miss or already shot in location
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

            //delcares variables for the print
            int IdentPickrow = 0;
            int IdentPickcoloumn = 0;
            
            // prints out the board
            for(int i = 0; i < 10; i++)
            {
                for(int j = 0; j < 10; j++)
                {
                    if(identical[IdentPickrow + i][IdentPickcoloumn + j] == 1)
                    {
                        //represents a hit
                        System.out.print("X");
                    }
                    else if(identical[IdentPickrow + i][IdentPickcoloumn + j] == 2)
                    {
                        //represents a miss
                        System.out.print(" ");
                    }
                    else
                    {
                        //represents a space not already shot at
                        System.out.print("O");
                    }
                }
                //prints a line break between each row
                System.out.println();
            }

        
        //Check if the game is won
            if(dub())
            {
                System.out.println("Congratulations you won!");
                win = true;
            }
            
            //prints out a line break between each board and next round
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
    
    // checks to see if we can place the ship in the spaces
    public boolean placeShip(int length, int x, int y, int d)
    {
        int placed = 0;
        while(placed < length)
        {
            //checks to see that the space is unoccupied
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
                //returns false if the space is occupied, the quits the method
                return false;
            }
        }
        return true;
    }
    
    //changes board, places ships
    public int[][] changeBoard(int length, int x, int y, int d)
    {
        // if the dirrection is horrizontal
        if(d == 1)
        {
            for(int i = 0; i < length; i++)
            {
                first[x + i][y] = 1;
            }
        }
        // if the dirrection is vertical
        else
        {
            for(int i = 0; i < length; i++)
            {
                first[x][y + i] = 1;
            }
        }
        return first;
    }
    
    // creates the random dirrection
    public int RanDirrection()
    {
        int dirrection = (int)(Math.random() * 2) + 1;
        return dirrection;
    }
    
    //checks to see if the game is won
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
    
}