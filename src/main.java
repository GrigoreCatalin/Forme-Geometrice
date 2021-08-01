import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Shape shapeOne = new Shape("Shape", "Aluminium");
//        System.out.println("Area is: " + shapeOne.getSize());
//        System.out.println(shapeOne.toString());
//        System.out.println(shapeOne.hashCode());
//        System.out.println();


        Shape shapeSecond = new Shape("Shape", "Silver");

        Triangle triangleOne = new Triangle("Triangle", "Gold", 10, 15);
//        triangleOne.displayTriangleHeight();
//        System.out.println("Area is: " + triangleOne.getSize());
//        System.out.println(triangleOne.toString());
//        System.out.println();

        Triangle triangleSecond = new Triangle("Triangle", "Gold", 10, 15);
//        System.out.println(triangleOne.equals(triangleSecond));
//        System.out.println(triangleOne.hashCode() + " -> " + triangleSecond.hashCode());

        Triangle triangleThird = new Triangle("Triangle", "Silver", 5, 2);
//        System.out.println(triangleThird.equals(triangleSecond));
//        System.out.println(triangleThird.hashCode() + " -> " + triangleSecond.hashCode());
//        System.out.println();

        Rectangle rectangleOne = new Rectangle("Rectangle", "Silver", 10, 20);
//        rectangleOne.displayTriangleHeight();
//        System.out.println("Area is: " + rectangleOne.getSize());
//        System.out.println(rectangleOne.toString());
//        System.out.println();

        Rectangle rectangleSecond = new Rectangle("Rectangle", "Silver", 10, 5);
//        System.out.println(rectangleOne.equals(rectangleSecond));
//        System.out.println(rectangleOne.hashCode() + " -> " + rectangleSecond.hashCode());

        Rectangle rectangleThird = new Rectangle("Rectangle", "Gold", 10, 20);
//        System.out.println(rectangleThird.equals(rectangleSecond));
//        System.out.println(rectangleThird.hashCode() + " -> " + rectangleSecond.hashCode());
//        System.out.println();

        ArrayList<Shape> allShapes = new ArrayList<>();
        allShapes.add(shapeOne);
        allShapes.add(shapeSecond);
        allShapes.add(triangleSecond);
        allShapes.add(triangleThird);
        allShapes.add(rectangleSecond);
        allShapes.add(rectangleThird);

        for (Shape item : allShapes) {
            System.out.println(item.getSize());
            System.out.println("Method toString: " + item.toString());
            System.out.println("Method equals:" + item.equals(shapeOne));
            System.out.println("Method hashCode: " + item.hashCode());
        }

        System.out.println();

        for (Shape item : allShapes) {
            if (item instanceof Triangle) {
                Triangle tr = (Triangle) item;
                tr.displayTriangleHeight();
            } else if (item instanceof Rectangle) {
                Rectangle re = (Rectangle) item;
                re.displayRectangleHeight();
            }
        }
    }
}
