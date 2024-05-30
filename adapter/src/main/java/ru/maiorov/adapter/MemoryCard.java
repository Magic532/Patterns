package ru.maiorov.adapter;

public class MemoryCard implements MemoryCardReader{
    @Override
    public void readInfo() {
        System.out.println("Читаю информацию с Карты памяти");
    }
}
