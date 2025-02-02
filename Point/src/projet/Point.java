package projet;

public class Point 
{
	private int  x, y;
	public Point(int x1, int y1) 
	{
		x = x1; y = y1;
	}
	public double distance(Point p)
	{
		return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
	}
}


class TestPoint 
{
	public static void main(String[] args) {
	Point p1 = new Point(1, 2);
	Point p2 = new Point(5, 1);
	System.out.println("Distance : " + p1.distance(p2));
	}
}


