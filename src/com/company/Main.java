package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle =new Rectangle(5,10);
        System.out.println("rectangle.width "+ rectangle.getWidth());
        System.out.println("rectangle.length "+ rectangle.getLength());
        System.out.println("rectangle.area "+ rectangle.getArea());
        Cubiod cubiod =new Cubiod(5,10,5);
        System.out.println("Cuboid.width "+ cubiod.getWidth());
        System.out.println("Cuboid.length "+ cubiod.getLength());
        System.out.println("Cuboid.area "+ cubiod.getArea());
        System.out.println("Cuboid.height "+ cubiod.getHeight());
        System.out.println("Cuboid.volume "+ cubiod.getVolume());

    }
}
