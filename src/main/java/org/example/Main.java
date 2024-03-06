package org.example;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please stores the ID of the event");
        String eventID = scanner.next();
        System.out.println("Please stores the name of the event");
        String eventName = scanner.next();
        System.out.println("Please stores the venue of the event");
        String eventVenue = scanner.next();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String eventDate = dtf.format(java.time.LocalDate.now());
        Event event = new Event(eventID, eventName, eventVenue, eventDate);
        event.organizeEvent();
        System.out.println("Displaying the eventID of the event : " + event.getEventID());
        System.out.println("Displaying the eventName of the event : " + event.getEventName());
        System.out.println("Displaying the eventVenue of the event : " + event.getEventVenue());
        System.out.println("Displaying the eventDate of the event : " + event.getEventDate());
        System.out.println("Displaying the eventAttendees of the event");
        System.out.println(Event.eventAttendees);
        System.out.println("Displaying the name of the event");
        for (String eventAttendee : Event.eventAttendees) {
            System.out.println(eventAttendee);
        }
    }
}
