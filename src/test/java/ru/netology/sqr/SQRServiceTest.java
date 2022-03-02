package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void squareNumber() {
        SQRService service = new SQRService();
        int num = 0;
        int expected = 3;

        int actual = service.squareNumber(num);
        assertEquals(expected, actual);
    }

    @Test
    void testSquareNumber1() {
        SQRService service = new SQRService();
        int num = 0;
        int expected = 9;

        int actual = service.squareNumber1(num);
        assertEquals(expected, actual);
    }

    @Test
    void testSquareNumber2() {
        SQRService service = new SQRService();
        int num = 0;
        int expected = 26;

        int actual = service.squareNumber2(num);
        assertEquals(expected, actual);
    }

    @Test
    void testSquareNumber3() {
        SQRService service = new SQRService();
        int num = 0;
        int expected = 5;

        int actual = service.squareNumber3(num);
        assertEquals(expected, actual);
    }

    @Test
    void testSquareNumber4() {
        SQRService service = new SQRService();
        int num = 0;
        int expected = 2;

        int actual = service.squareNumber4(num);
        assertEquals(expected, actual);
    }
}

