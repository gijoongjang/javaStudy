package designpattern.factorymethod;

public class Line implements Shape{

    @Override
    public void draw() {
        System.out.println("this is line draw method.");
    }

    @Override
    public void edit() {
        System.out.println("this is line edit method.");
    }

    @Override
    public void erase() {
        System.out.println("this is line erase method.");
    }
}
