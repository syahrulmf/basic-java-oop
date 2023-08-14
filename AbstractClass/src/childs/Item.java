package childs;

import parents.Product;

public class Item extends Product {
  private int price;

  public Item() {

  }

  public Item(String name, int price) {
    super(name);
    this.price = price;
  }

//  Implementasi Method Abstract supaya menjadi bentuk konkrit dan jelas.
  @Override
  public void printInvormation() {
    System.out.println("Product Name : " + getName());
    System.out.println("Product Price : " + getPrice());
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
