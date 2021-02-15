package com.ariye.lakeTours.dao;

import com.ariye.lakeTours.entities.Boat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupsDao extends CrudRepository<Boat, Long> {

}
