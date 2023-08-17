import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
  @Test
  public void shouleSetRadioStation() {  //текущая радиостанция от 0 до
      Radio radio = new Radio();
      radio.setСurrentRadioStation(10);

     int expected = 9;
     int actual = radio.getCurrentRadioStation();

      Assertions.assertEquals(expected, actual);
 }

    @Test
    public void shouleSetRadioStationNext() { //следующая радиостанция
        Radio radio = new Radio();
        radio.setСurrentRadioStation(9);
        radio.setСurrentRadioStationNext();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetRadioStationPrev() { //предыдущая радиостанция
        Radio radio = new Radio();
        radio.setСurrentRadioStation(0);
        radio.setСurrentRadioStationPrev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

 //@Test
 //public void shouldSetToMaxRadioStation() {
    //    Radio radio= new Radio();

    // radio.setСurrentRadioStation(12);
    //  int expected = 0;
     //  int actual = radio.getCurrentRadioStation();

    //  Assertions.assertEquals(expected, actual);
   //}

  @Test
   public void shouldSetStationMoreMax() { //выбор станции больше Max
    Radio radio = new Radio();

     radio.setСurrentRadioStation(10);
      radio.setСurrentRadioStationMax();
    int expected = 9;
    int actual = radio.getCurrentRadioStation();

   Assertions.assertEquals(expected, actual);
   }

@Test
public void setStationLessMin() {   //выбор станции меньше Min
    Radio radio = new Radio();
    radio.setCurrentRadioStationMin(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
        }
}

