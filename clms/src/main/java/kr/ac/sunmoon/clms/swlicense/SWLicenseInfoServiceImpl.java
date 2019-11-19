package kr.ac.sunmoon.clms.swlicense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SWLicenseInfoServiceImpl implements SWLicenseInfoService {
	@Autowired
	private SWLicenseMapper swLicenseMapper;
	
	@Override
	public List<SWLicense> list() {
		// 1. SW 라이선스 목록을 조회한다.
		List<SWLicense> swLicenses = this.swLicenseMapper.selectAll();
		return swLicenses;
	}

	@Override
	public SWLicense view(int no) {
		// 1. SW 라이선스 정보를 조회한다.
		SWLicense swLicense = this.swLicenseMapper.select(no);
		return swLicense;
	}

	@Override
	public boolean register(SWLicense swLicense) {
		System.out.println(swLicense);
		// 1. 입력값이 존재 하는가?
		if (swLicense.getSwNo() > 0
				&& swLicense.getLabNo() != ""
				&& swLicense.getCopies() > 0
				&& swLicense.getUseLabNo() != ""
				&& swLicense.getAuthenticationCode() != ""
				&& swLicense.getContractDept() != ""
				&& swLicense.getContractName() != ""
				&& swLicense.getContractPhone() != ""
				&& swLicense.getSupplierName() != ""
				&& swLicense.getSupplierContactName() != ""
				&& swLicense.getSupplierPhone() != ""
				&& swLicense.getNote() != "") {
			// 2. SW 라이선스 정보를 등록한다.
			
			this.swLicenseMapper.insert(swLicense);

			return true;
		} 

		return false;
	}

	@Override
	public boolean modify(SWLicense swLicense) {
		// 1. 입력값이 존재 하는가?
		if (swLicense.getSwNo() > 0
				&& swLicense.getLabNo() != null
				&& swLicense.getContractDate() != null
				&& swLicense.getExpiryDate() != null
				&& swLicense.getCopies() > 0
				&& swLicense.getUseLabNo() != null
				&& swLicense.getAuthenticationCode() != null
				&& swLicense.getContractDept() != null
				&& swLicense.getContractName() != null
				&& swLicense.getContractPhone() != null
				&& swLicense.getSupplierName() != null
				&& swLicense.getSupplierContactName() != null
				&& swLicense.getSupplierPhone() != null
				&& swLicense.getNote() != null) {
		// 2. SW 라이선스 정보를 수정한다.
			this.swLicenseMapper.update(swLicense);
				
			return true;
		}
			
		return false;
	}

	@Override
	public void remove(int no) {
		// 1. SW 라이선스 정보를 삭제한다.
		this.swLicenseMapper.delete(no);
	}

}
