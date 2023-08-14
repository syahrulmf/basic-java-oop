public class Categories {
  private int id;
  private String name;
  private boolean expensive;

  public Categories(){
    super();
  }
  public Categories(int id, String name, boolean expensive) {
    super();
    this.id = id;
    this.name = name;
    this.expensive = expensive;
  }

  /**
   * Contoh Getter dan Setter ipe data booolean
   */

//  Getter
  public boolean isExpensive() {
    return this.expensive;
  }

//  Setter
  public void setExpensive(boolean expensive) {
    this.expensive = expensive;
  }

  /**
   * Contoh Getter dan Setter ipe data Object
   *
   */

//  Getter
  public String getName() {
    return this.name;
  }

//  Setter
  public void setName(String name) {
    this.name = name;
  }
}
