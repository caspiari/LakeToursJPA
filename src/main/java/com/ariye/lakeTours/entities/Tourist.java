package com.ariye.lakeTours.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tourists")
public class Tourist {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private short weight;

    public Tourist(String name, short weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Full ctor
     */
    public Tourist(long id, String name, short weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nTourist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }
}
