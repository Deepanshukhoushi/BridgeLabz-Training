package com.linkedlist.circular.taskschedular;

class TaskCircularLinkedList {

    private TaskNode head;
    private TaskNode current;

    /* Add at Beginning */
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
        System.out.println("Task added at beginning.");
    }

    /* Add at End */
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        System.out.println("Task added at end.");
    }

    /* Add at Position */
    public void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Task added at position " + pos);
    }

    /* Remove by Task ID */
    public void removeById(int id) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = null;

        do {
            if (temp.taskId == id) {

                // Only one node
                if (temp == head && temp.next == head) {
                    head = current = null;
                }
                // Removing head
                else if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                // Removing middle or last
                else {
                    prev.next = temp.next;
                }

                if (current == temp) {
                    current = temp.next;
                }

                System.out.println("Task removed.");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Task not found.");
    }

    /* View Current Task and Move to Next */
    public void viewNextTask() {
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }

        displayTask(current);
        current = current.next;
    }

    /* Display All Tasks */
    public void displayAll() {
        if (head == null) {
            System.out.println("No tasks in scheduler.");
            return;
        }

        TaskNode temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    /* Search by Priority */
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with this priority.");
        }
    }

    private void displayTask(TaskNode t) {
        System.out.println("------------------------");
        System.out.println("Task ID   : " + t.taskId);
        System.out.println("Task Name : " + t.taskName);
        System.out.println("Priority  : " + t.priority);
        System.out.println("Due Date  : " + t.dueDate);
    }
}
