package com.jadm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jadm.model.BbookSdipmgdti;

@Repository
@Transactional
public interface BbookSdipmgdtiRepository extends CrudRepository<BbookSdipmgdti, Long> {
	
	List<BbookSdipmgdti> findByDownloadDate1IsNullAndBatchNum(long batchNum);
	
	@Modifying(clearAutomatically = true)
	@Query(value = "update app_sam.bbook_sdipmgdti s set s.download_date_1 = sysdate where batch_num = :batchNum", nativeQuery = true)
    public void updSdipmgdti(@Param("batchNum") long batchNum);	
	

}
