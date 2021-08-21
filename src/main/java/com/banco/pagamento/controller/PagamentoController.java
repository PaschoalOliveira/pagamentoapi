package com.banco.pagamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.pagamento.model.Pagamento;
import com.banco.pagamento.service.PagamentoService;

@RestController
@RequestMapping("/api/v1/pagamentos")
public class PagamentoController {

	@Autowired
	PagamentoService pagamentoService;
	
	@GetMapping
	public List<Pagamento> findAll() {
		return pagamentoService.findAll();
	}
}
