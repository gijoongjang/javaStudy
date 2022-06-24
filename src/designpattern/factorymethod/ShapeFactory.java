package designpattern.factorymethod;

public class ShapeFactory {

    public static Shape getShape(String type) {

        switch (type) {
            case "1":
                return new Point();
            case "2":
                return new Line();
            case "3":
                return new Polygon();
        }

        return null;
    }
}
