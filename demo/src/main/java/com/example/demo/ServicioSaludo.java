package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ServicioSaludo {
	
	public String generarSaludo() {
		return "Buenas Noches";
	}

}
