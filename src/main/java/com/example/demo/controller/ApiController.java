package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Operations;
import com.example.demo.service.OperationsService;

@RestController
public class ApiController {
	
	private OperationsService operationsService;

	public ApiController(OperationsService operationsService) {
		super();
		this.operationsService = operationsService;
	}
	
	@PostMapping("/calculadora/sumar")
	public Operations sumar(@RequestBody Operations operations) {
		return operationsService.sumarEnteros(operations);
	}

	@PostMapping("/calculadora/restar")
	public Operations restar(@RequestBody Operations operations) {
		return operationsService.restarEnteros(operations);
	}
	
	@PostMapping("/calculadora/multiplicar")
	public Operations multiplicar(@RequestBody Operations operations) {
		return operationsService.multiplicarEnteros(operations);
	}	
	
	@GetMapping("/calculadora/dividir")
	public Operations dividir(@RequestParam int operation1, @RequestParam int operation2) {
		return operationsService.dividirEnteros(operation1, operation2);
	}	
	
}
