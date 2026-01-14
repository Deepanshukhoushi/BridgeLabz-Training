package com.parceltracker;

class StageNode {
    String stage;
    StageNode next;

    StageNode(String stage) {
        this.stage = stage;
        this.next = null;
    }
}
