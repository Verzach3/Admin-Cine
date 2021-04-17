package com.thepanas.CineAdmin.Types.Rooms;

import com.thepanas.CineAdmin.GUILib.TSeat;

public class Room {

    public int seatsAmount;

    TSeat[] seats;

   public void changeStatus(int index, Boolean status){
        seats[index].checked = status;
   }



}
