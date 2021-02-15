package com.ariye.lakeTours.dao;

import com.ariye.lakeTours.entities.Tourist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristsDao extends CrudRepository<Tourist, Long> {

}
