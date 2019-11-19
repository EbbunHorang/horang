package kr.ac.sunmoon.clms.swlicense;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import kr.ac.sunmoon.clms.sw.Software;

@Controller
public class SWLicenseController {
	@Autowired
	private SWLicenseInfoService swLicenseInfoService;
	
	// sw 라이선스 목록 조회
	@GetMapping("/swlicense")
	public ModelAndView viewSWLicenseList() {
		ModelAndView mav = new ModelAndView("/swlicense/list");
		
		List<SWLicense> swLicenses = this.swLicenseInfoService.list();
		
		mav.addObject("swLicenses", swLicenses);
		
		return mav;
	}
	
	// SW 라이선스 정보 조회
	@GetMapping("/swlicense/{swLicenseNo}")
	public ModelAndView viewSWLicense(@PathVariable("swLicenseNo") int no) {
		ModelAndView mav = new ModelAndView("/swlicense/view");
		// 항목을 가져온다.
		SWLicense swLicense = this.swLicenseInfoService.view(no);
		//mav에 저장한다.
		mav.addObject("swLicense", swLicense);
		
		return mav;
	}
	
	// SW 라이선스 등록 폼
	@GetMapping("/swlicense/form")
	public ModelAndView addSWLicense() {
		return new ModelAndView("/swlicense/add");
	}
	
	// SW 라이선스 등록
	@PostMapping("/swlicense")
	public ModelAndView addSWLicense(SWLicense swLicense) {
		boolean isResult = this.swLicenseInfoService.register(swLicense);
		System.out.println("서비스 : "+ isResult);
		if (isResult) {
			return new ModelAndView(new RedirectView("/swlicense"));
		} else {
			return new ModelAndView(new RedirectView("/swlicense/form"));
		}
	}
	
	// SW 라이선스 수정 폼
	@GetMapping("/swlicense/{swLicenseNo}/form")
	public ModelAndView editSWLicense(@PathVariable("swLicenseNo") int no) {
		ModelAndView mav = new ModelAndView("/swlicense/edit");
		
		// 해당 항목의 값들을 가지고 온다.
		SWLicense swLicense = this.swLicenseInfoService.view(no);
		// 해당 값들을 모델앤뷰에 저장한다.
		mav.addObject("swLicense", swLicense);
		// 반환한다.
		return mav;
	}
	
	// SW 라이선스 수정 
	@PutMapping("/swlicense")
	public ModelAndView editSWLicense(SWLicense swLicense) {
		boolean isResult = swLicenseInfoService.modify(swLicense);
		if (isResult) {	
			return new ModelAndView(new RedirectView("/swlicense"));
		} else {
			return new ModelAndView(new RedirectView("/swlicense"+ swLicense.getNo() +"/form"));
		}
	}
	
	@DeleteMapping("/swlicense/{swLicenseNo}")
	public ModelAndView removeSWLicense(@PathVariable("swLicenseNo") int no) {
		this.swLicenseInfoService.remove(no);
		return new ModelAndView(new RedirectView("/swlicense"));
	}
	
	// 엑셀 다운로드
}
