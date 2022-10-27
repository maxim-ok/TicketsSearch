package ru.netology.tickets;

import java.util.Objects;

public class TicketInfo implements Comparable<TicketInfo> {

    private int id;
    private int price;
    private String departurePort;
    private String arrivalPort;
    private int duration;

    public TicketInfo(int id, int price, String departurePort, String arrivalPort, int duration) {
        this.id = id;
        this.price = price;
        this.departurePort = departurePort;
        this.arrivalPort = arrivalPort;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public String getArrivalPort() {
        return arrivalPort;
    }

    public int getDuration() {
        return duration;
    }


    @Override
    public int compareTo(TicketInfo otherFlight) {
        if (price < otherFlight.price) {
            return -1;

        }
        if (price > otherFlight.price) {
            return 1;

        }
        return 0;

    }

    @Override
    public String toString(){

        return arrivalPort;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketInfo that = (TicketInfo) o;
        return id == that.id && price == that.price && duration == that.duration && Objects.equals(departurePort, that.departurePort) && Objects.equals(arrivalPort, that.arrivalPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, departurePort, arrivalPort, duration);
    }
}
