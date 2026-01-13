package com.trafficmanager;
public class Roundabout {
    private VehicleNode head = null;
    public void addVehicle(String number) {
        VehicleNode newNode = new VehicleNode(number);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        VehicleNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    public void removeVehicle(String number) {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        VehicleNode curr = head;
        VehicleNode prev = null;

        do {
            if (curr.vehicleNumber.equals(number)) {

                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        VehicleNode last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                }

                System.out.println("Vehicle removed: " + number);
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Vehicle not found");
    }

    public void display() {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        System.out.print("Roundabout: ");
        VehicleNode temp = head;

        do {
            System.out.print(temp.vehicleNumber + " → ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to start)");
    }

    public boolean isEmpty() {
        return head == null;
    }
}
