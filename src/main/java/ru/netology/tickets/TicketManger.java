package ru.netology.tickets;

import java.util.Arrays;
import java.util.Objects;

public class TicketManger {

    private TicketInfo[] tickets = new TicketInfo[0];


    public void addTicket(TicketInfo ticket) {
        TicketInfo[] tmp = new TicketInfo[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;


    }


    public TicketInfo[] findNumbers(int cost, int howLong) {
        TicketInfo[] ans = new TicketInfo[0];
        for (TicketInfo ticket : tickets) {
            if (ticket.getPrice() >= cost && ticket.getDuration() <= howLong) {
                TicketInfo[] tmp = new TicketInfo[ans.length + 1];
                for (int i = 0; i < ans.length; i++) {
                    tmp[i] = ans[i];


                }
                tmp[tmp.length - 1] = ticket;
            }
        }
        return ans;
    }


    public TicketInfo[] findTickets(String departurePort, String arrivalPort) {
        TicketInfo[] ans = new TicketInfo[0];
        for (TicketInfo ticket : tickets) {
            if ((departurePort.equals(ticket.getDeparturePort())) && (arrivalPort.equals(ticket.getArrivalPort()))) {
                TicketInfo[] tmp = new TicketInfo[ans.length + 1];
                for (int i = 0; i < ans.length; i++) {
                    tmp[i] = ans[i];

                }
                tmp[tmp.length - 1] = ticket;
                ans = tmp;
            }
        }
        Arrays.sort(ans);
        // System.out.println(Arrays.toString(ans));
        return ans;
    }


}