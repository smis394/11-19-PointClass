// A Point object represents a pair of (x, y) integer coordinates.
// Reference Building Java Programs pp 505-517
public class point
{
  int x;
  int y;
 public int getX()
 {
   return x;
 }
 public int getY()
 {
   return y;
 }

  public double distanceFromOrigin()
  {
    double s =Math.sqrt(x*x+y*y);
    return s;
  }
 public double distance(Point p)
 {
  double f=Math.sqrt(((x-p.x)*(x-p.x))+((y-p.y)*(y-p.y)));
  
 }
  
  public String toString()
  {
    return"("+x+","+y+")";
  }
  public void setX (int xNumber)
  {
    x=xNumber;
  }
  public void setY (int yNumber)
  {
    y=yNumber;
  }
  public void translate (int dx, int dy)
 {
    x+=dx;
    x+=dy;
  }
}

