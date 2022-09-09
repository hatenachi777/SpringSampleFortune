package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class fortune {
	
	@RequestMapping("/fortune")
	public String strat() {
		double fn = Math.random();
		
		if(fn >= 0.7) {
			return "grateFortune.html";
		}else if(fn >= 0.4) {
			return "middleFortune.html";
		}else if(fn >= 0.1) {
			return "smallFortune.html";
		}else {
			return "misFortune.html";
		}
		
	}

}
