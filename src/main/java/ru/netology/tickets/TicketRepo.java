package ru.netology.tickets;

public class TicketRepo {

    private TicketInfo[] tickets = new TicketInfo[0];


    public void save(TicketInfo ticket) {

        int length = tickets.length + 1;
        TicketInfo[] tmp = new TicketInfo[length];

        System.arraycopy(tickets, 0, tmp, 0, tickets.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = ticket;
        tickets = tmp;

    }


    public void addTicket(TicketInfo ticket) {
        TicketInfo[] tmp = new TicketInfo[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length -1] = ticket;
        tickets = tmp;


    }


    public TicketInfo[] findAll() {
        return tickets;
    }


    public TicketInfo findById(int id) {
        for (TicketInfo ticket : tickets) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        return null;
    }


    public void removeById(int id) {
        int length = tickets.length - 1;
        TicketInfo[] tmp = new TicketInfo[length];
        int index = 0;
        for (TicketInfo ticket : tickets) {
            if (ticket.getId() != id) {
                tmp[index] = ticket;
                index++;
            }

        }
        tickets = tmp;

    }







}
