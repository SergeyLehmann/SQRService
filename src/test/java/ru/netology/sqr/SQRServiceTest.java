package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class SQRServiceTest {
    @Test
    public void calcSquaresFound() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.countSquares(200, 300);

        assertEquals(expected,
                actual);
    }

    @Test
    public void calcSquaresNotFound() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.countSquares(257, 288);

        assertEquals(expected,
                actual);
    }

    @Test
    public void calcSquaresTwoFound() {
        SQRService service = new SQRService();
        int expected = 2;
        int actual = service.countSquares(224, 257);

        assertEquals(expected,
                actual);
    }

    @Test
    public void calcSquaresOneFound() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.countSquares(255, 287);

        assertEquals(expected,
                actual);
    }


}