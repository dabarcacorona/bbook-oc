package com.jadm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BBOOK_SDIPMGCAI")
public class BbookSdiPmgcai {
	
	@Id
    @Column(name="audit_number" ,columnDefinition = "number(12)")
    protected Long auditNumber;

    @Column(name="tran_type" ,columnDefinition = "varchar2(1)")
    protected String tranType;

    @Column(name="pmg_po_number" ,columnDefinition = "number(12)")
    protected Integer pmgPoNumber;

    @Column(name="pmg_line_number" ,columnDefinition = "number(12)")
    protected Integer pmgLineNumber;

    @Column(name="vendor_number" ,columnDefinition = "varchar2(15)")
    protected String vendorNumber;

    @Column(name="prd_lvl_number" ,columnDefinition = "varchar2(15)")
    protected String prdLvlNumber;
    
    @Column(name="prd_lvl_id" ,columnDefinition = "number(5)")
    protected Integer prdLvlId;

    @Column(name="org_lvl_number" ,columnDefinition = "number(12)")
    protected Integer orgLvlNumber;

    @Column(name="pmg_start_date" ,columnDefinition = "date")
    protected Date pmgStartDate;

    @Column(name="pmg_end_date" ,columnDefinition = "date")
    protected Date pmgEndDate;

    @Column(name="vpc_case_pack_id" ,columnDefinition = "varchar2(25)")
    protected String vpcCasePackId;
    
    @Column(name="vpc_evnt_type" ,columnDefinition = "varchar2(10)")
    protected String vpcEvntType;
    
    @Column(name="vpc_cb_desc" ,columnDefinition = "varchar2(40)")
    protected String vpcCbDesc;

    @Column(name="pmg_calc_level" ,columnDefinition = "number(1)")
    protected Integer pmgCalcLevel;

    @Column(name="pmg_amount" ,columnDefinition = "number(15,3)")
    protected Integer pmgAmount;
    
    @Column(name="pmg_percent" ,columnDefinition = "number(6,3)")
    protected Integer pmgPercent;

    @Column(name="pmg_gross_net" ,columnDefinition = "number(1)")
    protected Integer pmgGrossNet;

    @Column(name="vpc_prod_vend_flag" ,columnDefinition = "varchar2(1)")
    protected String vpcProdVendFlag;
    
    @Column(name="vpc_svc_vend_flag" ,columnDefinition = "varchar2(1)")
    protected String vpcSvcVendFlag;

    @Column(name="vpc_alw_desc" ,columnDefinition = "varchar2(40)")
    protected String vpcAlwDesc;
    
    @Column(name="date_created" ,columnDefinition = "date")
    protected Date dateCreated;	

    @Column(name="download_date_1" ,columnDefinition = "date")
    protected Date downloadDate1;	

    @Column(name="download_date_2" ,columnDefinition = "date")
    protected Date downloadDate2;	

    @Column(name="vpc_alw_key" ,columnDefinition = "number(12)")
    protected Integer vpcAlwKey;

    @Column(name="vpc_alloc_desc" ,columnDefinition = "varchar2(40)")
    protected String vpcAllocDesc;

    @Column(name="weight_type" ,columnDefinition = "varchar2(1)")
    protected String weightType;

    @Column(name="weight_uom" ,columnDefinition = "varchar2(6)")
    protected String weightUom;

    @Column(name="pmg_ext_po_num" ,columnDefinition = "varchar2(20)")
    protected String pmgExtPoNum;
    
    @Column(name="batch_num" ,columnDefinition = "number(12)")
    private long batchNum;
    
    @Column(name="nombre_archivo" ,columnDefinition = "varchar2(50)")
    protected String nombreArchivo;

    @Column(name="fecha_stage" ,columnDefinition = "date")
    protected Date fechaSstage;	

    @Column(name="fecha_permanente" ,columnDefinition = "date")
    protected Date fechaPermanente;	

    @Column(name="fecha_backup" ,columnDefinition = "date")
    protected Date fechaBackup;

	public BbookSdiPmgcai() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BbookSdiPmgcai(Long auditNumber, String tranType, Integer pmgPoNumber, Integer pmgLineNumber,
			String vendorNumber, String prdLvlNumber, Integer prdLvlId, Integer orgLvlNumber, Date pmgStartDate,
			Date pmgEndDate, String vpcCasePackId, String vpcEvntType, String vpcCbDesc, Integer pmgCalcLevel,
			Integer pmgAmount, Integer pmgPercent, Integer pmgGrossNet, String vpcProdVendFlag, String vpcSvcVendFlag,
			String vpcAlwDesc, Date dateCreated, Date downloadDate1, Date downloadDate2, Integer vpcAlwKey,
			String vpcAllocDesc, String weightType, String weightUom, String pmgExtPoNum, long batchNum,
			String nombreArchivo, Date fechaSstage, Date fechaPermanente, Date fechaBackup) {
		super();
		this.auditNumber = auditNumber;
		this.tranType = tranType;
		this.pmgPoNumber = pmgPoNumber;
		this.pmgLineNumber = pmgLineNumber;
		this.vendorNumber = vendorNumber;
		this.prdLvlNumber = prdLvlNumber;
		this.prdLvlId = prdLvlId;
		this.orgLvlNumber = orgLvlNumber;
		this.pmgStartDate = pmgStartDate;
		this.pmgEndDate = pmgEndDate;
		this.vpcCasePackId = vpcCasePackId;
		this.vpcEvntType = vpcEvntType;
		this.vpcCbDesc = vpcCbDesc;
		this.pmgCalcLevel = pmgCalcLevel;
		this.pmgAmount = pmgAmount;
		this.pmgPercent = pmgPercent;
		this.pmgGrossNet = pmgGrossNet;
		this.vpcProdVendFlag = vpcProdVendFlag;
		this.vpcSvcVendFlag = vpcSvcVendFlag;
		this.vpcAlwDesc = vpcAlwDesc;
		this.dateCreated = dateCreated;
		this.downloadDate1 = downloadDate1;
		this.downloadDate2 = downloadDate2;
		this.vpcAlwKey = vpcAlwKey;
		this.vpcAllocDesc = vpcAllocDesc;
		this.weightType = weightType;
		this.weightUom = weightUom;
		this.pmgExtPoNum = pmgExtPoNum;
		this.batchNum = batchNum;
		this.nombreArchivo = nombreArchivo;
		this.fechaSstage = fechaSstage;
		this.fechaPermanente = fechaPermanente;
		this.fechaBackup = fechaBackup;
	}

	@Override
	public String toString() {
		return "BbookSdiPmgcai [auditNumber=" + auditNumber + ", tranType=" + tranType + ", pmgPoNumber=" + pmgPoNumber
				+ ", pmgLineNumber=" + pmgLineNumber + ", vendorNumber=" + vendorNumber + ", prdLvlNumber="
				+ prdLvlNumber + ", prdLvlId=" + prdLvlId + ", orgLvlNumber=" + orgLvlNumber + ", pmgStartDate="
				+ pmgStartDate + ", pmgEndDate=" + pmgEndDate + ", vpcCasePackId=" + vpcCasePackId + ", vpcEvntType="
				+ vpcEvntType + ", vpcCbDesc=" + vpcCbDesc + ", pmgCalcLevel=" + pmgCalcLevel + ", pmgAmount="
				+ pmgAmount + ", pmgPercent=" + pmgPercent + ", pmgGrossNet=" + pmgGrossNet + ", vpcProdVendFlag="
				+ vpcProdVendFlag + ", vpcSvcVendFlag=" + vpcSvcVendFlag + ", vpcAlwDesc=" + vpcAlwDesc
				+ ", dateCreated=" + dateCreated + ", downloadDate1=" + downloadDate1 + ", downloadDate2="
				+ downloadDate2 + ", vpcAlwKey=" + vpcAlwKey + ", vpcAllocDesc=" + vpcAllocDesc + ", weightType="
				+ weightType + ", weightUom=" + weightUom + ", pmgExtPoNum=" + pmgExtPoNum + ", batchNum=" + batchNum
				+ ", nombreArchivo=" + nombreArchivo + ", fechaSstage=" + fechaSstage + ", fechaPermanente="
				+ fechaPermanente + ", fechaBackup=" + fechaBackup + "]";
	}

	public Long getAuditNumber() {
		return auditNumber;
	}

	public void setAuditNumber(Long auditNumber) {
		this.auditNumber = auditNumber;
	}

	public String getTranType() {
		return tranType;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	public Integer getPmgPoNumber() {
		return pmgPoNumber;
	}

	public void setPmgPoNumber(Integer pmgPoNumber) {
		this.pmgPoNumber = pmgPoNumber;
	}

	public Integer getPmgLineNumber() {
		return pmgLineNumber;
	}

	public void setPmgLineNumber(Integer pmgLineNumber) {
		this.pmgLineNumber = pmgLineNumber;
	}

	public String getVendorNumber() {
		return vendorNumber;
	}

	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}

	public String getPrdLvlNumber() {
		return prdLvlNumber;
	}

	public void setPrdLvlNumber(String prdLvlNumber) {
		this.prdLvlNumber = prdLvlNumber;
	}

	public Integer getPrdLvlId() {
		return prdLvlId;
	}

	public void setPrdLvlId(Integer prdLvlId) {
		this.prdLvlId = prdLvlId;
	}

	public Integer getOrgLvlNumber() {
		return orgLvlNumber;
	}

	public void setOrgLvlNumber(Integer orgLvlNumber) {
		this.orgLvlNumber = orgLvlNumber;
	}

	public Date getPmgStartDate() {
		return pmgStartDate;
	}

	public void setPmgStartDate(Date pmgStartDate) {
		this.pmgStartDate = pmgStartDate;
	}

	public Date getPmgEndDate() {
		return pmgEndDate;
	}

	public void setPmgEndDate(Date pmgEndDate) {
		this.pmgEndDate = pmgEndDate;
	}

	public String getVpcCasePackId() {
		return vpcCasePackId;
	}

	public void setVpcCasePackId(String vpcCasePackId) {
		this.vpcCasePackId = vpcCasePackId;
	}

	public String getVpcEvntType() {
		return vpcEvntType;
	}

	public void setVpcEvntType(String vpcEvntType) {
		this.vpcEvntType = vpcEvntType;
	}

	public String getVpcCbDesc() {
		return vpcCbDesc;
	}

	public void setVpcCbDesc(String vpcCbDesc) {
		this.vpcCbDesc = vpcCbDesc;
	}

	public Integer getPmgCalcLevel() {
		return pmgCalcLevel;
	}

	public void setPmgCalcLevel(Integer pmgCalcLevel) {
		this.pmgCalcLevel = pmgCalcLevel;
	}

	public Integer getPmgAmount() {
		return pmgAmount;
	}

	public void setPmgAmount(Integer pmgAmount) {
		this.pmgAmount = pmgAmount;
	}

	public Integer getPmgPercent() {
		return pmgPercent;
	}

	public void setPmgPercent(Integer pmgPercent) {
		this.pmgPercent = pmgPercent;
	}

	public Integer getPmgGrossNet() {
		return pmgGrossNet;
	}

	public void setPmgGrossNet(Integer pmgGrossNet) {
		this.pmgGrossNet = pmgGrossNet;
	}

	public String getVpcProdVendFlag() {
		return vpcProdVendFlag;
	}

	public void setVpcProdVendFlag(String vpcProdVendFlag) {
		this.vpcProdVendFlag = vpcProdVendFlag;
	}

	public String getVpcSvcVendFlag() {
		return vpcSvcVendFlag;
	}

	public void setVpcSvcVendFlag(String vpcSvcVendFlag) {
		this.vpcSvcVendFlag = vpcSvcVendFlag;
	}

	public String getVpcAlwDesc() {
		return vpcAlwDesc;
	}

	public void setVpcAlwDesc(String vpcAlwDesc) {
		this.vpcAlwDesc = vpcAlwDesc;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDownloadDate1() {
		return downloadDate1;
	}

	public void setDownloadDate1(Date downloadDate1) {
		this.downloadDate1 = downloadDate1;
	}

	public Date getDownloadDate2() {
		return downloadDate2;
	}

	public void setDownloadDate2(Date downloadDate2) {
		this.downloadDate2 = downloadDate2;
	}

	public Integer getVpcAlwKey() {
		return vpcAlwKey;
	}

	public void setVpcAlwKey(Integer vpcAlwKey) {
		this.vpcAlwKey = vpcAlwKey;
	}

	public String getVpcAllocDesc() {
		return vpcAllocDesc;
	}

	public void setVpcAllocDesc(String vpcAllocDesc) {
		this.vpcAllocDesc = vpcAllocDesc;
	}

	public String getWeightType() {
		return weightType;
	}

	public void setWeightType(String weightType) {
		this.weightType = weightType;
	}

	public String getWeightUom() {
		return weightUom;
	}

	public void setWeightUom(String weightUom) {
		this.weightUom = weightUom;
	}

	public String getPmgExtPoNum() {
		return pmgExtPoNum;
	}

	public void setPmgExtPoNum(String pmgExtPoNum) {
		this.pmgExtPoNum = pmgExtPoNum;
	}

	public long getBatchNum() {
		return batchNum;
	}

	public void setBatchNum(long batchNum) {
		this.batchNum = batchNum;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public Date getFechaSstage() {
		return fechaSstage;
	}

	public void setFechaSstage(Date fechaSstage) {
		this.fechaSstage = fechaSstage;
	}

	public Date getFechaPermanente() {
		return fechaPermanente;
	}

	public void setFechaPermanente(Date fechaPermanente) {
		this.fechaPermanente = fechaPermanente;
	}

	public Date getFechaBackup() {
		return fechaBackup;
	}

	public void setFechaBackup(Date fechaBackup) {
		this.fechaBackup = fechaBackup;
	}

	
}
