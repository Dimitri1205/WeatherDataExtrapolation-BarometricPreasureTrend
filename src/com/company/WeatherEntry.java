package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherEntry{

    //fields to be used from input files
    Date date;
    float pressure;




    public String toString(){
        DateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
        return ("Data for: " + formatter.format(date) + " Barometric Pressure: " + Float.toString(pressure));
    }
}