package com.ariye.lakeTours.dao;

import com.ariye.lakeTours.entities.Guide;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuidesDao  extends CrudRepository<Guide, Long> {

}
