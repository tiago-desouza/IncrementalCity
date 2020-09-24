package com.tssouza.incrementalcity.repository;

import org.springframework.data.repository.CrudRepository;

import com.tssouza.incrementalcity.model.Cidade;

public interface CidadeRepository extends CrudRepository<Cidade, String>{

}
