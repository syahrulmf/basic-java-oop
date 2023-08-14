public class MainApp {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Eko";
    person1.address = "Tegal";

    System.out.println("Name : " + person1.name);
    System.out.println("Address : " + person1.address);
    System.out.println("Country : " + person1.country);

    person1.sayHello("Padepokan 79");

    System.out.println("=========================================");

    Person person2 = new Person();
    person2.name = "Syahrulmf";
    person2.address = "Bandung";

    person2.sayHello("Padepokan 79");
    System.out.println(person2.sayAddress("Bandung"));

    System.out.println("=========================================");
    System.out.println("===== Constructor dengan 2 Parameter =====");

    Person person3 = new Person("Eko", "Bandung");
    person3.sayHello("Padepokan 79");
    System.out.println(person3.sayAddress("Bandung"));

    System.out.println("============================================");
    System.out.println("== Constructor Kosong / Default Constructor ==");

    Person person4 = new Person();
    person4.name = "Syahrul";
    person4.address = "Bandung";
 
    person4.sayHello("Padepokan 79");
    System.out.println(person4.sayAddress("Bandung"));

    System.out.println("============================================");
    System.out.println("== Constructor Dengan 1 Parameter ==");

    Person person5 = new Person("Syahrul Mubarok");
    person5.address = "Kalimantan";

    person5.sayHello("Padepokan 79");
    System.out.println(person5.sayAddress("Maluku"));

  }
}
