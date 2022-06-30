
//Yesterday 4:14 PM] Quinn diGirolamo
public class Point
{

    private int x;
    private int y;
    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int xVal, int yVal) {
        this.x = xVal;
        this.y = yVal;
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    public void setPoint(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public String toString() {
        return ("(" + x + ", " + y + ")");
    }

    public double distance(Point z) {
        return Math.sqrt((Math.pow(x - z.x, 2)) + (Math.pow(y - z.y, 2)));
    }
}



