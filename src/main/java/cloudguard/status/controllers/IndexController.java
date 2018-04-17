package cloudguard.status.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cloudguard.status.service.StatusService;

@Controller
public class IndexController {
	
	private StatusService statusService;
	
	@Autowired
	public void setStatusService(StatusService statusService) {
		this.statusService = statusService;
	}
	
    @RequestMapping("/")
    public String getIndex(Model model){
    	
    	model.addAttribute("services",statusService.getServices());
        return "index";
    }
	

}
