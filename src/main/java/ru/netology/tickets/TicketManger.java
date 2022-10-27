package ru.netology.tickets;

import java.util.Arrays;
import java.util.Objects;

public class TicketManger {


    public TicketInfo[] findTickets(String departurePort, String arrivalPort) {
        TicketInfo[] ans = new TicketInfo[0];
        for (TicketInfo ticket : TicketRepo.tickets) {
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