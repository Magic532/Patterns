package ru.mayorov.singelton;

import ru.mayorov.factory.SingeltonLog;

public class Main {
    public static void main(String[] args) {
        SingeltonLog classLogg = SingeltonLog.getInstance();
        SingeltonLog classLogg1 = SingeltonLog.getInstance();

        System.out.println(classLogg.classLogg(new Object(), "Some info"));
        System.out.println(classLogg1.classLogg(new String(), "Other some info"));
    }
}