package com.jadm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BBOOK_SDIVALMSI")

public class BbookSdiValmsi {
	
	@Id
    @Column(name="audit_number" ,columnDefinition = "number(12)")
	protected Long auditNumber;

    @Column(name="tran_type" ,columnDefinition = "varchar2(1)")
    protected String tranType;

    @Column(name="org_lvl_number" ,columnDefinition = "number(12)")
    protected Integer orgLvlNumber;
    
    @Column(name="prd_lvl_number" ,columnDefinition = "varchar2(15)")
    protected String prdLvlNumber;

    @Column(name="pmg_po_number" ,columnDefinition = "number(12)")
    protected Integer pmgPoNumber;

    @Column(name="pmg_line_number" ,columnDefinition = "number(7)")
    protected Integer pmgLineNumber;

    @Column(name="pmg_dtl_tech_key" ,columnDefinition = "number(12)")
    protected Integer pmgDtlTechKey;

    @Column(name="field_code" ,columnDefinition = "varchar2(2)")
    protected String fieldCode;
    
    @Column(name="entity_name" ,columnDefinition = "varchar2(8)")
    protected String entityName;

    @Column(name="value" ,columnDefinition = "varchar2(50)")
    protected String value;

    @Column(name="val_err_code" ,columnDefinition = "number(12)")
    protected Integer valErrCode;
    
    @Column(name="date_created" ,columnDefinition = "date")
    protected Date dateCreated;	

    @Column(name="download_date_1" ,columnDefinition = "date")
    protected Date downloadDate1;	

    @Column(name="download_date_2" ,columnDefinition = "date")
    protected Date downloadDate2;	
    
    @Column(name="vendor_number" ,columnDefinition = "varchar2(15)")
    protected String vendorNumber;

    @Column(name="vpc_shp_point" ,columnDefinition = "number(6)")
    protected Integer vpcShpPoint;

    @Column(name="vpc_case_pack_id" ,columnDefinition = "varchar2(25)")
    protected String vpcCasePackId;

    @Column(name="prd_lvl_id" ,columnDefinition = "number(5)")
    protected Integer prdLvlId;

    @Column(name="org_lvl_id" ,columnDefinition = "number(5)")
    protected Integer orgLvlId;

    @Column(name="pmg_ext_po_num" ,columnDefinition = "varchar2(20)")
    protected String pmgExtPoNum;

    @Column(name="batch_num" ,columnDefinition = "number(12)")
    protected long batchNum;

    @Column(name="nombre_archivo" ,columnDefinition = "varchar2(50)")
    protected String nombreArchivo;

    @Column(name="fecha_stage" ,columnDefinition = "date")
    protected Date fechaSstage;	

    @Column(name="fecha_permanente" ,columnDefinition = "date")
    protected Date fechaPermanente;	

    @Column(name="fecha_backup" ,columnDefinition = "date")
    protected Date fechaBackup;

	public BbookSdiValmsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BbookSdiValmsi(Long auditNumber, String tranType, Integer orgLvlNumber, String prdLvlNumber,
			Integer pmgPoNumber, Integer pmgLineNumber, Integer pmgDtlTechKey, String fieldCode, String entityName,
			String value, Integer valErrCode, Date dateCreated, Date downloadDate1, Date downloadDate2,
			String vendorNumber, Integer vpcShpPoint, String vpcCasePackId, Integer prdLvlId, Integer orgLvlId,
			String pmgExtPoNum, long batchNum, String nombreArchivo, Date fechaSstage, Date fechaPermanente,
			Date fechaBackup) {
		super();
		this.auditNumber = auditNumber;
		this.tranType = tranType;
		this.orgLvlNumber = orgLvlNumber;
		this.prdLvlNumber = prdLvlNumber;
		this.pmgPoNumber = pmgPoNumber;
		this.pmgLineNumber = pmgLineNumber;
		this.pmgDtlTechKey = pmgDtlTechKey;
		this.fieldCode = fieldCode;
		this.entityName = entityName;
		this.value = value;
		this.valErrCode = valErrCode;
		this.dateCreated = dateCreated;
		this.downloadDate1 = downloadDate1;
		this.downloadDate2 = downloadDate2;
		this.vendorNumber = vendorNumber;
		this.vpcShpPoint = vpcShpPoint;
		this.vpcCasePackId = vpcCasePackId;
		this.prdLvlId = prdLvlId;
		this.orgLvlId = orgLvlId;
		this.pmgExtPoNum = pmgExtPoNum;
		this.batchNum = batchNum;
		this.nombreArchivo = nombreArchivo;
		this.fechaSstage = fechaSstage;
		this.fechaPermanente = fechaPermanente;
		this.fechaBackup = fechaBackup;
	}

	@Override
	public String toString() {
		return "BbookSdiValmsi [auditNumber=" + auditNumber + ", tranType=" + tranType + ", orgLvlNumber="
				+ orgLvlNumber + ", prdLvlNumber=" + prdLvlNumber + ", pmgPoNumber=" + pmgPoNumber + ", pmgLineNumber="
				+ pmgLineNumber + ", pmgDtlTechKey=" + pmgDtlTechKey + ", fieldCode=" + fieldCode + ", entityName="
				+ entityName + ", value=" + value + ", valErrCode=" + valErrCode + ", dateCreated=" + dateCreated
				+ ", downloadDate1=" + downloadDate1 + ", downloadDate2=" + downloadDate2 + ", vendorNumber="
				+ vendorNumber + ", vpcShpPoint=" + vpcShpPoint + ", vpcCasePackId=" + vpcCasePackId + ", prdLvlId="
				+ prdLvlId + ", orgLvlId=" + orgLvlId + ", pmgExtPoNum=" + pmgExtPoNum + ", batchNum=" + batchNum
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

	public Integer getOrgLvlNumber() {
		return orgLvlNumber;
	}

	public void setOrgLvlNumber(Integer orgLvlNumber) {
		this.orgLvlNumber = orgLvlNumber;
	}

	public String getPrdLvlNumber() {
		return prdLvlNumber;
	}

	public void setPrdLvlNumber(String prdLvlNumber) {
		this.prdLvlNumber = prdLvlNumber;
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

	public Integer getPmgDtlTechKey() {
		return pmgDtlTechKey;
	}

	public void setPmgDtlTechKey(Integer pmgDtlTechKey) {
		this.pmgDtlTechKey = pmgDtlTechKey;
	}

	public String getFieldCode() {
		return fieldCode;
	}

	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getValErrCode() {
		return valErrCode;
	}

	public void setValErrCode(Integer valErrCode) {
		this.valErrCode = valErrCode;
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

	public String getVendorNumber() {
		return vendorNumber;
	}

	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}

	public Integer getVpcShpPoint() {
		return vpcShpPoint;
	}

	public void setVpcShpPoint(Integer vpcShpPoint) {
		this.vpcShpPoint = vpcShpPoint;
	}

	public String getVpcCasePackId() {
		return vpcCasePackId;
	}

	public void setVpcCasePackId(String vpcCasePackId) {
		this.vpcCasePackId = vpcCasePackId;
	}

	public Integer getPrdLvlId() {
		return prdLvlId;
	}

	public void setPrdLvlId(Integer prdLvlId) {
		this.prdLvlId = prdLvlId;
	}

	public Integer getOrgLvlId() {
		return orgLvlId;
	}

	public void setOrgLvlId(Integer orgLvlId) {
		this.orgLvlId = orgLvlId;
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
