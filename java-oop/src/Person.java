public class Person {
  String name;
  String address;
  final String country = "Indonesia";

  /**
   * Default Constructor / Constructor kosong
   */
  Person() {

  }

  /**
   * Constructor dengan 1 parameter
   */
  Person(String paramName){
    name = paramName;
  }

  /**
   * Constructor dengan parameter
   */
  Person(String name, String address){
//    Gunakan keyword this untuk solving variable shadowing.
    this.name = name;
    this.address = address;
  }


  /**
   * Method Void / method yang tidak mengembalikan nilai / return value
   * @param paramName
   */
  void sayHello(String paramName){
    System.out.println("Hello " + paramName + ", My name is " + name);
  }

/**
 * Method yang mengembalikan nilai / return value
 */
 String sayAddress(String paramName){
   return "I, Come from " + paramName;
 }

}
