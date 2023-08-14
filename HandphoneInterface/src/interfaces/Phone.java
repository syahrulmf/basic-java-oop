package interfaces;

public interface Phone {
  int MAX_VOLUME = 100;
  int MIN_VOLUME = 0;

//  Abstract Method
  void powerOn();
  void powerOff();
  void volumeUp();
  void volumeDown();
}
