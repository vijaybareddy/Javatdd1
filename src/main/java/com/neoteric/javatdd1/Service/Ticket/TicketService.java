package com.neoteric.javatdd1.Service.Ticket;

import com.neoteric.javatdd1.model.Ticket.Ticket;
import com.neoteric.javatdd1.model.Ticket.TicketFrom;

public class TicketService {
    public TicketFrom getTicket(Ticket ticketFrom) {
        TicketFrom ticketFrom1 = null;

        if (ticketFrom.availability == "Yes") {
            ticketFrom1 = new TicketFrom();

            ticketFrom1.MovieName = ticketFrom.movieName;
            ticketFrom1.price = ticketFrom.ticketPrice;
            ticketFrom1.seatAndRow = "A(1-4)";
        }

        return ticketFrom1;
    }
}
