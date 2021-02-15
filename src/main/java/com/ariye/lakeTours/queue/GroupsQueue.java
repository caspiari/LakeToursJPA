package com.ariye.lakeTours.queue;

import com.ariye.lakeTours.entities.Group;

public class GroupsQueue {

    private short lenght;
    private Node firstNode;
    private Node lastNode;

    public GroupsQueue() {
    }

    public void enqueue(Group group) {
        Node node = new Node(group);
        if(firstNode == null) {
            this.firstNode = node;
            this.lastNode = node;
        } else {
            this.lastNode.setNextGroup(node);
            this.lastNode = node;
        }
        lenght++;
    }

    public Node dequeue()
}
