package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Event {

    static ArrayList<String> eventAttendees = new ArrayList<String>();

    Scanner scanner = new Scanner(System.in);
    private String eventID;
    private String eventName;
    private String eventVenue;
    private String eventDate;


    public Event() {
    }

    public Event(String eventID, String eventName, String eventVenue, String eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
    }

    /**
     * 获取
     *
     * @return eventID
     */
    public String getEventID() {

        return eventID;
    }

    /**
     * 设置
     *
     * @param eventID
     */
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    /**
     * 获取
     *
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * 设置
     *
     * @param eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * 获取
     *
     * @return eventVenue
     */
    public String getEventVenue() {
        return eventVenue;
    }

    /**
     * 设置
     *
     * @param eventVenue
     */
    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    /**
     * 获取
     *
     * @return eventDate
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     * 设置
     *
     * @param eventDate
     */
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String toString() {
        return "Event{eventAttendees = " + eventAttendees + ", eventID = " + eventID + ", eventName = " + eventName + ", eventVenue = " + eventVenue + ", eventDate = " + eventDate + "}";
    }

    /*organizeEvent() – Handles the creation of event and its information as mentioned above. It also
    handles operations like adding, removing, updating, and finding a single attendee. The method
    should also display the total number of people attending the event*/

    public void organizeEvent() {

        loop1 : while (true) {
            System.out.println("1. Add an attendee");
            System.out.println("2. Remove an attendee");
            System.out.println("3. Update an attendee");
            System.out.println("4. Find an attendee");
            System.out.println("5. Display the name of the event");
            System.out.println("6. Exit");
            System.out.println("Please enter your choice : ");
            String choice = scanner.next();
            loop2 : switch (choice){
                case "1":
                    System.out.println("Please enter the name of the attendee : ");
                    String attendee = scanner.next();
                    eventAttendees.add(attendee);
                    System.out.println("Total number of people attending the event : " + eventAttendees.size());
                    System.out.println();
                    break loop2;
                case "2":
                    System.out.println("Please enter the name of the attendee you want to remove : ");
                    String removeAttendee = scanner.next();
                    eventAttendees.remove(removeAttendee);
                    System.out.println("Total number of people attending the event : " + eventAttendees.size());
                    System.out.println();
                    break loop2;
                case "3":
                    System.out.println("Please enter the name of the attendee : ");
                    String updateAttendee = scanner.next();
                    System.out.println("Please enter the updated name of the attendee : ");
                    String updatedAttendee = scanner.next();
                    eventAttendees.set(eventAttendees.indexOf(updateAttendee), updatedAttendee);
                    System.out.println("Total number of people attending the event : " + eventAttendees.size());
                    System.out.println();
                    break loop2;
                case "4":
                    System.out.println("Please enter the name of the attendee : ");
                    String findAttendee = scanner.next();
                    if (eventAttendees.contains(findAttendee)) {
                        System.out.println("Attendee found");
                    } else {
                        System.out.println("Attendee not found");
                    }
                    System.out.println();
                    break loop2;
                case "5":
                    System.out.println("Displaying the name of the event");
                    for (String eventAttendee : eventAttendees) {
                        System.out.println(eventAttendee);
                    }
                    System.out.println();
                    break loop2;
                case "6":
                    System.out.println("Exiting");
                    break loop1;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
