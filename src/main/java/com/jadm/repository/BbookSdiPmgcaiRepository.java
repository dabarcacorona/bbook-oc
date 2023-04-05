package com.jadm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jadm.model.BbookSdiPmgcai;

@Repository
@Transactional
public interface BbookSdiPmgcaiRepository extends CrudRepository<BbookSdiPmgcai, Long>{

	List<BbookSdiPmgcai> findByDownloadDate1IsNullAndBatchNum(long batchNum);
	
	@Modifying(clearAutomatically = true)
	@Query(value = "update app_sam.bbook_sdiPmgcai s set s.download_date_1 = sysdate where batch_num = :batchNum", nativeQuery = true)
    public void updSdiPmgcai(@Param("batchNum") long batchNum);	
	
}
