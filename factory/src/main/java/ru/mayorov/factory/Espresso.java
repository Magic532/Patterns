package ru.mayorov.factory;

public class Espresso extends Coffee {
    @Override
    public void makeCoffee(){
        System.out.println("Готовится Эспрессо, хороший выбор!");
    }
}
