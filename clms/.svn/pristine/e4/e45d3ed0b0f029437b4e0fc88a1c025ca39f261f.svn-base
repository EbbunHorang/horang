package kr.ac.sunmoon.clms.changenotice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ChangeNoticeController {
	
	@Autowired
	private ChangeNoticeService changeNoticeService;
	
	@GetMapping("/changenotice")
	public ModelAndView viewChangeNoticeList() {
		ModelAndView mav = new ModelAndView("/changenotice/list");
		mav.addObject("changenotices", this.changeNoticeService.list());

		return mav;
	}
	
	public ModelAndView viewChangeNoticeList(ChangeNotice changeNotice) {//select box
		return null;
	}
	
	public ModelAndView addChangeNotice(ChangeNotice changeNotice) {
		return null;
	}
	
	@GetMapping("/changenotice/{no}/form")
	public ModelAndView editChangeNotice(@PathVariable("no") int no) {
		ModelAndView mav = new ModelAndView("/changenotice/edit");
		
		mav.addObject("changenotice",changeNoticeService.view(no));
		return mav;
	}
	
	@PutMapping("/changenotice")
	public ModelAndView editChangeNotice(ChangeNotice changeNotice) {
		this.changeNoticeService.modify(changeNotice);

		return new ModelAndView(new RedirectView("/changenotice"));
	}
}
