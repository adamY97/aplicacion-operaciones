package com.example.aplicacionoperaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.libreriaoperaciones.Operacion;


@RestController
public class OperacionesController {
	
	@Autowired Operacion operacion;

	@GetMapping("/calculadora")
	public String getResultado() {
		//Realiza la operacion por defecto indicada en el application.properties
		return operacion.operacionMatematica();
	}
}
