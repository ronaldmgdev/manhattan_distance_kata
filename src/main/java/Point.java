public class Point {
    private final int x1;
    private final int x2;

    public Point(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
    public int distanceFrom(Point b) {
        //System.out.println(b.x1);
        //System.out.println(b.x2);
        //System.out.println(x1);
        //System.out.println(x2);
        // return Math.abs(x1 - b.x1) - for only vertical
        // return Math.abs(x2 - b.x2) - for only horizontal
        return Math.abs(x1 - b.x1) + Math.abs(b.x2 - x2); // for sum
    }
}
