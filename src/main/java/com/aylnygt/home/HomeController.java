package com.aylnygt.kazatahminsistemi;




import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aylnygt.entity.Kaza;
import com.aylnygt.service.KazaService; 




@Controller
public class HomeController {
	
	
	/*private static final Long Long = null;*/
	@Autowired
	private KazaService kazaService;
	
	
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( Model model,HttpServletRequest req) {
		
		
		
		
		System.out.println(req.getRemoteAddr());
		

		
		model.addAttribute("serverTime", "/" );
		
		return "index";  
	}
	
	
	

	@RequestMapping(value = "/anasayfa", method = RequestMethod.GET)
	public String anasayfa( Model model,HttpServletRequest req) {
		
		
		
		
		System.out.println(req.getRemoteAddr());
		

		
		model.addAttribute("serverTime", "/anasayfa" );
		
		return "anasayfa";  
	}

	
	@RequestMapping(value = "/sonuc", method = RequestMethod.GET)
	public String sonuc( Model model,HttpServletRequest req) {
		
		
		
		
		System.out.println(req.getRemoteAddr());
		

		
		model.addAttribute("serverTime", "/sonuc" );
		
		return "sonuc";  
	}
	

		
}

	
