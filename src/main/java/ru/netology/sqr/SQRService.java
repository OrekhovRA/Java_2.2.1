package ru.netology.sqr;

public class SQRService {
    public int squareNumber(int counter) {

        for (int i = 14; i <= 99; i++) {
            if (i * i >= 200) {
                if (i * i <= 300) {
                    counter++;
                    System.out.println(counter);
                }
            }
        }
        return counter;
    }
}


