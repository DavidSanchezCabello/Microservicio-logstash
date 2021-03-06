package com.dscode.aplication.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	private final static Logger logger= LoggerFactory.getLogger(IndexController.class);
	
	
	private Long contadorIntentos = 0L;
	
	public IndexController() {
		
	}
	
	@GetMapping("/")
	public ResponseEntity<String> index() {
		logger.info("Llamada al endpoint inicial.");
		return new ResponseEntity<String>(HttpStatus.OK).ok("Hola");
	}
	
//	@GetMapping("/saludo")
//	public ResponseEntity<String> saludo(@RequestParam("status") String status) {
//		return new ResponseEntity<String>(HttpStatus.OK).ok(cb.execCB(status));
//	}
	

}
