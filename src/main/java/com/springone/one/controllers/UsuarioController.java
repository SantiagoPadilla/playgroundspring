package com.springone.one.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springone.one.dao.UsuarioDao;
import com.springone.one.models.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@RequestMapping(value = "api/usuario/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Lucas");
		usuario.setApellido("Moy");
		usuario.setEmail("lucasmoy@gmail.com");
		usuario.setTelefono("666242325");
		
		return usuario;
	}
	
	@RequestMapping(value = "api/usuarios")
	public List<Usuario> getUsuarios() {
		return usuarioDao.getUsuarios();
	}


}
