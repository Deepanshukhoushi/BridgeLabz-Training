package com.linkedlist.singly.socialmediaconnections;

class SocialMediaList {

    private UserNode head;

    /* Add User */
    public void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
        System.out.println("User added.");
    }

    /* Find user by ID */
    private UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    /* Add Friend Connection (Two-way) */
    public void addFriendConnection(int id1, int id2) {
        UserNode user1 = findUserById(id1);
        UserNode user2 = findUserById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.friendHead = addFriend(user1.friendHead, id2);
        user2.friendHead = addFriend(user2.friendHead, id1);

        System.out.println("Friend connection added.");
    }

    private FriendNode addFriend(FriendNode head, int friendId) {
        FriendNode newNode = new FriendNode(friendId);
        newNode.next = head;
        return newNode;
    }

    /* Remove Friend Connection */
    public void removeFriendConnection(int id1, int id2) {
        UserNode user1 = findUserById(id1);
        UserNode user2 = findUserById(id2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found.");
            return;
        }

        user1.friendHead = removeFriend(user1.friendHead, id2);
        user2.friendHead = removeFriend(user2.friendHead, id1);

        System.out.println("Friend connection removed.");
    }

    private FriendNode removeFriend(FriendNode head, int friendId) {
        if (head == null) return null;

        if (head.friendId == friendId)
            return head.next;

        FriendNode temp = head;
        while (temp.next != null && temp.next.friendId != friendId) {
            temp = temp.next;
        }

        if (temp.next != null)
            temp.next = temp.next.next;

        return head;
    }

    /* Display Friends of a User */
    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        FriendNode temp = user.friendHead;
        if (temp == null) {
            System.out.println("No friends.");
            return;
        }

        while (temp != null) {
            System.out.println("Friend ID: " + temp.friendId);
            temp = temp.next;
        }
    }

    /* Find Mutual Friends */
    public void findMutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Mutual Friends:");
        FriendNode f1 = u1.friendHead;

        boolean found = false;
        while (f1 != null) {
            FriendNode f2 = u2.friendHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.println("Friend ID: " + f1.friendId);
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.println("No mutual friends.");
    }

    /* Search User */
    public void searchUserById(int id) {
        UserNode user = findUserById(id);
        if (user != null)
            displayUser(user);
        else
            System.out.println("User not found.");
    }

    public void searchUserByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found.");
    }

    private void displayUser(UserNode user) {
        System.out.println("---------------------");
        System.out.println("ID   : " + user.userId);
        System.out.println("Name : " + user.name);
        System.out.println("Age  : " + user.age);
    }

    /* Count Friends */
    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friendHead;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends.");
            temp = temp.next;
        }
    }
}