package com.mvc.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.modelo.entidad.Usuario;
import com.mvc.modelo.entidad.Videojuego;
import com.mvc.modelo.negocio.GestorUsuario;
import com.mvc.modelo.negocio.GestorVideojuego;

@Controller
public class ControladorUsuario {
	
	@Autowired
	private GestorUsuario gestorUsuario;
	
	@Autowired
	private GestorVideojuego gestorVideojuego;
	
	@PostMapping("doLogin")
	public String logarse(
			@RequestParam("nombre_usuario") String nombre,
			@RequestParam("pass") String password,
			Model model) {
		
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		
		boolean validado = gestorUsuario.validarUsuario(usuario);
		
		if(validado) {
			model.addAttribute("nombreUsuario", nombre);
			List<Videojuego> listaV = gestorVideojuego.listaVideojuegos();
			model.addAttribute("lista", listaV);
			
			
			return "inicio";
		}else {
			return "errorlogin";
		}
	}
}
