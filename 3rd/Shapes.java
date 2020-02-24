import java.util.*;

class Circle {
    public void calculateArea(int sideLength) {
        System.out.println("The Area of the Circle is " + (2 * 3.14 * sideLength));
    }
}

class Square {
    public void calculateArea(int sideLength) {
        System.out.println("The Area of the square is " + (sideLength * sideLength));
    }
}

class Triangle {
    public void calculateArea(int sideLength) {
        System.out.println("The Area of the Triangle is " + (1.73 / 4) * (sideLength * sideLength));
    }
}

public class Shapes {
    int numberOfSides;

    public void calculateShapeArea(int shape, int sideLength) {
        numberOfSides = shape;
        if (numberOfSides == 1) {
            Circle c = new Circle();
            c.calculateArea(sideLength);
        } else if (numberOfSides == 3) {
            Triangle c = new Triangle();
            c.calculateArea(sideLength);
        } else if (numberOfSides == 4) {
            Square c = new Square();
            c.calculateArea(sideLength);
        } else
            System.out.println("No match");

        if (numberOfSides == 1) {
            Circle c = new Circle();
            c.calculateArea(sideLength);
        }  if (numberOfSides == 3) {
            Triangle c = new Triangle();
            c.calculateArea(sideLength);
        }  if (numberOfSides == 4) {
            Square c = new Square();
            c.calculateArea(sideLength);
        } if(numberOfSides > 3)
            System.out.println("No match");

        switch (numberOfSides) {
        case 1:
            Circle c1 = new Circle();
            c1.calculateArea(sideLength);
            break;
        case 3:
            Triangle c2 = new Triangle();
            c2.calculateArea(sideLength);
            break;
        case 4:
            Square c3 = new Square();
            c3.calculateArea(sideLength);
            break;
        default:
            System.out.println("No match");
            break;
        }
    }

    public static void main(String... args) {
        Shapes s = new Shapes();
        Scanner sc = new Scanner(System.in);
        int shape = sc.nextInt(), length = sc.nextInt();
        s.calculateShapeArea(shape, length);
    }
}