package kr.ac.sunmoon.clms.common;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import kr.ac.sunmoon.clms.account.Account;

@Controller
public class CommonController {
	@Autowired
	private CommonService commonService;
	
	@GetMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("/common/login");
	}
	
	@PostMapping("/login")
	public ModelAndView login(HttpSession session, Account account) {
		boolean isSuccess = this.commonService.login(session, account);
		
		if (isSuccess) {
			return new ModelAndView(new RedirectView("/account"));
		} else {
			return new ModelAndView(new RedirectView("/login"));
		}
	}
	
	@GetMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		this.commonService.logout(session);
		
		return new ModelAndView(new RedirectView("/login"));
	}
}
