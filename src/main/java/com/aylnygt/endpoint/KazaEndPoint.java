package com.aylnygt.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aylnygt.service.KazaService;

@RestController
@RequestMapping(value="/rest")
public class KazaEndPoint {
	
	
	@Autowired
	private KazaService kazaService;

}
