package com.thepanas.CineAdmin.Types;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MovieFunction {
    /*
    hora, fecha inicio, fecha fin, sala y tipo de
    función
     */

    //Tipos
    public static final int TYPE_3D = 1;

    public static final int TYPE_2D = 0;





    String time;
    String[] startDate = new String[3];
    String[] endDate = new String[3];
    String room;
    String type;

    MovieFunction(){
        Calendar c = Calendar.getInstance();

    }

    public void setStartDate(String[] startDate) {
        this.startDate = startDate;
    }

    public void setStartDate(String day, String month, String year){
        this.startDate = new String[]{day, month, year};
    }

    public void setEndDate(String[] endDate){
        this.endDate = endDate;
    }

    public String getTime() {
        return time;
    }

    public String[] getStartDate() {
        return startDate;
    }

    public String[] getEndDate() {
        return endDate;
    }

    public String getRoom() {
        return room;
    }

    public String getType() {
        return type;
    }

    public void setEndDate(String day, String month, String year){
        this.endDate = new String[] {day, month, year};
    }
}
