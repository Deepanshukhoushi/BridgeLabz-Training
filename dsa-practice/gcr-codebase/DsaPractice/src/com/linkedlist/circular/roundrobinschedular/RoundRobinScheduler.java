package com.linkedlist.circular.roundrobinschedular;

class RoundRobinScheduler {

    private ProcessNode head;
    private int timeQuantum;
    private int processCount = 0;

    RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    /* Add process at end */
    public void addProcess(int id, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(id, burstTime, priority);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            ProcessNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        processCount++;
        System.out.println("Process added.");
    }

    /* Execute Round Robin Scheduling */
    public void execute() {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        ProcessNode current = head;
        int currentTime = 0;

        System.out.println("\n--- Starting Round Robin Scheduling ---");

        while (processCount > 0) {

            displayQueue();

            if (current.remainingTime > 0) {
                int executedTime = Math.min(timeQuantum, current.remainingTime);
                current.remainingTime -= executedTime;
                currentTime += executedTime;

                // Update waiting time of other processes
                ProcessNode temp = head;
                do {
                    if (temp != current && temp.remainingTime > 0) {
                        temp.waitingTime += executedTime;
                    }
                    temp = temp.next;
                } while (temp != head);

                // If process completed
                if (current.remainingTime == 0) {
                    current.turnaroundTime = currentTime;
                    System.out.println("Process " + current.processId + " completed.");
                    removeProcess(current.processId);
                }
            }

            current = current.next;
        }

        calculateAverages();
    }

    /* Remove completed process */
    private void removeProcess(int id) {
        if (head == null) return;

        ProcessNode temp = head;
        ProcessNode prev = null;

        do {
            if (temp.processId == id) {

                if (temp == head && temp.next == head) {
                    head = null;
                } else if (temp == head) {
                    ProcessNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }

                processCount--;
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);
    }

    /* Display queue */
    public void displayQueue() {
        if (head == null) return;

        System.out.println("\nCurrent Queue:");
        ProcessNode temp = head;
        do {
            System.out.println("P" + temp.processId +
                    " | Remaining: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != head);
    }

    /* Calculate Average Waiting & Turnaround Time */
    private void calculateAverages() {
        double totalWT = 0, totalTAT = 0;
        int completed = 0;

        ProcessNode temp = head;
        if (temp == null) return;

        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnaroundTime;
            completed++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("\n--- Scheduling Complete ---");
        System.out.println("Average Waiting Time = " + (totalWT / completed));
        System.out.println("Average Turnaround Time = " + (totalTAT / completed));
    }
}

