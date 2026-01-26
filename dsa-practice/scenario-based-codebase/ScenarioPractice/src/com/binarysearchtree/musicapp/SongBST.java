package com.binarysearchtree.musicapp;

public class SongBST {
    private SongNode root;

    public void insert(Song song) {
        root = insertRec(root, song);
    }

    private SongNode insertRec(SongNode root, Song song) {
        if (root == null) {
            return new SongNode(song);
        }

        if (song.getTitle().compareToIgnoreCase(root.song.getTitle()) < 0) {
            root.left = insertRec(root.left, song);
        } else {
            root.right = insertRec(root.right, song);
        }
        return root;
    }

    public Song searchByTrackId(int trackId) {
        return searchRec(root, trackId);
    }

    private Song searchRec(SongNode root, int trackId) {
        if (root == null) return null;

        if (root.song.getTrackId() == trackId) {
            return root.song;
        }

        Song leftResult = searchRec(root.left, trackId);
        if (leftResult != null) return leftResult;

        return searchRec(root.right, trackId);
    }

    public void displayAlphabetically() {
        System.out.println("Playlist (Alphabetical Order):");
        inorder(root);
    }

    private void inorder(SongNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Title: " + root.song.getTitle() +
                    ", Artist: " + root.song.getArtist() +
                    ", Track ID: " + root.song.getTrackId());
            inorder(root.right);
        }
    }
}
