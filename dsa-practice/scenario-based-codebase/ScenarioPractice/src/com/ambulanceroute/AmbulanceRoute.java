package com.ambulanceroute;

class AmbulanceRoute {
    private HospitalUnit head = null;

    public void addUnit(String name) {
        HospitalUnit newUnit = new HospitalUnit(name);

        if (head == null) {
            head = newUnit;
            head.next = head;
            return;
        }

        HospitalUnit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newUnit;
        newUnit.next = head;
    }

    public void displayUnits() {
        if (head == null) {
            System.out.println("No hospital units available.");
            return;
        }

        HospitalUnit temp = head;
        do {
            System.out.print(temp.name + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Emergency)");
    }

    public void findAvailableUnit() {
        if (head == null) {
            System.out.println("No units in the system.");
            return;
        }

        HospitalUnit temp = head;
        do {
            if (temp.available) {
                System.out.println("Patient redirected to: " + temp.name);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println(" No available units right now!");
    }

    public void markUnavailable(String name) {
        HospitalUnit temp = head;
        do {
            if (temp.name.equalsIgnoreCase(name)) {
                temp.available = false;
                System.out.println(name + " marked as unavailable.");
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void removeUnit(String name) {
        if (head == null) return;

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        do {
            if (curr.name.equalsIgnoreCase(name)) {
                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        HospitalUnit last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                }
                System.out.println(name + " removed (under maintenance).");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }
}