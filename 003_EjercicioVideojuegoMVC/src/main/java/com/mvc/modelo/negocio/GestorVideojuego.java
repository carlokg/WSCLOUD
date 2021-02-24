package com.mvc.modelo.negocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.modelo.entidad.Videojuego;
import com.mvc.modelo.persistencia.DaoVideojuego;

@Service
public class GestorVideojuego {
	
	@Autowired
	private DaoVideojuego daoVideojuego;
	
	public List<Videojuego> listaVideojuegos() {
		return daoVideojuego.findAll();
	}

	public Videojuego FindVideojuegoID(int id) {
		Optional<Videojuego> oVideojuego = daoVideojuego.findById(id);

		if (oVideojuego.isPresent()) {
			return oVideojuego.get();
		} else {
			return null;
		}
	}
}
