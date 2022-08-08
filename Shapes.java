public class Shapes {

  double s1, s2, s3;
  String name;

  Shapes(double side) {
    s1 = side;
    name = "square";
  }

  Shapes(int radius) {
    s1 = radius;
    name = "circle";
  }

  Shapes(double length, double breadth) {
    s1 = length;
    s2 = breadth;
    name = "rectangle";
  }

  Shapes(double side1, double side2, double side3) {
    s1 = side1;
    s2 = side2;
    s3 = side3;
    name = "triangle";
  }

  public void perimeter() {
    double perimeter = 0;
    if (name.equals("square")) {
      perimeter = s1 * 4;
    } else if (name.equals("rectangle")) {
      perimeter = (s1 + s2) * 2;
    } else if (name.equals("triangle")) {
      perimeter = s1 + s2 + s3;
    } else if (name.equals("circle")) {
      perimeter = 2 * 3.14 * (double) s1;
    }
    System.out.println("The perimeter of the " + name + " is: " + perimeter + " units.");
  }

  public static void main(String[] args) {
    Shapes obj1 = new Shapes(4.0);
    Shapes obj2 = new Shapes(2.0, 3.0);
    Shapes obj3 = new Shapes(4.0, 5.0, 6.0);
    Shapes obj4 = new Shapes(4);
    obj1.perimeter();
    obj2.perimeter();
    obj3.perimeter();
    obj4.perimeter();
  }
}
