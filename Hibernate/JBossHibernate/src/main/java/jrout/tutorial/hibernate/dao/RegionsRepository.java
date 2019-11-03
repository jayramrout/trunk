package jrout.tutorial.hibernate.dao;

import jrout.tutorial.hibernate.model.Regions;
import org.springframework.data.repository.CrudRepository;

public interface RegionsRepository extends CrudRepository<Regions, Long> {

}
