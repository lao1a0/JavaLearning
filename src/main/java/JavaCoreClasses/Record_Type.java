package JavaCoreClasses;

public class Record_Type {
    public static void main(String[] args) {
        example();
        example2();
    }


    public static void example(){
        Point p = new Point(123, 456);
        System.out.println(p.x());
        System.out.println(p.y());
        System.out.println(p);
    }

    public static void example2(){
        var z = Point.of();
        var p = Point.of(123, 456);
        System.out.println(p);
        System.out.println(z);
    }
}

//record Point(int x, int y) {}
// record Point(int x, int y) {
//    public Point {
//        if (x < 0 || y < 0) {
//            throw new IllegalArgumentException();
//        }
//    }
//}

record Point(int x, int y) {
    public static Point of() {
        return new Point(0, 0);
    }
    public static Point of(int x, int y) {
        return new Point(x, y);
    }
}
//final class Point {
//    private final int x;
//    private final int y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public int x() {
//        return this.x;
//    }
//
//    public int y() {
//        return this.y;
//    }
//}
