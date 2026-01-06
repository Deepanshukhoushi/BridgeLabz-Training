package com.eventease;

public abstract class Event implements ISchedulable {

    private final int eventId; 
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private double venueCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    private static int idCounter = 1000;

    public Event(String eventName, String location, String date,
                 int attendees, User organizer, double venueCost) {
        this.eventId = ++idCounter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.venueCost = venueCost;
        this.serviceCost = 0;
        this.discount = 0;
    }

    public Event(String eventName, String location, String date,
                 int attendees, User organizer,
                 double venueCost, double serviceCost, double discount) {
        this(eventName, location, date, attendees, organizer, venueCost);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    protected double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }
}
