package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import demo.modelo.entidad.Empleado;
import demo.modelo.entidad.Equipo;

@SpringBootApplication
@ImportResource("classpath:beans.xml") //Para el ejercicio2: importar .xml

public class CarlosGarciaGinerApplication {
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = SpringApplication.run(CarlosGarciaGinerApplication.class, args);
		///////////////
		//EJERCICIO1://
		//////////////
		System.out.println("\nEJERCICIO1: \n");
		Empleado e1 = context.getBean("empleado", Empleado.class);
		e1.setNombre("Pepe");
		e1.setCompania("Deloitte");
		e1.getNomina().setFecha("01/01/2001");
		e1.getNomina().setSalario(2500);
		
		Empleado e2 = context.getBean("empleado", Empleado.class);
		e2.setNombre("Juan");
		e2.setCompania("Accentur");
		e2.getNomina().setFecha("30/03/2003");
		e2.getNomina().setSalario(1500);
		
		System.out.println("Empleado1");
		System.out.println(e1);
		System.out.println("Empleado2");
		System.out.println(e2);
		
		///////////////
		//EJERCICIO2//
		//////////////
		
		System.out.println("\nEJERCICIO2: \n");
		
		Equipo eq1 = context.getBean("equipo1", Equipo.class);
		Equipo eq2 = context.getBean("equipo2", Equipo.class);
		System.out.println("Equipo1");
		System.out.println(eq1);
		System.out.println("equipo2");
		System.out.println(eq2);
		
	}

}
