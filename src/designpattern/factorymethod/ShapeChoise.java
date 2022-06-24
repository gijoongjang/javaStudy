package designpattern.factorymethod;

import java.util.Scanner;

public class ShapeChoise {

    private static Shape shape = null;

    public static boolean execute(String type) {
        if(shape == null) return false;

        switch (type) {
            case "1":
                shape.draw();
                return true;
            case "2":
                shape.edit();
                return true;
            case "3":
                shape.erase();
                return true;
        }

        return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("도형을 선택해주세요.");
        System.out.println("1.Point, 2.Line, 3.Poligon, 4.Exit");
        String shapeType = s.nextLine();

        System.out.println("종류를 선택해주세요.");
        System.out.println("1.그리기, 2.편집, 3.지우기");
        String type = s.nextLine();

        while(!shapeType.equals("4")) {
            shape = ShapeFactory.getShape(shapeType);

            if(!execute(type)) System.out.println("번호를 확인해주세요.");

            System.out.println();

            System.out.println("도형을 선택해주세요.");
            System.out.println("1.Point, 2.Line, 3.Poligon, 4.Exit");
            shapeType = s.nextLine();

            if(!shapeType.equalsIgnoreCase("4")) {
                System.out.println("종류를 선택해주세요.");
                System.out.println("1.그리기, 2.편집, 3.지우기");
                type = s.nextLine();
            }
        }
    }
}
