import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
  @Test
  public void shouleSetRadioStation() {  //текущая радиостанция от 0 до
      Radio radio = new Radio();
      radio.setСurrentRadioStation(0);

     int expected = 0;
     int actual = radio.getCurrentRadioStation();

      Assertions.assertEquals(expected, actual);
 }

    @Test
    public void shouleSetNextStation() { //следующая радиостанция
        Radio radio = new Radio();
        radio.setСurrentRadioStation(10);
        radio.nextCurrentRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolumeNext() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.currentVolumeNext();
        int expected = 11;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouleSetRadioStationPrev() { //предыдущая радиостанция
        Radio radio = new Radio();
        radio.setСurrentRadioStation(5);
        radio.setСurrentRadioStationPrev();
        int expected = 4;
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
    radio.setСurrentRadioStation(-1);
    radio.setCurrentRadioStationMin();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
        }
    @Test
    public void shouleSetRadioStationPrevAfterMin() { //предыдущая радиостанция после Min
        Radio radio = new Radio();
        radio.setСurrentRadioStation(0);
        radio.setСurrentRadioStationPrev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
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

