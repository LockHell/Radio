package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void shouldCurrentRadioNumberMinus() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStationNumberMin() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStationNumberLimit1() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStationNumberLimit8() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMeaning9() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStationNumberOverLimit10() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStationNext2() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStationNext9() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStationNextMax() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.next();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStationNextMin() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.next();

        int actual = radio.getCurrentRadioStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStationPrev9() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStationPrev0() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStationPrev8() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.prev();

        int actual = radio.getCurrentRadioStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStationPrev7() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.prev();

        int actual = radio.getCurrentRadioStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevCurrentRadioStation10() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        radio.prev();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCurrentRadioStationPrevMinus() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        radio.prev();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetSoundVolumeMinus1() {

        Radio radio = new Radio();

        radio.setSoundVolume(-1);

        int actual = radio.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetSoundVolumeMin() {

        Radio radio = new Radio();

        radio.setSoundVolume(0);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetSoundVolumeLimit1() {

        Radio radio = new Radio();

        radio.setSoundVolume(1);

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetSoundVolumeLimit9() {

        Radio radio = new Radio();

        radio.setSoundVolume(9);

        int expected = 9;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetSoundVolumeMax() {

        Radio radio = new Radio();

        radio.setSoundVolume(10);

        int expected = 10;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetSoundVolumeLimit11() {

        Radio radio = new Radio();

        radio.setSoundVolume(11);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetSoundIncreaseVolume0() {

        Radio radio = new Radio();
        radio.setSoundVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetSoundIncreaseVolume2() {

        Radio radio = new Radio();
        radio.setSoundVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetSoundIncreaseVolumeMax() {

        Radio radio = new Radio();
        radio.setSoundVolume(9);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetSoundReduceVolume10() {

        Radio radio = new Radio();
        radio.setSoundVolume(10);

        radio.reduceVolume();

        int expected = 9;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetSoundReduceVolume0() {

        Radio radio = new Radio();
        radio.setSoundVolume(0);

        radio.reduceVolume();

        int expected = 10;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetSoundReduceVolumeMin() {

        Radio radio = new Radio();
        radio.setSoundVolume(1);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetSoundReduceVolume9() {

        Radio radio = new Radio();
        radio.setSoundVolume(9);

        radio.reduceVolume();

        int expected = 8;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}