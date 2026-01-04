package com.linkedlist.singly.inventorymanagementsystem;

class InventoryList {

    private ItemNode head;

    /* Add at beginning */
    public void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
        System.out.println("Item added at beginning.");
    }

    /* Add at end */
    public void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Item added at end.");
    }

    /* Add at position */
    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos <= 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }

        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Item added at position " + pos);
    }

    /* Remove by Item ID */
    public void removeById(int id) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed.");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found!");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed.");
        }
    }

    /* Update quantity */
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found!");
    }

    /* Search by ID */
    public void searchById(int id) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found!");
    }

    /* Search by Name */
    public void searchByName(String name) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found!");
        }
    }

    /* Total Inventory Value */
    public void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value = ₹" + total);
    }

    /* Display Inventory */
    public void displayAll() {
        if (head == null) {
            System.out.println("Inventory empty.");
            return;
        }

        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    private void displayItem(ItemNode item) {
        System.out.println("------------------------");
        System.out.println("ID       : " + item.itemId);
        System.out.println("Name     : " + item.itemName);
        System.out.println("Quantity : " + item.quantity);
        System.out.println("Price    : ₹" + item.price);
    }

    /* -------- MERGE SORT -------- */

    public void sortByName(boolean ascending) {
        head = mergeSort(head, ascending, true);
        System.out.println("Sorted by Name.");
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, ascending, false);
        System.out.println("Sorted by Price.");
    }

    private ItemNode mergeSort(ItemNode h, boolean asc, boolean byName) {
        if (h == null || h.next == null) return h;

        ItemNode middle = getMiddle(h);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null;

        ItemNode left = mergeSort(h, asc, byName);
        ItemNode right = mergeSort(nextOfMiddle, asc, byName);

        return sortedMerge(left, right, asc, byName);
    }

    private ItemNode sortedMerge(ItemNode a, ItemNode b, boolean asc, boolean byName) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (byName) {
            condition = asc ?
                    a.itemName.compareToIgnoreCase(b.itemName) <= 0 :
                    a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = asc ? a.price <= b.price : a.price > b.price;
        }

        if (condition) {
            a.next = sortedMerge(a.next, b, asc, byName);
            return a;
        } else {
            b.next = sortedMerge(a, b.next, asc, byName);
            return b;
        }
    }

    private ItemNode getMiddle(ItemNode h) {
        ItemNode slow = h, fast = h.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}