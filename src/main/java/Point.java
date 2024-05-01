public class Point {
    private int x;
    private int y;

    public Point(){}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance() {
        return distance(0,0);
    }
    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }
    public double distance(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX() {
        this.x = x;
    }
    public void setY() {
        this.y = y;
    }
}

