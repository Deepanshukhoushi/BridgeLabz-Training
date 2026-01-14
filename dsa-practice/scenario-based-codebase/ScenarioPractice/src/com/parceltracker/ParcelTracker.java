package com.parceltracker;
class ParcelTracker {
    private StageNode head;

    public void addStage(String stage) {
        StageNode newNode = new StageNode(stage);

        if (head == null) {
            head = newNode;
            return;
        }

        StageNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void addCheckpoint(String afterStage, String newStage) {
        StageNode current = head;

        while (current != null && !current.stage.equals(afterStage)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Stage not found!");
            return;
        }

        StageNode checkpoint = new StageNode(newStage);
        checkpoint.next = current.next;
        current.next = checkpoint;
    }

    // Track parcel forward
    public void trackParcel() {
        if (head == null) {
            System.out.println("No parcel data available.");
            return;
        }

        StageNode current = head;
        while (current != null) {
            System.out.print(current.stage);

            if (current.next != null) {
                System.out.print(" → ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public void checkLostParcel() {
        StageNode current = head;

        while (current != null) {
            if (current.stage.equals("Delivered")) {
                System.out.println("Parcel delivered successfully.");
                return;
            }
            current = current.next;
        }

        System.out.println("Parcel status lost or incomplete!");
    }
}

/*
 * ParcelTracker – Delivery Chain Management (Singly Linked List) Story: A
 * courier company tracks parcels through stages like Packed → Shipped → In
 * Transit → Delivered. Each stage is a node in a Singly Linked List.
 * Requirements: ● Forward tracking through stages. ● Add custom intermediate
 * checkpoints. ● Handle lost/missing parcels (null pointers).
 */

