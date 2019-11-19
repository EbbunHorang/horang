package kr.ac.sunmoon.clms.sw;

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

@Controller
public class SWController {
	@Autowired
	private SWInfoService swInfoService;

	// SW 전체 목록 출력
	@GetMapping("/sw")
	public ModelAndView viewSWList() {
		ModelAndView mav = new ModelAndView("/sw/list");

		List<Software> softwares = this.swInfoService.list();

		mav.addObject("softwares", softwares);
		
		return mav;
	}

//	// SW 선택 목록 조회
//	//@RequestMapping(value="/sw", method=RequestMethod.GET, consumes = "application/json")
//	@GetMapping("/sw")
//	public ModelAndView viewSWList(Software software) {
//		ModelAndView mav = new ModelAndView("/sw/list");
//
//		
//		return mav;
//	}
//	

	// SW 정보 등록 화면
	@GetMapping("/sw/form")
	public ModelAndView addSW() {
		return new ModelAndView("/sw/add");
	}

	// SW 정보 등록
	@PostMapping("/sw")
	public ModelAndView addSW(Software software) {
		boolean isResult = this.swInfoService.register(software);
		if (isResult) {
			return new ModelAndView(new RedirectView("/sw"));
		} else {
			return new ModelAndView(new RedirectView("/sw/form"));
		}
	}

	// SW 정보 수정 폼
	@GetMapping("/sw/{swNo}/form")
	public ModelAndView editSW(@PathVariable("swNo") int no) {
		ModelAndView mav = new ModelAndView("/sw/edit");
		
		// 해당 항목의 값들을 가지고 온다.
		Software software = this.swInfoService.view(no);
		// 해당 값들을 모델앤뷰에 저장한다.
		mav.addObject("sw", software);
		// 반환한다.
		return mav;
	}

	// SW 정보 수정
	@PutMapping("/sw")
	public ModelAndView editSW(Software software) {
		boolean isResult = swInfoService.modify(software);
		if (isResult) {	
			return new ModelAndView(new RedirectView("/sw"));
		} else {
			return new ModelAndView(new RedirectView("/sw"+ software.getNo() +"/form"));
		}
	}

	@DeleteMapping("/sw/{swNo}")
	public ModelAndView removeSW(@PathVariable("swNo") int no) {
		this.swInfoService.remove(no);
		return new ModelAndView(new RedirectView("/sw"));
	}
//	downExcel	

}
