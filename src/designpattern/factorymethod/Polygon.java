package designpattern.factorymethod;

public class Polygon implements Shape {

    @Override
    public void draw() {
        System.out.println("this is polygon draw method.");
    }

    @Override
    public void edit() {
        System.out.println("this is polygon edit method.");
    }

    @Override
    public void erase() {
        System.out.println("this is polygon erase method.");
    }
}
