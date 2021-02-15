package com.ariye.lakeTours;

import com.ariye.lakeTours.dao.BoatsDao;
import com.ariye.lakeTours.dao.GroupsDao;
import com.ariye.lakeTours.dao.GuidesDao;
import com.ariye.lakeTours.dao.TouristsDao;
import com.ariye.lakeTours.entities.Boat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Main {

    @Autowired
    BoatsDao boatsDao;

    @Autowired
    GroupsDao groupsDao;

    @Autowired
    GuidesDao guidesDao;

    @Autowired
    TouristsDao touristsDao;

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);


    }

    @PostConstruct
    private void startApplication() {
        System.out.println("Welcome to Lake Tours ltd! ");
        Boat boat = new Boat((short) 500);
        boatsDao.save(boat);
        boat.setTotalCapacity((short) 1000);
        boatsDao.save(boat);
        boat.setTotalCapacity((short) 1500);
        boatsDao.save(boat);



    }

}
