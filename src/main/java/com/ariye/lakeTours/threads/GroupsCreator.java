package com.ariye.lakeTours.threads;

import com.ariye.lakeTours.dao.TouristsDao;
import com.ariye.lakeTours.entities.Group;
import com.ariye.lakeTours.entities.Guide;
import com.ariye.lakeTours.entities.Tourist;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Random;

public class GroupsCreator extends Thread {

    Random random = new Random();

    @Autowired
    TouristsDao touristsDao;

    public void createGroup() {
        ArrayList<Tourist> tourists = new ArrayList<>(10);

        for (int i = 1; i < 11; i++) {
            tourists.add(new Tourist("Tourist"+i, ((short)(random.nextInt((80 - 50)+1) + 50))));
        }

        Guide guide = new Guide("guide");
        Group group = new Group(guide, tourists);

    }
}
