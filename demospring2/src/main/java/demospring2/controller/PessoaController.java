package demospring2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import demospring2.service.PessoaService;

@Controller
public
class PessoaController {
	private PessoaService servico;
	
	@GetMapping
	public ResponseEntity<String> name() {
		return null;
	}
}