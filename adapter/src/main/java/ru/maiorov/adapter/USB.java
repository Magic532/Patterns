package ru.maiorov.adapter;

    public class USB implements ReaderUSB{
        @Override
        public void readInfo() {
            System.out.println("Читаю информацию с USB");
        }
    }
