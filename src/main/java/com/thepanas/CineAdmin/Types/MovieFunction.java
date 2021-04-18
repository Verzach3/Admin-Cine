package com.thepanas.CineAdmin.Types;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MovieFunction {
    /*
    hora, fecha inicio, fecha fin, sala y tipo de
    función
     */



    String time;
    String startDate;
    String endDate;
    String roomAndType;

    public MovieFunction(){

    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setRoomAndType(String roomAndType) {
        this.roomAndType = roomAndType;
    }



    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate){
        this.endDate = endDate;
    }

    public String getTime() {
        return time;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getRoomAndType() {
        return roomAndType;
    }




}
