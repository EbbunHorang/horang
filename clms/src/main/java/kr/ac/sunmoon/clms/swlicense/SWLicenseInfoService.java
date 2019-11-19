package kr.ac.sunmoon.clms.swlicense;

import java.util.List;

public interface SWLicenseInfoService {
	public List<SWLicense> list();
	public SWLicense view(int no);
	public boolean register(SWLicense swLicense);
	public boolean modify(SWLicense swLicense);
	public void remove(int no);
	// 엑셀 다운로드
}
