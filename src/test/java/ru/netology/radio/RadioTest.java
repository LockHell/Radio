package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    void testMeaning4() {

        Radio rad = new Radio(10);

        rad.setCurrentStation(4);

        Assertions.assertEquals(4, rad.getCurrentStation());
    }

    @Test
    void testMeaning11() {

        Radio rad = new Radio(10);

        rad.setCurrentStation(11);

        Assertions.assertEquals(0, rad.getCurrentStation());

    }

    @Test
    void testMeaning0() {

        Radio rad = new Radio(10);

        rad.setCurrentStation(0);

        Assertions.assertEquals(0, rad.getCurrentStation());

    }

    @Test
    void testMeaningMaxStation() {

        Radio rad = new Radio(10);

        rad.getMaxStation();

        Assertions.assertEquals(9, rad.getMaxStation());

    }

    @Test
    void testMeaningMaxVolume() {

        Radio rad = new Radio();

        rad.getMaxVolume();

        Assertions.assertEquals(100, rad.getMaxVolume());

    }


    @Test
    void testMeaningMinusOne() {

        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        int actual = rad.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void testMeaningZero() {

        Radio rad = new Radio();
        rad.setCurrentStation(0);

        int actual = rad.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMeaningOne() {

        Radio rad = new Radio();
        rad.setCurrentStation(1);

        int actual = rad.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMeaningEight() {

        Radio rad = new Radio();
        rad.setCurrentStation(8);

        int actual = rad.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMeaningNine() {

        Radio rad = new Radio();
        rad.setCurrentStation(9);

        int actual = rad.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMeaningTen() {

        Radio rad = new Radio();
        rad.setCurrentStation(10);

        int actual = rad.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNextStationMeaningOne() {

        Radio rad = new Radio();
        rad.setCurrentStation(1);

        rad.next();

        int actual = rad.getCurrentStation();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void testNextStationMeaningEight() {

        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.next();

        int actual = rad.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void testNextStationMeaningNine() {

        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.next();

        int actual = rad.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNextStationMeaningZero() {

        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.next();

        int actual = rad.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void testPrevStationMeaningZero() {

        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prev();

        int actual = rad.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPrevStationMeaningOne() {

        Radio rad = new Radio();
        rad.setCurrentStation(1);

        rad.prev();

        int actual = rad.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPrevStationMeaningNine() {

        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.prev();

        int actual = rad.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPrevStationMeaningEight() {

        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.prev();

        int actual = rad.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPrevStationMeaningTen() {

        Radio rad = new Radio();
        rad.setCurrentStation(10);

        rad.prev();

        int actual = rad.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPrevStationNegativeMeaning() {

        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        rad.prev();

        int actual = rad.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testVolumeMinusOne() {

        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testVolumeZero() {

        Radio rad = new Radio();

        rad.setCurrentVolume(0);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testVolumeOne() {

        Radio rad = new Radio();

        rad.setCurrentVolume(1);

        int actual = rad.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testVolumeNinetyNine() {

        Radio rad = new Radio();

        rad.setCurrentVolume(99);

        int actual = rad.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testVolumeOneHundred() {

        Radio rad = new Radio();

        rad.setCurrentVolume(100);

        int actual = rad.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testVolumeOneHundredAndOne() {

        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIncreaseVolume0() {

        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIncreaseVolume100() {

        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIncreaseVolumeMeaningOne() {

        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testIncreaseVolumeMeaningNinetyNine() {

        Radio rad = new Radio();
        rad.setCurrentVolume(99);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDecreaseVolumeMeaningOneHundred() {

        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDecreaseVolumeMeaningZero() {

        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDecreaseVolumeMeaningOne() {

        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDecreaseVolumeMeaningNinetyNine() {

        Radio rad = new Radio();
        rad.setCurrentVolume(99);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 98;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDecreaseVolumeMeaningOneHundredAndOne() {

        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDecreaseVolumeMeaningNegativeMeaning() {

        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}