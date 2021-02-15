package com.ariye.lakeTours.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "groups")
public class Group {

    @ManyToOne
    private Guide guide;

    @OneToMany(cascade = CascadeType.DETACH)
    private List<Tourist> tourists;

    private short currentWeight;

    public Group(Guide guide) {
        this.guide = guide;
        this.tourists = new ArrayList<>();
    }

    /**
     * Full ctor
     */
    public Group(Guide guide, List<Tourist> tourists, short currentWeight) {
        this.guide = guide;
        this.tourists = tourists;
        this.currentWeight = currentWeight;
    }

    @Override
    public String toString() {
        return "\nGroup{" +
                "guide=" + guide +
                ", currentWeight=" + currentWeight +
                '}';
    }

    public Guide getGuide() {
        return guide;
    }

    public void setGuide(Guide guide) {
        this.guide = guide;
    }

    public List<Tourist> getTourists() {
        return tourists;
    }

    public void setTourists(List<Tourist> tourists) {
        this.tourists = tourists;
    }

    public short getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(short currentWeight) {
        this.currentWeight = currentWeight;
    }
}
