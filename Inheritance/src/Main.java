public class Main {
  public static void main(String[] args) {
//    Object Doctor menggunakan Constructor Default
    Doctor doctor1 = new Doctor();
    doctor1.name = "Fuadbakh";
    doctor1.address = "Bandung";
    doctor1.specialist = "Dentist";

//    Object Doctor menggunakan Costructor Berparameter
    Doctor doctor2 = new Doctor("Mamat", "Surabaya", "THT");

    System.out.println();

    doctor1.greeting();

    System.out.println();

    doctor2.greeting();
  }
}
