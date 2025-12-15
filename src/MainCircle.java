public class MainCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Radius : " + c1.getRadius());
        System.out.println("Area : " + c1.getArea());
        Circle c2 = new Circle(5);
        System.out.println("Radius : " + c2.getRadius());
        System.out.println("Area : " + c2.getArea());

        // thay đổi giá trị  c1
        c1.setRadius(5);
        System.out.println("Radius : " + c1.getRadius());
        System.out.println("Area : " + c1.getArea());
        c1.setColor("Blue");

        // thay đổi giá trị c2
        c2.setRadius(3.5);
        System.out.println("Radius : " + c2.getRadius());
        System.out.println("Area : " + c2.getArea());
        c2.setColor("Green");

    }
}
