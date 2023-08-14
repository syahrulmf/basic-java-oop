import childs.Doctor;
import childs.Programmer;
import childs.Teacher;
import parents.Person;

public class Main {
  public static void main(String[] args) {
//   Pembuatan Object
    Person person1 = new Person();
    person1.setName("Rizki");
    person1.setAddress("Bandung");

    System.out.println(person1.getName());
    System.out.println(person1.getAddress());
  }

  static void sayHello(Person person){
    String message;

    if (person instanceof Programmer){
      Programmer programmer = (Programmer) person;
      message = "Hello, " + programmer.getName() + ". Seorang childs.Programmer " + programmer.getTechnology() + ".";
    } else if (person instanceof Doctor){
      Doctor doctor = (Doctor) person;
      message = "Hello, " + doctor.getName() + ". Seorang childs.Doctor " + doctor.getSpecialist() + ".";
    } else if (person instanceof Teacher){
      Teacher teacher = (Teacher) person;
      message = "Hello, " + teacher.getName() + ". Seorang Guru " + teacher.getSubject() + ".";
    } else {
      message = "Hello, " + person.getName() + ".";
    }

    System.out.println(message);
  }
}
