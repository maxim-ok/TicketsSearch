package ru.netology.tickets;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TicketInfoTest {

    TicketManger manager = new TicketManger();
    TicketRepo repo = new TicketRepo();


    TicketInfo flight1 = new TicketInfo(1, 19_000, "LAX", "DME", 600);
    TicketInfo flight2 = new TicketInfo(2, 25_000, "JFK", "LHR", 420);
    TicketInfo flight3 = new TicketInfo(3, 5_000, "LED", "SVO", 90);
    TicketInfo flight4 = new TicketInfo(4, 180_000, "LAX", "DME", 480);
    TicketInfo flight5 = new TicketInfo(5, 14_000, "LAX", "DME", 180);


    @Test
    public void shouldFindIAndSortIfConsist() {


        repo.save(flight1);
        repo.save(flight2);
        repo.save(flight3);
        repo.save(flight4);
        repo.save(flight5);



        manager.findTickets("LAX", "DME");

        TicketInfo[] actual = manager.findTickets("LAX", "DME");
        TicketInfo[] expected = {flight5, flight1, flight4};

        assertArrayEquals(expected, actual);

    }


    @Test
    public void shouldFindAndSortIfEmpty() {


        repo.save(flight1);
        repo.save(flight2);
        repo.save(flight3);
        repo.save(flight4);
        repo.save(flight5);


        manager.findTickets("SVO", "OMS");

        TicketInfo[] actual = manager.findTickets("SVO", "OMS");
        TicketInfo[] expected = {};

        assertArrayEquals(expected, actual);
    }




}
