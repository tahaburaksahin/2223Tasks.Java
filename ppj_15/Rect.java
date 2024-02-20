package _2324Z.wis.eng.gr39.ppj_15;

public class Rect {
    Point leftUpper;
    Point rightBottom;


    public static Rect getRect(Point leftUpper, int width, int hight) {
        Rect r = new Rect();
        r.leftUpper = leftUpper;
        r.rightBottom = Point.getPoint(leftUpper.x + width, leftUpper.y - hight);

        return r;
    }


    public static Rect getContainingRect(Point[] arr) { // {{x,y}}
        if (arr.length == 0) {
            return null;
        }

        int xMax = arr[0].x;
        int xMim = arr[0].x;
        int yMax = arr[0].y;
        int yMim = arr[0].y;


        for (Point point : arr) {
            int tmpX = point.x;
            int tmpY = point.y;

            xMax = xMax < tmpX ? tmpX : xMax;
            xMim = xMim > tmpX ? tmpX : xMim;
            yMax = yMax < tmpY ? tmpY : yMax;
            yMim = yMim > tmpY ? tmpY : yMim;
        }

        Rect r = new Rect();
        r.leftUpper = Point.getPoint(xMim, yMax);
        r.rightBottom = Point.getPoint(xMax, yMim);

        return r;
    }

    public void showInfo() {
        System.out.println("UL=(" + leftUpper.x + ", " + leftUpper.y + ") BR=(" + rightBottom.x + ", " + rightBottom.y + ")");
    }
}
