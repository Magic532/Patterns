package ru.mayorov.proxy;

public class Main {
    public static void main(String[] args) {
        ConnectDatabaseImpl connectDatabase = new ConnectDatabaseImpl();
        ConnectDatabaseProxy proxy = new ConnectDatabaseProxy(connectDatabase);
        System.out.println(proxy.connect());
    }
}