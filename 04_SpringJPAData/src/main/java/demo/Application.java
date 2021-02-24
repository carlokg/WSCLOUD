package demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Coche;
import demo.modelo.persistencia.DaoCoche;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		DaoCoche daoCoche = context.getBean("daoCoche", DaoCoche.class);
		
		Coche coche = new Coche();
		coche.setMatricula("CMD-3456");
		coche.setMarca("Ferrari");
		coche.setPotencia(1100);
		
		//persisitimos el coche en BBDD
		daoCoche.save(coche);
		
		Coche c2 = new Coche();
		c2.setId(1);
		c2.setMatricula("FDR-5555");
		c2.setMarca("Ferrari");
		c2.setPotencia(1101);
		
		daoCoche.save(c2);
		
		Coche c3 = daoCoche.findById(1).get();
		System.out.println(c3);
		
		Optional<Coche> cocheOptional = daoCoche.findById(2);
		if(cocheOptional.isPresent()) {
			System.out.println("existe el coche");
			System.out.println(cocheOptional.get());
			
		}else {
			System.out.println("El coche no existe");
		}
		List<Coche> listaCoches = daoCoche.findAll();
		System.out.println(listaCoches);
		
	}

}
