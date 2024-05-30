package ru.maiorov.adapter;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        USB usb = new USB();
        computer.connect(usb);
        usb.readInfo();

        MemoryCard memoryCard = new MemoryCard();
        MemoryCardAdapter memoryCardAdapter = new MemoryCardAdapter(memoryCard);
        computer.connect(memoryCardAdapter);
        memoryCard.readInfo();
    }
}