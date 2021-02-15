package com.ariye.lakeTours.entities;

import javax.persistence.*;

@Entity
@Table(name = "guides")
public class Guide {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private short weight;

    @OneToMany(mappedBy = "guide", cascade = CascadeType.DETACH)
    private Group[] groups;

    public Guide(long id, String name, short weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    /**
     * Full ctor
     */
    public Guide(long id, String name, short weight, Group[] groups) {
        this(id, name, weight);
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "\nGuide{" +
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

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }


}
