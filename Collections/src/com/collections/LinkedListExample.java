package com.collections;

import java.util.LinkedList;

class TicketBookingSystem {
    private LinkedList<String> tickets; // LinkedList to store ticket bookings

    // Constructor
    public TicketBookingSystem() {
        tickets = new LinkedList<>();
    }

    // Book a ticket
    public void bookTicket(String ticket) {
        tickets.add(ticket);
        System.out.println("Ticket for " + ticket + " has been booked.");
    }

    // Cancel a ticket
    public void cancelTicket(String ticket) {
        if (tickets.remove(ticket)) {
            System.out.println("Ticket for " + ticket + " has been canceled.");
        } else {
            System.out.println("Ticket for " + ticket + " is not found in the bookings.");
        }
    }

    // View all booked tickets
    public void viewTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets booked yet.");
        } else {
            System.out.println("Booked tickets: " + tickets);
        }
    }

    // Check if a ticket is booked
    public void checkTicket(String ticket) {
        if (tickets.contains(ticket)) {
            System.out.println("Ticket for " + ticket + " is already booked.");
        } else {
            System.out.println("Ticket for " + ticket + " is not booked yet.");
        }
    }

    // Total number of booked tickets
    public void totalTickets() {
        System.out.println("Total booked tickets: " + tickets.size());
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem();

        // Booking tickets
        bookingSystem.bookTicket("Avengers");
        bookingSystem.bookTicket("Inception");
        bookingSystem.bookTicket("Spider-Man");

        // Viewing tickets
        bookingSystem.viewTickets();

        // Checking for a specific ticket
        bookingSystem.checkTicket("Inception");
        bookingSystem.checkTicket("Titanic");

        // Canceling a ticket
        bookingSystem.cancelTicket("Spider-Man");
        bookingSystem.viewTickets();

        // Total tickets booked
        bookingSystem.totalTickets();
    }
}

