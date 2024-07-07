package com.neoteric.javatdd1;

import org.junit.jupiter.api.Test;

public class TicketTest {
    @Test
    public void TicketTest(){
        MovieTicket movieTicket=new MovieTicket();
        movieTicket.MovieName="KalKi";
        movieTicket.price=350;
        movieTicket.seatNumber="F6,f7,f8";
        movieTicket.NoOfTicket=3;
        movieTicket.PayMeant="1050";
        System.out.println("Ticket");
        System.out.println("Kalki");
        System.out.println(350);
        System.out.println(3);
        System.out.println("f6,7,8");
        System.out.println(1050);


    }
}
