
public class PointCP2 extends PointCP5 {

  //Instance variables ************************************************

  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  private double rho;
  
  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  private double theta;
	
  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP2(char type, double xOrRho, double yOrTheta)
  {
    if(type != 'C' && type != 'P')
      throw new IllegalArgumentException();
    if(type != 'P')
    {
        this.rho = Math.cos(Math.toRadians(yOrTheta)) * xOrRho;
        this.theta = Math.sin(Math.toRadians(yOrTheta)) * xOrRho;
    }
    else
    {
        this.rho = xOrRho;
        this.theta = yOrTheta;
    }
  }
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
    return xOrRho;

  }
  
  public double getY()
  {
    return yOrTheta;
  }
  
  public double getRho()
  {
    return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
  }
  
  public double getTheta()
  {

    return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
  }
	

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP2 pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCP2 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCP2('C',
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored as Polar [" + getRho() + "," + getTheta() + "]\n";
  }


}
