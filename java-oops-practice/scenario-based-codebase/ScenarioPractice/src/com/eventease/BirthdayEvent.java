package com.eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String name, String location, String date,
                         int attendees, User organizer,
                         double venueCost, double serviceCost) {
        super(name, location, date, attendees, organizer, venueCost, serviceCost, 500);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Event scheduled with fun activities ");
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday Event cancelled");
    }
}
