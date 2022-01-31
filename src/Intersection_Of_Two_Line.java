/* program that asks the user to enter two lines.
 The first line is given as the two points (x1, y1) and (x2, y2),
 and the second line is given as the points (x3, y3) and (x4, y4).
 So the program will ask the user to enter these 8 coordinates.
  The program will then print the coordinates of the point where the lines intersect.
  However, if the lines are parallel or if they are coincident (the same line),
  the program will print "parallel lines".
  If they are not parallel, the program computes:

Px=(x1y2−y1x2)(x3−x4)−(x1−x2)(x3y4−y3x4)/D

and

Py=(x1y2−y1x2)(y3−y4)−(y1−y2)(x3y4−y3x4)/D

The program then prints the values Px and Py.
 */


import java.util.Scanner;

public class Intersection_Of_Two_Line
{
    public static void main (String [] args)
    {
        int x1, x2, x3, x4 = 0;
        int y1, y2, y3, y4;
        int distance = 0;
        int Px, Py = 0;

        Scanner in = new Scanner (System.in);
        System.out.println ("The program prints the coordinates of the point where the lines intersect.");
        System.out.println (" However, if the lines are parallel, the program will print that the line is parallel");

        System.out.println ("\n Enter first point:");
        System.out.print ("x1 : ");
        x1 = in.nextInt();
        System.out.print ("y1 : ");
        y1 = in.nextInt();

        System.out.println ("\n Enter second point:");
        System.out.print ("x2 : ");
        x2 = in.nextInt();
        System.out.print ("y2 : ");
        y2 = in.nextInt();

        System.out.println ("\n Enter third point:");
        System.out.print ("x3 : ");
        x3 = in.nextInt();
        System.out.print ("y3 : ");
        y3= in.nextInt();

        System.out.println ("\n Enter fourth point:");
        System.out.print ("x4 : ");
        x4 = in.nextInt();
        System.out.print ("y4 : ");
        y4= in.nextInt();

        distance = (x1-x2)*(y3-y4) - (y1-y2)*(x3-x4);

        if (distance == 0)
        {
            System.out.println ("The lines are parallel.");
        }
        else
        {
            Px = ((x1*y2-y1*x2)*(x3-x4)-(x1-x2)*(x3*y4-y3*x4))/distance;
            Py = ((x1*y2-y1*x2)*(y3-y4)-(y1-y2)*(x3*y4-y3*x4))/distance;
            System.out.println("The line in intersect in (Px, Py) = (" + Px + "," +Py+ ")");
        }

    }
}

