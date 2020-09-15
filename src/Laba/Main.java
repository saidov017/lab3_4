package Laba;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 1);
        System.out.println(point);

        point.moveUp();
        point.moveLeft();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(0, 0, 2, 1, 3);
        System.out.println(circle);

        circle.moveDown();
        circle.moveRight();
        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle(1, 1, 0, 0, 1, 1);
        System.out.println(rectangle);

        rectangle.moveUp();
        rectangle.moveLeft();
        System.out.println(rectangle);
    }

