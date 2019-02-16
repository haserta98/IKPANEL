package com.sefakaya.ikpanel;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sefakaya.entity.HRManager;
import com.sefakaya.entity.Job;
import com.sefakaya.service.HRManagerService;

@Controller
public class LoginController {
	
	@Autowired
	private HRManagerService hrManagerService;
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home(Model model) {
		
		
		return "login";
	}
	
	@RequestMapping(value="/loginControl",method= RequestMethod.POST)
	public ResponseEntity<String> loginControl(@RequestBody HRManager hrmanager,HttpServletRequest request){

		HRManager hrm=hrManagerService.getFindByUsernameAndPass(hrmanager);
		
		if(hrm!=null) {
			
			request.getSession().setAttribute("HRManager",hrm);
			
			return new ResponseEntity<>("OK",HttpStatus.OK);
		}
		
		return new ResponseEntity<>("ERROR",HttpStatus.OK);
		
	}
	
	
	

}
