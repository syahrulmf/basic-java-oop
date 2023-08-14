import interfaces.Phone;

public class PhoneUser {
  private Phone phone;

  public PhoneUser(Phone phone) {
    this.phone = phone;
  }

  public void turnOnThePower() {
    this.phone.powerOn();
  }

  public void turnOffThePower() {
    this.phone.powerOff();
  }

  public void makePhoneLouder() {
    this.phone.volumeUp();
  }

  public void makePhoneSilent() {
    this.phone.volumeDown();
  }

//  Getter and Setter
  public Phone getPhone() {
    return this.phone;
  }

  public void setPhone(Phone phone) {
    this.phone = phone;
  }
}
