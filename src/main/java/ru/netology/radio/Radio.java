package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int soundVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        } else currentRadioStation = 0;

    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else currentRadioStation = 9;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 10) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 10) {
            soundVolume++;
        } else soundVolume = 0;
    }

    public void reduceVolume() {
        if (soundVolume > 0) {
            soundVolume--;
        } else soundVolume = 10;
    }
}
