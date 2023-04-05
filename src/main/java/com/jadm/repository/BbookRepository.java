package com.jadm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jadm.model.BbookJson;

@Repository
public interface BbookRepository extends CrudRepository <BbookJson, Long>{

}
