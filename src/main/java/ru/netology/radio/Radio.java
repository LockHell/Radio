package ru.netology.radio;

public class Radio {
    private int maxStation;
    private int maxVolume;
    private int currentStation;
    private int currentVolume;

    public Radio() {
        maxStation = 9;
        maxVolume = 100;

    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;

    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;

    }

    public int getCurrentStation() {
        return currentStation;
    }


    public void next() {

        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {

        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}