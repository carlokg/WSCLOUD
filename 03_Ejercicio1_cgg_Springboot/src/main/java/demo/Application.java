package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import demo.modelo.entidad.Autor;
import demo.modelo.entidad.Email;
import demo.modelo.entidad.Libro;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Application {
	
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		
		Email e = context.getBean("email", Email.class);
		e.setId(1);
		e.setDestinatario("Pepe");
		e.setRemitente("Juan");
		System.out.println(e);
		
		
		Email e2 = context.getBean("email1", Email.class);
		Email e3 = context.getBean("email2", Email.class);
		
		System.out.println(e2);
		System.out.println(e3);
		
		Autor a1 = context.getBean("autor", Autor.class);
		a1.setId(1);
		a1.setNombre("Jaimito");
		a1.setEdad(30);
		
		Libro l1 = context.getBean("libro",Libro.class);
		
		l1.setIsbn("11111");
		l1.setEditorial("Anaya");
		l1.setAutor(a1);
		
		System.out.println(l1);
		
		Libro l2 = context.getBean("libro2", Libro.class);
		System.out.println(l2);
		
	}

}
