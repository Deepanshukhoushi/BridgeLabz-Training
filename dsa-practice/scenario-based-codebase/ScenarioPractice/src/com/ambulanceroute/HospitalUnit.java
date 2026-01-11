package com.ambulanceroute;

class HospitalUnit {
    String name;
    boolean available;
    HospitalUnit next;

    HospitalUnit(String name) {
        this.name = name;
        this.available = true; 
        this.next = null;
    }
}