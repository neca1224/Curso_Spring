package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiPrimerControlador {
	
	@Autowired
	private ServicioSaludo servicioSaludo;
	
	@GetMapping("/saludo")
	public String devolverSaludo() {
		//ServicioSaludo servicioSaludo = new ServicioSaludo();
		return servicioSaludo.generarSaludo();
	}

}
