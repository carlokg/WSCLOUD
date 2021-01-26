package demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import demo.modelo.entidad.Avion;
import demo.modelo.entidad.Pelicula;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Application {

	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		
		Pelicula p1 = context.getBean("pelicula", Pelicula.class);
		p1.setTitulo("el padrino");
		p1.setAnio(1999);
		p1.getDirector().setNombre("EL puto padrino");
		p1.getDirector().setEdad(99);
		
		Pelicula p2 = context.getBean("pelicula", Pelicula.class);
		p2.setTitulo("nemo");
		p2.setAnio(2000);
		p2.getDirector().setNombre("EL puto nemopez");
		p2.getDirector().setEdad(5);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
		
		Avion a1 = context.getBean("avion1", Avion.class);
		
		System.out.println(a1);
		
		
	}

}