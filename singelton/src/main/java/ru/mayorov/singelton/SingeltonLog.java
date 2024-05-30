package ru.mayorov.factory;

import static java.lang.String.format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SingeltonLog{
    private static SingeltonLog singeltonLog;

    private SingeltonLog(){
    }
    public static SingeltonLog getInstance() {
        if (singeltonLog == null) {
            singeltonLog = new SingeltonLog();
        }
        return singeltonLog;
    }
    public String classLogg(Object obj, String info){
        return format("Log info: " + "%s - " + "%s - %s",
                LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                obj.getClass().getSimpleName(),
                info);
    }
}