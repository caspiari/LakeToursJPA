package com.ariye.lakeTours.queue;

import com.ariye.lakeTours.entities.Group;

public class Node {

    private Group group;
    private Node nextNode;

    public Node(Group group) {
        this.group = group;
    }

    public Node(Group group, Node nextNode) {
        this.group = group;
        this.nextNode = nextNode;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "\nNode{" +
                "group=" + group +
                ", nextGroup=" + nextNode +
                '}';
    }
}
