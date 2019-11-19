package kr.ac.sunmoon.clms.computer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import kr.ac.sunmoon.clms.agent.Message;

@Controller
public class ComputerController {
	@Autowired
	private ComputerInfoService computerInfoService;
	
	@GetMapping("/computer")
	public ModelAndView viewComputerList() {
		ModelAndView mav = new ModelAndView("/computer/list");
		mav.addObject("computers", this.computerInfoService.list());
		
		return mav;
	}
	
	public ModelAndView viewComputerList(Computer computer) { //select box 나중에
		return null;
	}
	
	@PostMapping("/computer")
	public ModelAndView addComputer(Message message) { //등록 나중에
		ModelAndView mav = new ModelAndView("/computer");
		computerInfoService.register(message);
		
		return mav;
	}
	
	@GetMapping("/computer/{no}/form")
	public ModelAndView editComputer(@PathVariable("no") int no) {
		ModelAndView mav = new ModelAndView("/computer/edit");
		mav.addObject("computer",computerInfoService.view(no));	
		
		return mav;
	}
	
	@PutMapping("/computer")
	public ModelAndView editComputer(Computer computer) {
		this.computerInfoService.modify(computer);
		return new ModelAndView(new RedirectView("/computer"));
	}
	
	@DeleteMapping("/computer/{no}")
	public ModelAndView removeComputer(@PathVariable("no") int no) {
		this.computerInfoService.remove(no);
		
		return new ModelAndView(new RedirectView("/computer"));
	}
}
