package br.com.jean.padroes_proj_spring.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.jean.padroes_proj_spring.model.entity.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String>{

}
