package com.videojuegoJPA;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.videojuego.modelo.entidad.Videojuego;
import com.videojuego.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		DaoVideojuego daoVideojuego = context.getBean("daoVideojuego", DaoVideojuego.class);
		
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
		
		daoVideojuego.save(v1);
		daoVideojuego.save(v2);
		
		Optional<Videojuego> videojuegoOptional = daoVideojuego.findById(2);
		if(videojuegoOptional.isPresent()) {
			System.out.println("Existe el videojuego");
			System.out.println(videojuegoOptional.get());
		}else {
			System.out.println("El videojuego no existe");
		}
		
		List<Videojuego> listaVideojuegos = daoVideojuego.findAll();
		System.out.println(listaVideojuegos);
		
	}

}
