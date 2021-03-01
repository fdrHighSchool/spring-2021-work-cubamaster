public class Point {
    private int x;
    private int y;

    // constructor
    public Point (int x, int y) {
        setLocation(x, y);
    } //close Point

    // constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    } // close Point

    // to String method
    public String toString() {
        return "(" + x + ", " + y + ")";
    } // close toString


    // return distance from origin (0,0) to our point
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);// use distance between two point formula
    } // close distanceFromOrigin

    // shifts this point's location by the given amount
    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    } // close translate

    // sets this point's (x, y) location to the given values
    public void setLocation (int x, int y) {
        this.x = x;
        this.y = y;
    } // close setLocation

    // return distance from given point to our point
    public double distance(Point point) {
        return Math.sqrt(((this.x - point.getX()) * (this.x - point.getX())) +
                ((this.y - point.getY()) * (this.y - point.getY()))); // use distance between two point formula
    } // close distance

    // return midpoint on section between given point and our point
    public Point midpoint (Point point) {
        Point point1 = new Point();
        point1.setX((this.x + point.getX()) / 2);
        point1.setY((this.y + point.getY()) / 2);
        return point1;
    } // close midpoint


    // return slope of function which made by given point and our point
    public double slope (Point point) {
        return ((point.getY() - this.y) / (point.getX() - this.x));
    }// close slope

    // return if three point: two given and our, are collinear
    public boolean isCollinear(Point point1, Point point2) {
        if (slope(point1) == slope(point2) && slope(point2) == ((point2.getY() - point1.getY()) / (point2.getX() - point1.getX()))) {
            return true;
        }
        return false;
    }// close isCollinear

    // get X coordinate
    public int getX() {
        return x;
    }// close GetX

    // get Y coordinate
    public int getY() {
        return y;
    }// close getY

    // set x coordinate
    public void setX(int x) {
        this.x = x;
    }// close setX

    // set y coordinate
    public void setY(int y) {
        this.y = y;
    }// setY
}// close class
