public class Radio {
    public int currentRadioStation;

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setСurrentRadioStation(int newCurrentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setСurrentRadioStationNext() {
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


   public void setСurrentRadioStationNumber() {//(int newCurrentRadioStation) {
         if (currentRadioStation > 9) {
          currentRadioStation = currentRadioStation;
       } else {
           return;
        }
          if (currentRadioStation < 0) {
         currentRadioStation = currentRadioStation;
         } else {
              return;
          }
    }
        //  currentRadioStation = currentRadioStation;
   // }

    public void setCurrentToMaxRadioStation() {
       currentRadioStation = 9;
    }
    public void setCurrentRadioStationMin(int i) {
        currentRadioStation = 0;
    }

   public void setСurrentRadioStationMax() {
      currentRadioStation = 9;
   }
}




