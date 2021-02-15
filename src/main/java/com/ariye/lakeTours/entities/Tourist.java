package com.ariye.lakeTours.entities;

public class Tourist {

    private String name;

    private short weight;

    public Tourist(String name, short weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nTourist{" +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
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
