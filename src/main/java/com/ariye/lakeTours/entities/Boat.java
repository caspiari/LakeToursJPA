package com.ariye.lakeTours.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "boats")
public class Boat {

    @Id
    @GeneratedValue
    private long id;

    private short totalCapacity;

    private short content;

    private boolean onMove;


    public Boat(short totalCapacity) {
        this.totalCapacity = totalCapacity;
        this.content = 0;
        this.onMove = false;
    }

    @Override
    public String toString() {
        return "\nBoat{" +
                "totalCapacity=" + totalCapacity +
                ", content=" + content +
                ", full=" + onMove +
                '}';
    }

    public short getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(short totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public short getContent() {
        return content;
    }

    public void setContent(short content) {
        this.content = content;
    }

    public boolean isOnMove() {
        return onMove;
    }

    public void setOnMove(boolean onMove) {
        this.onMove = onMove;
    }

}
