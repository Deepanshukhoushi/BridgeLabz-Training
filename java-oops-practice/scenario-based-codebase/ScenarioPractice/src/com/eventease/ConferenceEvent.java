package com.eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String name, String location, String date,
                           int attendees, User organizer,
                           double venueCost, double serviceCost) {
        super(name, location, date, attendees, organizer, venueCost, serviceCost, 1000);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with professional setup ");
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled");
    }
}
