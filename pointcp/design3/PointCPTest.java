// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/

import java.io.*;
import java.util.*;

/**
 * This class prompts the user for a set of coordinates, and then 
 * converts them from polar to cartesian or vice-versa.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @author Paul Holden
 * @version July 2000
 */
public class PointCPTest
{
  //Class methods *****************************************************

  /**
   * This method is responsible for the creation of the PointCP
   * object.  This can be done in two ways; the first, by using the
   * command line and running the program using <code> java 
   * PointCPTest &lt;coordtype (c/p)&gt; &lt;X/RHO&gt; &lt;Y/THETA&gt;
   * </code> and the second by getting the program to prompt the user.
   * If the user does not enter a valid sequence at the command line,
   * the program will prompte him or her.
   *
   * @param args[0] The coordinate type.  P for polar and C for
   *                cartesian.
   * @param args[1] The value of X or RHO.
   * @param args[2] The value of Y or THETA.
   */
  public static void main(String[] args)
  {
    PointCP3 point;

    System.out.println("Cartesian-Polar Coordinates Conversion Program");

    // Check if the user input coordinates from the command line
    // If he did, create the PointCP object from these arguments.
    // If he did not, prompt the user for them.
    try
    {
      point = new PointCP3(args[0].toUpperCase().charAt(0), 
        Double.valueOf(args[1]).doubleValue(), 
        Double.valueOf(args[2]).doubleValue());
    }
    catch(Exception e)
    {
      // If we arrive here, it is because either there were no
      // command line arguments, or they were invalid
      if(args.length != 0)
        System.out.println("Invalid arguments on command line");

      try
      {
        point = getInput();
      }
      catch(IOException ex)
      {
        System.out.println("Error getting input. Ending program.");
        return;
      }
    }

    System.out.println("\nYou entered:\n" + point);
    System.out.println("\nCartesian: (" + point.getX() + ", "+point.getY()+")\n");
    System.out.println("\nPolar:(" + point.getRho() + ", "+point.getTheta()+")\n");

    // Performance Test for 10 seconds
    // set the starting time
    long startTime = 0;
    long functionStartTime = 0;
    
    long testRunNumber = 0;
    long endTime = 0;

    double highestTime = 0;
    double lowestTime = 0xffff;

    

    /************************************************************
     *    Testing getX()
     *  
     * **********************************************************
     */
    // while 10 seconds has not elapsed
    System.out.println("\n\nStarting getX() Test");

    double[] result = new double[1000];

    for(int i = 0; i<1000; i++)
    {
      startTime = System.currentTimeMillis();
      while(System.currentTimeMillis() - startTime < 10)
      {
        
        testRunNumber ++;
        point.getX();
      }
      endTime = System.currentTimeMillis();
      result[i] = (endTime - startTime)/(double)(testRunNumber);
      testRunNumber = 0;

      if( result[i] > highestTime)
      {
        highestTime = result[i];
      }
      if( result[i] < lowestTime)
      {
        lowestTime = result[i];
      }
    }

    Arrays.sort(result);
    System.out.println("getX() Median: " +result[500]);
    System.out.println("getX() High: " + highestTime );
    System.out.println("getX() Low: " + lowestTime );
    /************************************************************
     *    Testing getY()
     *  
     * **********************************************************
     */
    // while 10 seconds has not elapsed
    System.out.println("\n\nStarting getY() Test");
    result = new double[1000];
    highestTime = 0;
    lowestTime = 0xffff;
    for(int i = 0; i<1000; i++)
    {
      startTime = System.currentTimeMillis();
      while(System.currentTimeMillis() - startTime < 10)
      {
        
        testRunNumber ++;
        point.getY();
      }
      endTime = System.currentTimeMillis();
      result[i] = (endTime - startTime)/(double)(testRunNumber);
      testRunNumber = 0;

      if( result[i] > highestTime)
      {
        highestTime = result[i];
      }
      if( result[i] < lowestTime)
      {
        lowestTime = result[i];
      }
    }

    Arrays.sort(result);
    System.out.println("getY() Median: " +result[500]);
    System.out.println("getY() High: " + highestTime );
    System.out.println("getY() Low: " + lowestTime );
    
    

    /************************************************************
     *    Testing getRho()
     *  
     * **********************************************************
     */
    // while 10 seconds has not elapsed
    System.out.println("\n\nStarting getRho() Test");
    result = new double[1000];
    highestTime = 0;
    lowestTime = 0xffff;
    for(int i = 0; i<1000; i++)
    {
      startTime = System.currentTimeMillis();
      while(System.currentTimeMillis() - startTime < 10)
      {
        
        testRunNumber ++;
        point.getRho();
      }
      endTime = System.currentTimeMillis();
      result[i] = (endTime - startTime)/(double)(testRunNumber);
      testRunNumber = 0;

      if( result[i] > highestTime)
      {
        highestTime = result[i];
      }
      if( result[i] < lowestTime)
      {
        lowestTime = result[i];
      }
    }

    Arrays.sort(result);
    System.out.println("getRho() Median: " +result[500]);
    System.out.println("getRho() High: " + highestTime );
    System.out.println("getRho() Low: " + lowestTime );

    /************************************************************
     *    Testing getTheta()
     *  
     * **********************************************************
     */
    // while 10 seconds has not elapsed
    System.out.println("\n\nStarting getTheta() Test");
    result = new double[1000];
    highestTime = 0;
    lowestTime = 0xffff;
    for(int i = 0; i<1000; i++)
    {
      startTime = System.currentTimeMillis();
      while(System.currentTimeMillis() - startTime < 10)
      {
        
        testRunNumber ++;
        point.getTheta();
      }
      endTime = System.currentTimeMillis();
      result[i] = (endTime - startTime)/(double)(testRunNumber);
      testRunNumber = 0;

      if( result[i] > highestTime)
      {
        highestTime = result[i];
      }
      if( result[i] < lowestTime)
      {
        lowestTime = result[i];
      }
    }

    Arrays.sort(result);
    System.out.println("getTheta() Median: " +result[500]);
    System.out.println("getTheta() High: " + highestTime );
    System.out.println("getTheta() Low: " + lowestTime );
    /************************************************************
     *    Testing getDistance()
     *  
     * **********************************************************
     */
    // while 10 seconds has not elapsed
    System.out.println("\n\nStarting getDistance() Test");
    result = new double[1000];
    highestTime = 0;
    lowestTime = 0xffff;
    for(int i = 0; i<1000; i++)
    {
      startTime = System.currentTimeMillis();
      while(System.currentTimeMillis() - startTime < 10)
      {
        
        testRunNumber ++;
        point.getDistance(new PointCP3('C', 0,0));
      }
      endTime = System.currentTimeMillis();
      result[i] = (endTime - startTime)/(double)(testRunNumber);
      testRunNumber = 0;

      if( result[i] > highestTime)
      {
        highestTime = result[i];
      }
      if( result[i] < lowestTime)
      {
        lowestTime = result[i];
      }
    }

    Arrays.sort(result);
    System.out.println("getDistance() Median: " +result[500]);
    System.out.println("getDistance() High: " + highestTime );
    System.out.println("getDistance() Low: " + lowestTime );
  }

  /**
   * This method obtains input from the user and verifies that
   * it is valid.  When the input is valid, it returns a PointCP
   * object.
   *
   * @return A PointCP constructed using information obtained 
   *         from the user.
   * @throws IOException If there is an error getting input from
   *         the user.
   */
  private static PointCP3 getInput() throws IOException
  {
    byte[] buffer = new byte[1024];  //Buffer to hold byte input
    boolean isOK = false;  // Flag set if input correct
    String theInput = "";  // Input information
    
    //Information to be passed to the constructor
    char coordType = 'A'; // Temporary default, to be set to P or C
    double a = 0.0;
    double b = 0.0;

    // Allow the user to enter the three different arguments
    for (int i = 0; i < 3; i++)
    {
      while (!(isOK))
      {
        isOK = true;  //flag set to true assuming input will be valid
          
        // Prompt the user
        if (i == 0) // First argument - type of coordinates
        {
          System.out.print("Enter the type of Coordinates you "
            + "are inputting ((C)artesian / (P)olar): ");
        }
        else // Second and third arguments
        {
          System.out.print("Enter the value of " 
            + (coordType == 'C' 
              ? (i == 1 ? "X " : "Y ")
              : (i == 1 ? "Rho " : "Theta ")) 
            + "using a decimal point(.): ");
        }

        // Get the user's input      
       
        // Initialize the buffer before we read the input
        for(int k=0; k<1024; k++)
        	buffer[k] = '\u0020';        
             
        System.in.read(buffer);
        theInput = new String(buffer).trim();
        
        // Verify the user's input
        try
        {
          if (i == 0) // First argument -- type of coordinates
          {
            if (!((theInput.toUpperCase().charAt(0) == 'C') 
              || (theInput.toUpperCase().charAt(0) == 'P')))
            {
              //Invalid input, reset flag so user is prompted again
              isOK = false;
            }
            else
            {
              coordType = theInput.toUpperCase().charAt(0);
            }
          }
          else  // Second and third arguments
          {
            //Convert the input to double values
            if (i == 1)
              a = Double.valueOf(theInput).doubleValue();
            else
              b = Double.valueOf(theInput).doubleValue();
          }
        }
        catch(Exception e)
        {
        	System.out.println("Incorrect input");
        	isOK = false;  //Reset flag as so not to end while loop
        }
      }

      //Reset flag so while loop will prompt for other arguments
      isOK = false;
    }
    //Return a new PointCP object
    return (new PointCP3(coordType, a, b));
  }
}
