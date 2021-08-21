package com.banco.pagamento.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Pagamento {

	@Id
	private String id;
	
	private String cpf;
	private Double valor;
	
	public Pagamento(String cpf, Double valor) {
        this.setCpf(cpf);
        this.setValor(valor);
	}
}
