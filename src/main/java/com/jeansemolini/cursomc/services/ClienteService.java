package com.jeansemolini.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeansemolini.cursomc.domain.Cliente;
import com.jeansemolini.cursomc.repositories.ClienteRepository;
import com.jeansemolini.cursomc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id){
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + " Tipo: " + Cliente.class.getName()));
	}


}
