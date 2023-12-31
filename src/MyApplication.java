import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/a.khaimuldin/IdeaProjects/assignment1se2312/src/source");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNextLine()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println("perimeter: " + shape.calculatePerimeter());
        System.out.println("longest: " + shape.getLongestSide());
        System.out.println("average: " + shape.getAverageSide());
    }
}
