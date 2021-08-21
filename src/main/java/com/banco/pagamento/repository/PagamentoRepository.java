package com.banco.pagamento.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.banco.pagamento.model.Pagamento;

public interface PagamentoRepository extends MongoRepository<Pagamento, String> {

	@Query("{ 'cpf' : ?0 }")
	Optional<Pagamento> findByCpf(String cpf);
}
