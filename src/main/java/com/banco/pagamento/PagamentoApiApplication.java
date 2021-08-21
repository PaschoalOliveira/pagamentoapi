package com.banco.pagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.banco.pagamento.repository.PagamentoRepository;

@SpringBootApplication
@EnableMongoRepositories
public class PagamentoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagamentoApiApplication.class, args);
	}

}
