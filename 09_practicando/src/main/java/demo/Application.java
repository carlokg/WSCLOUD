package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import demo.modelo.entidad.Email;
import demo.modelo.entidad.Libro;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Application {

	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		
		Email e1 = context.getBean("email", Email.class);
		e1.setId(1);
		e1.setDestinatario("Juan");
		e1.setRemitente("Pablo");
		System.out.println(e1);
		
		Email e2 = context.getBean("email2", Email.class);
		Email e3 = context.getBean("email3", Email.class);
		
		System.out.println(e2);
		System.out.println(e3);
		
		Libro l1 = context.getBean("libro", Libro.class);
		
		l1.setIsbn("111111");
		l1.setEditorial("Anaya");
		l1.getAutor().setId(3);
		l1.getAutor().setEdad(33);
		l1.getAutor().setNombre("Cervantes");
		System.out.println(l1);
		
		
		
		Libro l2 = context.getBean("libro2", Libro.class);
		
		System.out.println(l2);
		
		
		Libro l3 = context.getBean("libro", Libro.class);
		
		l3.setIsbn("111111");
		l3.setEditorial("Anaya");
		l3.getAutor().setId(7);
		l3.getAutor().setEdad(33);
		l3.getAutor().setNombre("Rigo-Berto");
		System.out.println(l3);
		
	}

}
