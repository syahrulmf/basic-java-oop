package childs;

import parents.Person;

public class Teacher extends Person {
  private String subject;

  public Teacher(){}

  public Teacher(String name, String address, String subject){
    super(name, address);
    this.subject = subject;
  }

  public void teaching() {
    System.out.println("I can teach " + subject + ", so eanyone how wants to learn can talk to me.");
  }

  /**
   * Overridie Method / Method yang di deklarasukan ulang dari parent class
   */
  public void greeting() {
    super.greeting();
    System.out.println("My job is a " + subject + " teacher");
  }

//  Getter and Setter
  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }
}
