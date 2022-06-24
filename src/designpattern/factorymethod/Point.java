package designpattern.factorymethod;

public class Point implements Shape{

    @Override
    public void draw() {
        System.out.println("this is point draw method.");
    }

    @Override
    public void edit() {
        System.out.println("this is point edit method.");
    }

    @Override
    public void erase() {
        System.out.println("this is point erase method.");
    }
}
