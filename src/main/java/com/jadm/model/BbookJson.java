package com.jadm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="BBOOK_JSON")
public class BbookJson {

	@Id
    @Column(name="bk_id" ,columnDefinition = "number(12)")
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq") 
	//@SequenceGenerator(name="seq",sequenceName="app_sam.BATCH_NUMBER", allocationSize=1)         
    private Long bkId;

    @Column(name="bk_json" ,columnDefinition = "clob")
    @Lob
    private String bkJson;
    
    @Column(name="download_date" ,columnDefinition = "date")
    private Date downloadDate;

	public BbookJson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BbookJson(Long bkId, String bkJson, Date downloadDate) {
		super();
		this.bkId = bkId;
		this.bkJson = bkJson;
		this.downloadDate = downloadDate;
	}

	@Override
	public String toString() {
		return "BbookJson [bkId=" + bkId + ", bkJson=" + bkJson + ", downloadDate=" + downloadDate + "]";
	}

	public Long getBkId() {
		return bkId;
	}

	public void setBkId(Long bkId) {
		this.bkId = bkId;
	}

	public String getBkJson() {
		return bkJson;
	}

	public void setBkJson(String bkJson) {
		this.bkJson = bkJson;
	}

	public Date getDownloadDate() {
		return downloadDate;
	}

	public void setDownloadDate(Date downloadDate) {
		this.downloadDate = downloadDate;
	}
    
    

}
