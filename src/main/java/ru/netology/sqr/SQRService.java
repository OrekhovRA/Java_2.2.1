package ru.netology.sqr;

public class SQRService {
    public int squareNumber(int counter) {

        for (int i = 14; i <= 99; i++) {
            if (i * i >= 200 && i * i <= 300) {
                    counter++;
                    System.out.println(counter);
                }
            }
        return counter;
    }

    public int squareNumber1(int counter) {

        for (int i = 14; i <= 99; i++) {
            if (i * i >= 250 && i * i <= 600) {
                counter++;
                System.out.println(counter);
            }
        }
        return counter;
    }

    public int squareNumber2(int counter) {

        for (int i = 14; i <= 99; i++) {
            if (i * i >= 3000 && i * i <= 6500) {
                counter++;
                System.out.println(counter);
            }
        }
        return counter;
    }

    public int squareNumber3(int counter) {
        for (int i = 14; i <= 99; i++) {
            if (i * i >= 9000 && i * i <= 10000) {
                counter++;
                System.out.println(counter);
            }
        }
        return counter;
    }

    public int squareNumber4(int counter) {
        for (int i = 14; i <= 99; i++) {
            if (i * i >= 9500 && i * i <= 11000) {
                counter++;
                System.out.println(counter);
            }
        }
        return counter;
    }
}

