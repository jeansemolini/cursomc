package com.jeansemolini.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeansemolini.cursomc.domain.Pedido;
import com.jeansemolini.cursomc.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoResource {

	@Autowired
	private PedidoService service;

	@GetMapping("/{id}")
	private ResponseEntity<?> find(@PathVariable Integer id){
		Pedido obj = service.buscar(id);

		return ResponseEntity.ok().body(obj);

	}

}
