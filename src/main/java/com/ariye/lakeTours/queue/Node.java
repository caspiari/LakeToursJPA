package com.ariye.lakeTours.queue;

import com.ariye.lakeTours.entities.Group;

public class Node {

    private Group group;
    private Node nextGroup;

    public Node(Group group) {
        this.group = group;
    }

    public Node(Group group, Node nextGroup) {
        this.group = group;
        this.nextGroup = nextGroup;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Node getNextGroup() {
        return nextGroup;
    }

    public void setNextGroup(Node nextGroup) {
        this.nextGroup = nextGroup;
    }

    @Override
    public String toString() {
        return "\nNode{" +
                "group=" + group +
                ", nextGroup=" + nextGroup +
                '}';
    }
}
