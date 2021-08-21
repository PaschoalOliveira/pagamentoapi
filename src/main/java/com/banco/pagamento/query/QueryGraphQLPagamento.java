package com.banco.pagamento.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.banco.pagamento.model.Pagamento;
import com.banco.pagamento.service.PagamentoService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class QueryGraphQLPagamento implements GraphQLQueryResolver {

	@Autowired
	PagamentoService pagamentoService;
	
	public String helloWorld() {
		return "Hello World";
	}
	
	public Pagamento pagamento(String cpf) {
		return pagamentoService.findByCpf(cpf);
	}
	
	public List<Pagamento> pagamentos() {
		return pagamentoService.findAll();
	}
}
