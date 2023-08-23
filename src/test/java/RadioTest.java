import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest() {

  @Test
  public void shouleSetRadioStation() {  //текущая радиостанция от 0 до
      Radio radio = new Radio();
      radio.setСurrentRadioStation(9);

     int expected = 9;
     int actual = radio.getCurrentRadioStation();

      Assertions.assertEquals(expected, actual);
 }

    @Test
    public void shouleNextStation() { //следующая радиостанция
        Radio radio = new Radio();
        radio.setСurrentRadioStation(10);
        radio.nextCurrentRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


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
    radio.setСurrentRadioStation(-2);
    radio.setCurrentRadioStationMin();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
        }
   // @Test
    //public void shouleSetRadioStationPrevAfterMin() { //предыдущая радиостанция после Min
       // Radio radio = new Radio();
        //radio.setСurrentRadioStation(0);
       // radio.setСurrentRadioStation();
       // int expected = 9;
        //int actual = radio.getCurrentRadioStation();

       // Assertions.assertEquals(expected, actual);
   // }
  @Test
    public void shouleSetRadioStationNextAfterMax() { //следующая радиостанция после Max
        Radio radio = new Radio();
        radio.setСurrentRadioStation(9);
        radio.setСurrentRadioStationMax();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}

