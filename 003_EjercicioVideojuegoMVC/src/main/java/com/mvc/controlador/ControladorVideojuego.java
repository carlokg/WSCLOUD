package com.mvc.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.modelo.entidad.Videojuego;
import com.mvc.modelo.negocio.GestorVideojuego;

@Controller
public class ControladorVideojuego {

	@Autowired
	private GestorVideojuego gestorVideojuego;

	
	@GetMapping("buscarVideojuego")
	public String FindVideojuego(@RequestParam("id_videojuego") int id, Model model) {
		Videojuego v = gestorVideojuego.FindVideojuegoID(id);

		System.out.println("\n" + v);
		
			model.addAttribute("videojuego", v);
			return "resultado";
		
	}
	
	
}
