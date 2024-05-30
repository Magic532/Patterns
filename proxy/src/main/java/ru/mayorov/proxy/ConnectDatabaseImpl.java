package ru.mayorov.proxy;

import java.util.Arrays;
import java.util.List;

public class ConnectDatabaseImpl implements ConnectDatabase{

    public final static String DB = "nameDB";
    @Override
    public String connect() {
        return DB;
    }
}
