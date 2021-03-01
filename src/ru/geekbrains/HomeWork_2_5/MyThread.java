package ru.geekbrains.HomeWork_2_5;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }
    public void firstHalf(float a1[]) {
        for (int i = 0; i < a1.length; i++) {
            a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) *
                    Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public void secondHalf(float a2[]) {
        for (int i = 0; i < a2.length; i++) {
            a2[i] = (float)(a2[i] * Math.sin(0.2f + (i + 5000000) / 5) *
                    Math.cos(0.2f + (i + 5000000) / 5) * Math.cos(0.4f + (i + 5000000) / 2));
        }
    }

}
