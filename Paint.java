 
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int height;
            int width;       
            int length;
            
            
            //declare double totalSqFt;
            int totalsqF;
            //declare double paintNeeded;
            double paintNeeded;
            //Declare and initialize the length of the room
            length = 15;
            //Declare and initialize the width of the room
            width = 11;
            //Declare and initialize the height of the room
            height = 8;
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            totalsqF = 2*(length*height+height*width+width*length);
            //Compute the amount of paint needed
            paintNeeded = totalsqF/350;
            //Print the length, width, and height of the room and the
            System.out.println("height is "+height);
            System.out.println("length is "+length);
            System.out.println("width is "+width);
            System.out.println("gallons needed is "+paintNeeded);
            
            //number of gallons of paint needed.
        }
}