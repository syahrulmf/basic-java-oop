public class Teacher extends Person{
  String subject;

  public Teacher(){}

  public Teacher(String name, String address, String subject){
    super(name, address);
    this.subject = subject;
  }

  void teaching() {
    System.out.println("I can teach " + subject + ", so eanyone how wants to learn can talk to me.");
  }

  /**
   * Overridie Method / Method yang di deklarasukan ulang dari parent class
   */
  void greeting() {
    super.greeting();
    System.out.println("My job is a " + subject + " teacher");
  }
}
