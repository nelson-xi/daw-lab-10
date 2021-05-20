package com.tecsup;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tecsup.modelo.Alumno;

@SpringBootApplication
public class DawLab10Application {

	public static HashMap<Integer, Alumno> data;

	public static void main(String[] args) {
		data = new HashMap<Integer, Alumno>();

		Alumno x = new Alumno(1, "Nelson", "Gayoso Pérez");
		data.put(1, x);
		Alumno y = new Alumno(2, "Adriana", "García Rodríguez");
		data.put(2, y);

		SpringApplication.run(DawLab10Application.class, args);

	}

}
