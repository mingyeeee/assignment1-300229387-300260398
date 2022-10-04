// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/

/**
 * EDIT THIS
 *
* @author François Bélanger
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public abstract class PointCP5
{
  protected PointCP5() {}
	
  
  //Instance methods **************************************************
 
 
  public abstract double getX();
  
  public abstract double getY();
  
  public abstract double getRho();
  
  public abstract double getTheta();

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP5 pointB)
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
  public abstract PointCP5 rotatePoint(double rotation);

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public abstract String toString();
}
