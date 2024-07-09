package com.neoteric.javatdd1.Service.Ticket;

import com.neoteric.javatdd1.Service.Ticket.TicketService;
import com.neoteric.javatdd1.model.Ticket.Ticket;
import com.neoteric.javatdd1.model.Ticket.TicketFrom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketTest {
    @Test
    public void Test(){

        Ticket ticketFrom=new Ticket();
        ticketFrom.ticketPrice=400;
        ticketFrom.NoOfTicket=4;
        ticketFrom.movieName="kakli";
        ticketFrom.date="8-07-2024";
        ticketFrom.screenName="AAA";
        ticketFrom.availability="Yes";

        TicketService service=new TicketService();
        service.getTicket(ticketFrom);

        TicketFrom ticketFrom1=service.getTicket(ticketFrom);
        Assertions.assertEquals(400,ticketFrom1.price);
        Assertions.assertNotNull(ticketFrom1.seatAndRow);
        //System.out.println(service.getTicket(ticketFrom));
    }
}
