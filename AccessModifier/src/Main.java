import childs.Doctor;
import childs.Programmer;
import childs.Teacher;
import parents.Person;

public class Main {
  public static void main(String[] args) {
    Person person1 = new Programmer("Syahrul", "Bandung", ".NET");
    Person person2 = new Doctor("Eko", "Jakarta", "THT");
    Person person3 = new Teacher("Panda", "Bandung", "MTK");
    person1.greeting();

//    Recasting / Konversi tipedata objek person ke programmer
    System.out.println(((Programmer)person1).technology);

    sayHello(person1);
    sayHello(person2);
    sayHello(person3);
  }

  static void sayHello(Person person){
    String message;

    if (person instanceof Programmer){
      Programmer programmer = (Programmer) person;
      message = "Hello, " + programmer.name + ". Seorang childs.Programmer " + programmer.technology + ".";
    } else if (person instanceof Doctor){
      Doctor doctor = (Doctor) person;
      message = "Hello, " + doctor.name + ". Seorang childs.Doctor " + doctor.specialist + ".";
    } else if (person instanceof Teacher){
      Teacher teacher = (Teacher) person;
      message = "Hello, " + teacher.name + ". Seorang Guru " + teacher.subject + ".";
    } else {
      message = "Hello, " + person.name + ".";
    }

    System.out.println(message);
  }
}
