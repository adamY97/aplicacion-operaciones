package com.example.aplicacionoperaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.libreriaoperaciones.Operacion;

@SpringBootApplication
public class AplicacionOperacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicacionOperacionesApplication.class, args);
		
		Operacion operacion = new Operacion("Resta");
		System.out.println(operacion.operacionMatematica());
		operacion.setOperacion("Multiplicacion");
		System.out.println(operacion.operacionMatematica());
	}

}
