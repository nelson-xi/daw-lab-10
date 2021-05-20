package com.tecsup.controlador;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecsup.DawLab10Application;
import com.tecsup.modelo.Alumno;

@RestController
@RequestMapping(value = "/alumno")
public class Controlador {

	@GetMapping(value = "/listado")
	public HashMap<Integer, Alumno> getLista() {
		return DawLab10Application.data;
	}
	
	@GetMapping(value = "/{id}")
	public Alumno getAlumno(@PathVariable int id) {
		return DawLab10Application.data.get(id);
	}
	
}
