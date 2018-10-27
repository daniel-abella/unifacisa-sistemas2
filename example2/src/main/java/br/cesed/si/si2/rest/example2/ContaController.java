package br.cesed.si.si2.rest.example2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContaController {

	@RequestMapping(value = "/conta", method = RequestMethod.GET)
	public String listarContas() {
		//iria ao BD
		return "todas as contas cadastradas";
	}
	
}
