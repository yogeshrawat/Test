package inheritance;

public class ShapeMain {

    public static void main(String[] args) {
        Rectangle square = new Square(3,3);

        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
