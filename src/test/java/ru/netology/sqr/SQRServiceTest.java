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
}

