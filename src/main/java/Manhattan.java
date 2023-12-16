public class Manhattan {
    public static void main(String[] args) {
        Point a = new Point(2,3);
        Point b = new Point(1,3);
        System.out.println("The distance between a and b is: "+mGetDistance(a,b));
    }
    public static int mGetDistance(Point a, Point b) {
        return a.distanceFrom(b);
    }
}
