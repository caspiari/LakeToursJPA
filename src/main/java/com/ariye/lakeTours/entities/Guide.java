package com.ariye.lakeTours.entities;

import javax.persistence.*;

@Entity
@Table(name = "guides")
public class Guide {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(mappedBy = "guide", cascade = CascadeType.DETACH)
    private Group[] groups;

    public Guide(String name) {
        this.name = name;
    }

    /**
     * Full ctor
     */
    public Guide(String name, Group[] groups) {
        this(name);
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "\nGuide{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + '}';
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

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }


}
