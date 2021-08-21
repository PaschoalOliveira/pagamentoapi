package com.banco.pagamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.pagamento.model.Pagamento;
import com.banco.pagamento.repository.PagamentoRepository;

@Service
public class PagamentoService {
 
    @Autowired
    private PagamentoRepository pagamentoRepository;
 
    public void salvar(String cpf, Double valor) {
        pagamentoRepository.save(new Pagamento(cpf, valor));
    }
 
    public List<Pagamento> findAll() {
       return pagamentoRepository.findAll();
    }
 
    public Pagamento findById(String id) {
    	id = "ObjectId('" + id + "')";
        return pagamentoRepository.findById(id).get();
    }
    
    public Pagamento findByCpf(String cpf) {
        return pagamentoRepository.findByCpf(cpf).get();
    }
 
    public void delete(String id) {
        pagamentoRepository.deleteById(id);
    }
 
}
