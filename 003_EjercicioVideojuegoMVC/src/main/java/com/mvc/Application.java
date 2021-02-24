package com.mvc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mvc.modelo.entidad.Usuario;
import com.mvc.modelo.entidad.Videojuego;
import com.mvc.modelo.persistencia.DaoUsuario;
import com.mvc.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
	
		DaoUsuario du = context.getBean("daoUsuario", DaoUsuario.class);
		DaoVideojuego daoVideojuego = context.getBean("daoVideojuego", DaoVideojuego.class);
	
		Usuario u = new Usuario();
		u.setNombre("carlos");
		u.setPassword("123456");
		du.save(u);
		
		Videojuego v1 = new Videojuego();
		v1.setNombre("DiabloII");
		v1.setCompania("Blizard");
		v1.setPrecio(19.99);
		v1.setPuntuacion(9);
		
		
		Videojuego v2 = new Videojuego();
		v2.setNombre("COD");
		v2.setCompania("AtiVision");
		v2.setPrecio(37.50);
		v2.setPuntuacion(7);
		
		Videojuego v3 = new Videojuego();
		v3.setNombre("Sonic");
		v3.setCompania("Sega");
		v3.setPrecio(2.5);
		v3.setPuntuacion(6);
		
		
		Videojuego v4 = new Videojuego();
		v4.setNombre("Metal Slug");
		v4.setCompania("Nazca");
		v4.setPrecio(3.5);
		v4.setPuntuacion(8);
		
		
		daoVideojuego.save(v1);
		daoVideojuego.save(v2);
		daoVideojuego.save(v3);
		daoVideojuego.save(v4);
		
	}

}
