package _2324Z.wis.eng.gr39.ppj_15;

public class Task3 {
    public static void main(String[] args) {
        Rect rec = Rect.getRect(Point.getPoint(2, 6), 6, 4);
        rec.showInfo();
        Point[] points = {
                Point.getPoint(3, 4), Point.getPoint(5, 6),
                Point.getPoint(1, 3), Point.getPoint(5, 3),
                Point.getPoint(4, 1), Point.getPoint(3, 7)
        };
        Rect cont = Rect.getContainingRect(points);
        cont.showInfo();
    }

}
