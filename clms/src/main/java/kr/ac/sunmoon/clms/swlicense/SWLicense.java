package kr.ac.sunmoon.clms.swlicense;

import java.io.Serializable;
import java.sql.Date;

public class SWLicense implements Serializable {
	@Override
	public String toString() {
		return "SWLicense [no=" + no + ", labNo=" + labNo + ", swNo=" + swNo + ", contractDate=" + contractDate
				+ ", expiryDate=" + expiryDate + ", copies=" + copies + ", useLabNo=" + useLabNo
				+ ", authenticationCode=" + authenticationCode + ", contractDept=" + contractDept + ", contractName="
				+ contractName + ", contractPhone=" + contractPhone + ", supplierName=" + supplierName
				+ ", supplierContactName=" + supplierContactName + ", supplierPhone=" + supplierPhone + ", note=" + note
				+ "]";
	}

	private int no;
	private String labNo;
	private int swNo;
	private Date contractDate;
	private Date expiryDate;
	private int copies;
	private String useLabNo;
	private String authenticationCode;
	private String contractDept;
	private String contractName;
	private String contractPhone;
	private String supplierName;
	private String supplierContactName;
	private String supplierPhone;
	private String note;

	public SWLicense() {
	}

	public SWLicense(int no, String labNo, int swNo, Date contractDate, Date expiryDate, int copies, String useLabNo,
			String authenticationCode, String contractDept, String contractName, String contractPhone,
			String supplierName, String supplierContactName, String supplierPhone, String note) {
		this.no = no;
		this.labNo = labNo;
		this.swNo = swNo;
		this.contractDate = contractDate;
		this.expiryDate = expiryDate;
		this.copies = copies;
		this.useLabNo = useLabNo;
		this.authenticationCode = authenticationCode;
		this.contractDept = contractDept;
		this.contractName = contractName;
		this.contractPhone = contractPhone;
		this.supplierName = supplierName;
		this.supplierContactName = supplierContactName;
		this.supplierPhone = supplierPhone;
		this.note = note;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	public String getLabNo() {
		return (String) labNo;
	}
	
	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}
	
	public int getSwNo() {
		return swNo;
	}

	public void setSwNo(int swNo) {
		this.swNo = swNo;
	}

	public Date getContractDate() {
		return contractDate;
	}

	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public String getUseLabNo() {
		return useLabNo;
	}

	public void setUseLabNo(String useLabNo) {
		this.useLabNo = useLabNo;
	}

	public String getAuthenticationCode() {
		return authenticationCode;
	}

	public void setAuthenticationCode(String authenticationCode) {
		this.authenticationCode = authenticationCode;
	}

	public String getContractDept() {
		return contractDept;
	}

	public void setContractDept(String contractDept) {
		this.contractDept = contractDept;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractPhone() {
		return contractPhone;
	}

	public void setContractPhone(String contractPhone) {
		this.contractPhone = contractPhone;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierContactName() {
		return supplierContactName;
	}

	public void setSupplierContactName(String supplierContactName) {
		this.supplierContactName = supplierContactName;
	}

	public String getSupplierPhone() {
		return supplierPhone;
	}

	public void setSupplierPhone(String supplierPhone) {
		this.supplierPhone = supplierPhone;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}