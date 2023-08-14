package childs;

import parents.Shape;

public class Triangle extends Shape {
  private double base;
  private double height;

  public Triangle() {
  }

  public Triangle(String color, double base, double height) {
    super(color);
    this.base = base;
    this.height = height;
  }

  @Override
  public double getArea() {
    return 0.5 * base * height;
  }
}
