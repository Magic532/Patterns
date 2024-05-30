package ru.maiorov.adapter;

public class MemoryCardAdapter implements ReaderUSB{
    private final MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard){
        this.memoryCard = memoryCard;
    }
    @Override
    public void readInfo(){
        memoryCard.readInfo();
    }
}
