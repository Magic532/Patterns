package ru.mayorov.factory;

public class Americano extends Coffee{
    @Override
    public void makeCoffee(){
        System.out.println("Готовится Американо, хороший выбор!");
    }
}
