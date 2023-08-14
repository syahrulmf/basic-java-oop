import childs.Item;
import parents.Product;

public class Main {
  public static void main(String[] args) {
//    Product product1 = new Product(); // Tidak dapat langsung menjadi object karena class product adalah abstract

    Product product2 = new Item();

    product2.setName("Tas");

  }
}
