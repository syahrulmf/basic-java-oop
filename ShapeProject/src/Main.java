import childs.Circle;
import childs.Triangle;
import parents.Shape;

public class Main {
  public static void main(String[] args) {
    Shape lingkaran = new Circle("Biru", 20);
    Shape segitiga = new Triangle("Biru", 10, 11);

    System.out.println("Luas lingkaran berwarna " + lingkaran.getColor() + " adalah " + lingkaran.getArea());
    System.out.println("Luas Segitiga berwarna " + segitiga.getColor() + " adalah " + segitiga.getArea());
  }
}
