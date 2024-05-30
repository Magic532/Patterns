package ru.mayorov.proxy;

public class ConnectDatabaseProxy implements ConnectDatabase{
    private ConnectDatabaseImpl connectDatabase;

    public ConnectDatabaseProxy(ConnectDatabaseImpl connectDatabase){
        this.connectDatabase = connectDatabase;
    }
    @Override
    public String connect() {
            String connectDB = "localhost:port/" + connectDatabase.connect();
            return connectDB;
    }
}
