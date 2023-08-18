public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }
    public int getCurrentVolume() {
      return currentVolume;
    }
    public void setCurrentVolume(int newCorrentVolume) {
        if (newCorrentVolume > 100) {
            return;
        }
        if (newCorrentVolume < 0) {
            return;
        }
        currentVolume= newCorrentVolume;
    }
    public void currentVolumeNext() {
        if (currentVolume > 100) {
            currentVolume = currentVolume + 1;
        } else {
           currentVolume = 0;
       }
    }
    public void setСurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextCurrentRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1; //(int newCurrentRadioStation) {
        } else {
            currentRadioStation = 0;
        }
    }

    public void setСurrentRadioStationPrev() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1; //(int newCurrentRadioStation) {

        } else {
            currentRadioStation = 9;
        }
    }

    public void setCurrentRadioStationMin() {
        currentRadioStation = 0;
    }

    public void setСurrentRadioStationMax() {
        currentRadioStation = 9;
    }
}




